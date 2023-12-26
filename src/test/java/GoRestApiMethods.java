import Payloads.goRest_Payload;
import Utills.RestAssuredUtills;
import io.restassured.response.Response;
import pojo.GoRest;

import java.util.HashMap;
import java.util.Map;

public class GoRestApiMethods {
    public static String GoRest_baseURL = (String) Base.dataFromJsonFile.get("GoRest_baseURL") ;
    public static Response testGetMethod()
    {
        String endPoint_temp = (String) Base.dataFromJsonFile.get("GoRest_getEndPoint") ;
        String endpoint = GoRest_baseURL+endPoint_temp ;
        return RestAssuredUtills.perfromget(endpoint);

    }

    public static Response testGetMethodWithUserID(String id)
    {
        String endPoint_temp = (String) Base.dataFromJsonFile.get("GoRest_getEndPoint") ;
        String endpoint = GoRest_baseURL+endPoint_temp+"/"+id ;
        return RestAssuredUtills.perfromget(endpoint);

    }



    public static Response testPostMethod(GoRest goRest_payLoad)
    {
        String endPoint_temp = (String) Base.dataFromJsonFile.get("GoRest_postEndPoint") ;
        String endpoint = GoRest_baseURL+endPoint_temp;
        return RestAssuredUtills.perfromPost(endpoint, goRest_payLoad, Base.headers);

    }

    public static Response testPostMethod(Map<String, Object> updatPayLoadGoRest_1)
    {
        String endPoint_temp = (String) Base.dataFromJsonFile.get("GoRest_postEndPoint") ;
        String endpoint = GoRest_baseURL+endPoint_temp;
        return RestAssuredUtills.perfromPost(endpoint, updatPayLoadGoRest_1, Base.headers);

    }


    public static Response testPatchMethod(String id ,Map<String, Object> goRest_payLoad)
    {
        String endPoint_temp = (String) Base.dataFromJsonFile.get("GoRest_patchEndPoint") ;
        String endpoint = GoRest_baseURL+endPoint_temp+"/"+id;
        return RestAssuredUtills.perfromPatch(endpoint, goRest_payLoad, Base.headers);

    }
    public static Response testPatchMethod(String id , GoRest goRest_payLoad)
    {
        String endPoint_temp = (String) Base.dataFromJsonFile.get("GoRest_patchEndPoint") ;
        String endpoint = GoRest_baseURL+endPoint_temp+"/"+id;
        return RestAssuredUtills.perfromPatch(endpoint, goRest_payLoad, Base.headers);

    }
}
