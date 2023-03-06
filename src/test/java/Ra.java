import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Ra {
    @Test
    public void test(){
        Response response= RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        int n=response.getStatusCode();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
