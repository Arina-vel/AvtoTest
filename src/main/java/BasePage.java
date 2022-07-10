import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class BasePage {


    //header
    HeaderPage header = new HeaderPage();

    // body
    SelenideElement alertSuccess = Selenide.$(".alert-success");

    //footer

}
