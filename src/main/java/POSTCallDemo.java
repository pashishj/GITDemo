import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POSTCallDemo {

    @Test
    public void testPostcall() throws ParseException {

        // Preparing requests
        RequestSpecification request = RestAssured.given();
        //add header data to reqquest
        request.header("Content-Type","application/json");
        //add body data to request
        JSONObject jobj=new JSONObject();
        jobj.put("email","sydney@fife");
        jobj.put("password","pistol");
        request.body(jobj.toJSONString());
        Response post = request.post("https://reqres.in/api/users");
        int respcode=post.getStatusCode();
       Assert.assertEquals(respcode,201);

    }
}
