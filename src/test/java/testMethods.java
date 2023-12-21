import Payloads.PostpayLoad;
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


    @Test
    public void testCase2()
    {Map<String, Object> payLoad = PostpayLoad.getPayloadfromMapforReqRES( "Shobhit" ,"QA Lead");
        Response res = APIMethods.postAPI( payLoad) ;
        Assert.assertEquals(res.getStatusCode(), 201);

    }

    @Test
    public void testCase3()
    {
        Response res = APIMethods.getAPI();
        System.out.println(res.getStatusCode());


    }
}

// Test Case - Put req , payload , end point
// End point
//PayLoad
//headers