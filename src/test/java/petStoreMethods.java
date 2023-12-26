import Utills.RestAssuredUtills;
import io.restassured.response.Response;
import net.datafaker.Faker;
import pojo.GoRest;

import java.util.Map;

public class petStoreMethods extends Base{
    public static Faker faker = new Faker() ;
    public static Response createUser(Object payLoad)
    {
        String endpoint = (String) Base.dataFromJsonFile.get("baseURL_User") ;

        return RestAssuredUtills.perfromPost(endpoint,payLoad,headersWithoutJWT);

    }

    public static Response createUser()
    {
        String endpoint = (String) Base.dataFromJsonFile.get("baseURL_User") ;
        Map<String , Object>  payLoad = Base.dataFromJsonFile_PetStore ;
        payLoad.put("email", faker.internet().emailAddress()) ;

        return RestAssuredUtills.perfromPost(endpoint,payLoad,headersWithoutJWT);

    }
}
