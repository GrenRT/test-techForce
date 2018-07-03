package techForce.mailru.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import techForce.mailru.model.MailData;

import static com.codeborne.selenide.Condition.exist;

@FindBy(name = "Compose")
public class ComposeForm {

    @FindBy(css = "textarea[data-original-name='To']")
    private SelenideElement to;

    @FindBy(name = "Subject")
    private SelenideElement theme;

    @FindBy(name = "Filedata")
    private SelenideElement addAttache;

    @FindBy(css = "div[data-name='send']")
    private SelenideElement send;

    public ComposeForm fill(MailData mail) {
        if (mail.getTo() != null)
            to.setValue(mail.getTo());
        if (mail.getTheme() != null)
            theme.setValue(mail.getTheme());
        if (mail.getAttache() != null)
            addAttache.uploadFile(mail.getAttache());
        return this;
    }

    public void sendMail() {
        send.click();
        send.shouldNot(exist);
    }
}
