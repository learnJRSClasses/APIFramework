import com.fasterxml.jackson.core.util.RequestPayload;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class testMethods extends Base{
    @Test
    public void testCase1()
    {
        Map<String, Object> payLoad = PostpayLoad.setpayLoadAsMap("Adam1", "Leader");
        Response res = APIMethods.postAPI(payLoad);
        Assert.assertEquals(res.getStatusCode(), 201);
    }
}
