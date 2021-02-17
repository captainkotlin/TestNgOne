package tmp.page;

import utils.AbstractPage;

import static com.codeborne.selenide.Selenide.$;

public class AddRemovePage extends AbstractPage<AddRemovePage>
{
    public AddRemovePage clickAddRemoveButton()
    {
        $(".example > button:nth-child(1)").click();
        return this;
    }
}
