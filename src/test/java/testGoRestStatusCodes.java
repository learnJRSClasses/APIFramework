import Payloads.PostpayLoad;
import Payloads.goRest_Payload;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.GoRest;

import java.util.Map;

public class testGoRestStatusCodes extends Base{
    @Test
    public void validateGetStatusCode()
    {
        Response res = GoRestApiMethods.testGetMethod();
        Assert.assertEquals(res.getStatusCode(), 200);
    }


    @Test
    public void validateGetwithUserIDStatusCode()
    {
        Response res = GoRestApiMethods.testGetMethodWithUserID("5835885");
        Assert.assertEquals(res.getStatusCode(), 404);
    }

    @Test
    public void validateCreateUserStatusCode()
    {
        Map<String, Object> goRest_payLoad = goRest_Payload.payLoadGoRest("amitabh", "male", "amit12e3@amitabh.com", "Active") ;
        Response res = GoRestApiMethods.testPostMethod(goRest_payLoad);
        Assert.assertEquals(res.getStatusLine(), "Resource not found");
    }


    @Test
    public void validateCreateUserStatusCode2()
    {
        GoRest goRest_payLoad = goRest_Payload.getPayloadForGoRest();
        Response res = GoRestApiMethods.testPostMethod(goRest_payLoad);
        Assert.assertEquals(res.getStatusCode(), 201);
    }

    @Test
    public void validateUpdateUserStatusCode()
    {
        Map<String, Object> goRest_payLoad = goRest_Payload.updatPayLoadGoRest("amitabh1", "amit@amitabh.com", "Active", "male") ;
        Response res = GoRestApiMethods.testPatchMethod ("5835885" , goRest_payLoad);
        Assert.assertEquals(res.getStatusCode(), 200);
    }

    @Test
    public void validateUpdateUserStatusCode2()
    {
        GoRest goRest_payLoad = goRest_Payload.getPayloadForGoRest();
        Response res = GoRestApiMethods.testPatchMethod ("5835885" , goRest_payLoad);
        Assert.assertEquals(res.getStatusCode(), 404);
    }
    @Test
    public void validateUpdateUserStatusCode_1()
    {
        Map<String, Object> goRest_payLoad = goRest_Payload.updatPayLoadGoRest_1() ;
        Response res = GoRestApiMethods.testPostMethod(goRest_payLoad);
        Assert.assertEquals(res.getStatusCode(), 201);
    }

    @Test
    public void validateCreate()
    {
        Map<String, Object> goRest_payLoad = goRest_Payload.updatPayLoadGoRest_Faker() ;
        Response res = GoRestApiMethods.testPostMethod(goRest_payLoad) ;
        Assert.assertEquals(res.getStatusCode(), 201);
    }

    @Test
    public void validateCreatePOST()
    {
        Map<String, Object> goRest_payLoad = goRest_Payload.updatPayLoadGoRest_Faker() ;
        Response res = GoRestApiMethods.testPostMethod(goRest_payLoad) ;
        Assert.assertEquals(res.getStatusCode(), 201);
    }

}
