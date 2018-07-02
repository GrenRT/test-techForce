package mailru.pages;

import com.codeborne.selenide.SelenideElement;
import mailru.model.MailData;
import org.openqa.selenium.support.FindBy;

@FindBy(name = "Compose")
public class ComposeForm {

    @FindBy(css = "textarea[data-original-name='To']")
    SelenideElement to;

    @FindBy(name = "Subject")
    SelenideElement theme;

    @FindBy(name = "Filedata")
    SelenideElement addAttache;

    public void fill(MailData mail) {
        if (mail.getTo() != null)
            to.setValue(mail.getTo());
        if (mail.getTheme() != null)
            theme.setValue(mail.getTheme());
        if (mail.getAttache() != null)
            addAttache.uploadFile(mail.getAttache());

    }
}
