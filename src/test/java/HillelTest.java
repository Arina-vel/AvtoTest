import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HillelTest {

    @Test
    public void homePageTest() {
        WebDriverManager.chromedriver().setup();

        Selenide.open("https://next.privat24.ua/money-transfer/card");

        Selenide.$("[data-qa-node='numberdebitSource']").sendKeys("4552331448138217");
        Selenide.$("[data-qa-node='expiredebitSource']").sendKeys("0425");
        Selenide.$("[data-qa-node='cvvdebitSource']").sendKeys("926");
        Selenide.$("[data-qa-node='firstNamedebitSource']").sendKeys("ivan");
        Selenide.$("[data-qa-node='lastNamedebitSource']").click();
        Selenide.$("[data-qa-node='lastNamedebitSource']").sendKeys("ivanov");

        Selenide.$("[data-qa-node='numberreceiver']").click();
        Selenide.$("[data-qa-node='numberreceiver']").sendKeys("4004159115449003");
        Selenide.$("[data-qa-node='firstNamereceiver']").click();
        Selenide.$("[data-qa-node='firstNamereceiver']").sendKeys("taras");
        Selenide.$("[data-qa-node='firstNamereceiver']").click();
        Selenide.$("[data-qa-node='lastNamereceiver']").sendKeys("tarasov");

        Selenide.$("[data-qa-node='amount']").click();
        Selenide.$("[data-qa-node='amount']").sendKeys("123");
        Selenide.$("[data-qa-node='currency']").click();
        Selenide.$("[data-qa-value='USD']").click();

        Selenide.$("[class='sc-VigVT hcHAAV']").click();

        //проверка

        Selenide.$("[data-qa-node='payer-card']").shouldHave(Condition.text("4552 3314 4813 8217"));
        Selenide.$("[data-qa-node='payer-amount']").shouldHave(Condition.text("123 USD"));
        Selenide.$("[data-qa-node='payer-currency']").shouldHave(Condition.text("5.41 USD"));
        Selenide.$("[data-qa-node='receiver-name']").shouldHave(Condition.text("TARAS TARASOV"));
        Selenide.$("[data-qa-node='receiver-card']").shouldHave(Condition.text("4004 1591 1544 9003"));
        Selenide.$("[data-qa-node='receiver-amount']").shouldHave(Condition.text("123 USD"));
        Selenide.$("[data-qa-node='receiver-currency']").shouldHave(Condition.text("0 USD"));
        Selenide.$("[class='sc-chPdSV iiqwfv']").shouldHave(Condition.text("128.41 USD"));

        Selenide.$("[data-qa-node='submit']").click();

        }
}