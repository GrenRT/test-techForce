package techForce.mailru.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    @FindBy(css = "a[data-title='Написать письмо (N)']")
    SelenideElement createNewMail;

    public ComposeForm clickCreateNewMail() {
        createNewMail.click();
        return page(ComposeForm.class);
    }
}
