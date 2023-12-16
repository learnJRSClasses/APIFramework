import Utills.RestAssuredUtills;
import io.restassured.response.Response;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class APIMethods {
    public static Response postAPI(Map<String, Object> payLoad)
    {
        String baseURL = (String) Base.dataFromJsonFile.get("baseURl") ;
        String endPoint_temp = (String) Base.dataFromJsonFile.get("postEndPoint") ;
        String endpoint = baseURL+endPoint_temp ;
        return RestAssuredUtills.perfromPost(endpoint,payLoad,new HashMap<>());

    }

    public static Response getAPI()
    {
        String baseURL = (String) Base.dataFromJsonFile.get("baseURL1") ;
        String endPoint_temp = (String) Base.dataFromJsonFile.get("getEndPoint") ;
        String endpoint = baseURL+endPoint_temp ;
        System.out.println(endpoint);
        return RestAssuredUtills.perfromget(endpoint) ;
    }

    public static Response putAPI(Map<String, Object> payLoad)
    {
        String baseURL = (String) Base.dataFromJsonFile.get("baseURl") ;
        String endPoint_temp = (String) Base.dataFromJsonFile.get("putEndPoint") ;
        String endpoint = baseURL+endPoint_temp ;
        return RestAssuredUtills.perfromPut(endpoint , payLoad, new HashMap<>());


    }

}
