import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LoginFormPage {

    SelenideElement emailInput = Selenide.$("#signinEmail");
    SelenideElement passwordInput = Selenide.$("#signinPassword");
    SelenideElement loginBtn = Selenide.$x("//*[text()='Login']");

    public GaragePage authorise(String email, String password){
       emailInput.sendKeys(email);
       passwordInput.sendKeys(password);
       loginBtn.click();
       return new GaragePage();
    }
}
