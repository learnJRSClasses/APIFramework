import Utills.jsonUtill;

import java.io.IOException;
import java.util.Map;

public class Base {
    public static Map<String, Object> dataFromJsonFile ;


    static{
        try {
             dataFromJsonFile = jsonUtill.getEndPoint("/endpoints.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    // Static bloc will create one Map with the help of json file - it will get the value with help of given key
    }


}
