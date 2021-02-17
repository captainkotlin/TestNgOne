package heroku.fileupload.data;

import io.github.sskorol.core.DataSupplier;
import lombok.Getter;
import utils.AbstractDataProvider;

import java.util.stream.Stream;

public class DataProvider extends AbstractDataProvider<String>
{
    public static final String NAME = "defaultName";

    @Override
    @DataSupplier(name = NAME)
    public Stream<String> getData()
    {
        return Stream.of("netstat.log", "testng.xml");
    }
}
