package mailru.pages.form;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

@FindBy(id = "auth")
public class AuthForm {

    @FindBy(id = "mailbox:login")
    private SelenideElement loginField;

    @FindBy(id = "mailbox:password")
    private SelenideElement passField;

    @FindBy(id = "mailbox:submit")
    private SelenideElement submit;

    public void login(String login, String pass) {
        loginField.setValue(login);
        passField.setValue(pass);
        submit.click();
    }
}

