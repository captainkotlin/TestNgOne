package heroku;

import io.restassured.builder.RequestSpecBuilder;
import org.testng.annotations.BeforeTest;
import utils.AbstractWebApiTest;

public class AbstractHerokuTest extends AbstractWebApiTest
{
    @BeforeTest
    public static void beforeAll()
    {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://testpages.herokuapp.com")
                .setRelaxedHTTPSValidation()
                .build();
    }
}
