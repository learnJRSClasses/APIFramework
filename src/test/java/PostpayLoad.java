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
}
