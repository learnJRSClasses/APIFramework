package Payloads;

import java.util.HashMap;
import java.util.Map;

public class PostpayLoad {
    public static String setpayLoad(String name , String job)
    {
        String body = "{\n" +
                "    \"name\": +name +,\n" +
                "    \"job\": +job \n" +
                "}";
        return body ;
    }

    public static Map<String, Object> setpayLoadAsMap(String name , String job)
    {
        Map<String, Object> body = new HashMap<>() ;
               body.put("name", name);
               body.put("job", job);

        return body ;
    }


    public static String getPayload(String name , String gender , String email, String status)
    {
        String str = "{\n" +
                "    \"name\": \"Vaiabha Rastogi 123\",\n" +
                "    \"gender\": \"male\",\n" +
                "    \"email\": \"vaibhav.rastogi02@jrs.com\",\n" +
                "    \"status\": \"active\"\n" +
                "}" ;

        String payload = "{\n" +
                "    \"name\": + +,\n" +
                "    \"gender\": \"male\",\n" +
                "    \"email\": \"vaibhav.rastogi02@jrs.com\",\n" +
                "    \"status\": \"active\"\n" +
                "}"  ;
        return payload ;
    }



    public static Map<String, Object> getPayloadfromMap(String name , String gender , String email, String status)
    {
        Map<String, Object> body = new HashMap<>() ;
        body.put("name" , name);
        body.put("gender" , gender);
        body.put("email" , email);
        body.put("status" , status);
        return body ;

    }

    public static Map<String, Object> getPayloadfromMapforReqRES(String name , String job)
    {
        Map<String, Object> body = new HashMap<>() ;
        body.put("name" , name);
        body.put("job" , job);

        return body ;

    }




}


// HTTP method - GET , POST .... -- Method
// end point --- json File
// Payload -- String
//headers
