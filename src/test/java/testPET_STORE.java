import Payloads.PetStorePayload;
import Payloads.goRest_Payload;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.PetStore;

import java.util.Map;

public class testPET_STORE {

    @Test
    public void testCreateuser()
    {
        Object payload = PetStorePayload.petStoreBody();
        Response res = petStoreMethods.createUser(payload) ;
        Assert.assertEquals(res.getStatusCode(), 200);

    }

    @Test
    public void testCreateuserwithUpdateMap()
    {
        Object payload = PetStorePayload.petStoreBody();
        Response res = petStoreMethods.createUser() ;
        Assert.assertEquals(res.getStatusCode(), 200);

    }
}
