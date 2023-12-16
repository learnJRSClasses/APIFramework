import Utills.jsonUtill;

import java.io.IOException;
import java.util.Map;

public class Base {
    public static Map<String, Object> dataFromJsonFile ;
    static{
        try {
             dataFromJsonFile = jsonUtill.getPayload("/endpoints.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
