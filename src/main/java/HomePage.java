import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class HomePage extends BasePage {

    public void openPage() {
        Selenide.open(
                "https://qauto.forstudy.space/",
                "",
                "guest",
                "welcome2qauto");
    }

    SelenideElement SignUpBTN = Selenide.$("[class='hero-descriptor_btn btn btn-primary']");
    //body for home page
}
