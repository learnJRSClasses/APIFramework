import Utills.jsonUtill;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Base {
    public static Map<String, Object> dataFromJsonFile ;
    public static Map<String, Object> dataFromJsonFile_PetStore ;

    public static String jwt = "45bad2e8ff09ba33f6fd5c6460ec8076093492b4bd9892ef3c12f49f691a4fb9" ;
    public static Map<String, Object> headers ;
    public static Map<String, Object> headersWithoutJWT ;
    static{
        try {

             dataFromJsonFile = jsonUtill.getEndPoint("/endpoints.json");
            dataFromJsonFile_PetStore = jsonUtill.getEndPoint("/petStorePayload.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    // Static bloc will create one Map with the help of json file - it will get the value with help of given key

        headers = new HashMap<>();
        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Bearer "+jwt);

        headersWithoutJWT = new HashMap<>();
        headersWithoutJWT.put("Accept", "application/json");
        headersWithoutJWT.put("Content-Type", "application/json");

    }



}
