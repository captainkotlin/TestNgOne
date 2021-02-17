package heroku.fileupload;

import heroku.AbstractHerokuTest;
import heroku.fileupload.data.DataProvider;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class FileUploadTest extends AbstractHerokuTest
{
    @Test(dataProviderClass = DataProvider.class, dataProvider = DataProvider.NAME)
    @SneakyThrows
    public void fileUploadTest(String fileName)
    {
        var bytes = IOUtils.toByteArray(getClass().getResourceAsStream(fileName));
        given(requestSpec)
                .multiPart("filename", fileName, bytes)
                .expect()
                .statusCode(SC_OK)
                .when()
                .post("/uploads/fileprocessor");
    }
}
