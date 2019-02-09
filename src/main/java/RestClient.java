import groovy.json.JsonParser;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import jdk.nashorn.api.scripting.JSObject;
import jdk.nashorn.internal.parser.JSONParser;
import netscape.javascript.JSException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Iterator;

public class RestClient {

    @Test
    public void getRsponseCode(){
        Response response = get("https://reqres.in/api/users?page=2");
        int responseCode=response.getStatusCode();
        //System.out.println("Response Code is"+ responseCode);
        Assert.assertEquals(responseCode,200);

    }

    @Test
    public void testResponseBody(){
        Response response = get("https://reqres.in/api/users?page=2");
        String s = response.asString();
        System.out.println("Body is"+s);
        System.out.println("ResponseTime"+response.getTime());
        System.out.println("Body=>"+response.getBody().prettyPrint());




    }
    }
