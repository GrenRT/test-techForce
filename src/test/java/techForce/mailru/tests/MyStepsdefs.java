package techForce.mailru.tests;

import com.codeborne.selenide.Selenide;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import techForce.mailru.model.MailData;
import techForce.mailru.pages.ComposeForm;
import techForce.mailru.pages.MainPage;
import techForce.mailru.pages.form.AuthForm;

import java.io.File;

public class MyStepsdefs {

    @Before
    public void setUp() {
        Selenide.open("https://e.mail.ru/messages/inbox/");
    }

    @Допустим("пользователь с логином \"([^\"]*)\" и паролем \"([^\"]*)\" вошел в систему")
    public void пользовательСЛогиномИПаролемВошелССистему(String login, String pass) {
        Selenide.open("https://e.mail.ru/messages/inbox/");
        AuthForm form = Selenide.page(AuthForm.class);
        form.login(login, pass);
        throw new PendingException();
    }

    @Дано("пользователь создает письмо с адресатом \"([^\"]*)\", темой \"([^\"]*)\" и вложением \"([^\"]*)\"")
    public void пользовательЗаполняетФормуПисьмаИПользовательПрикрепляетВложение(String to, String theme, String filePath) {
        MainPage main = Selenide.page(MainPage.class);
        main.clickCreateNewMail()
                .fill(new MailData().setTo(to).setTheme(theme).setAttache(new File(filePath)));
        throw new PendingException();
    }

    @Когда("пользователь отправляет письмо")
    public void пользовательОтправляетПисьмо() {
        ComposeForm composeForm = Selenide.page(ComposeForm.class);
        composeForm.sendMail();
        throw new PendingException();
    }

    @Тогда("письмо успешно отправлено")
    public void письмоУспешноОтправлено() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
