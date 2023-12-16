import Utills.RestAssuredUtills;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class APIMethods {
    public static Response postAPI(Map<String, Object> payLoad)
    {
        String endPoint = (String) Base.dataFromJsonFile.get("postEndPoint");
        return RestAssuredUtills.perfromPost(endPoint,payLoad,new HashMap<>());

    }
}
