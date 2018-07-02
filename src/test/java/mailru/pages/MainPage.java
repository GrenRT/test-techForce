package mailru.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(css = "a[data-title='Написать письмо (N)']")
    SelenideElement createNewMail;
}
