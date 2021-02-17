package tmp;


import lombok.SneakyThrows;
import org.testng.annotations.Test;
import tmp.page.AddRemovePage;
import utils.AbstractWebUiTest;

import static com.codeborne.selenide.Selenide.open;

public class MyTest extends AbstractWebUiTest<AddRemovePage>
{
    @Test
    @SneakyThrows
    public void test()
    {
        page = open("http://the-internet.herokuapp.com/add_remove_elements/", AddRemovePage.class);
        page.clickAddRemoveButton();
    }
}
