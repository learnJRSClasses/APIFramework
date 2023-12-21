package Payloads;

import java.util.HashMap;
import java.util.Map;

public class goRest_Payload {
    public static Map<String, Object> payLoadGoRest(String name , String gender, String email, String status)
    {
        Map<String, Object> body = new HashMap<>() ;
        body.put("name" , name);
        body.put("gender" , gender);
        body.put("email", email);
        body.put("status", status) ;

        return body ;

    }

    public static Map<String, Object> updatPayLoadGoRest(String name , String email, String status)
    {
        Map<String, Object> body = new HashMap<>() ;
        body.put("name" , name);
        body.put("email", email);
        body.put("status", status) ;

        return body ;

    }
}
