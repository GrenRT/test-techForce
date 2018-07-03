package techForce.mailru.tests;

import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Test;
import techForce.mailru.model.MailData;
import techForce.mailru.pages.MainPage;

import java.io.File;

public class TestFillMailForm {

    @Before
    public void setUp() {
        Selenide.open("https://e.mail.ru/messages/inbox/");
    }

    @Test
    public void fillMail() {
        MainPage main = Selenide.page(MainPage.class);

        main.clickCreateNewMail()
                .fill(new MailData().setTo("").setTheme("").setAttache(new File("")))
                .sendMail();
    }
}
