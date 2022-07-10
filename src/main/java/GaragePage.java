import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class GaragePage extends BasePage {

    //body for garage page
    SideMenu sideMenu = new SideMenu();

    SelenideElement AddCarBtn = Selenide.$x("//*[text()='Add car']");

    public AddCarFormPage openAddCarMolal() {
        AddCarBtn.click();
        return new AddCarFormPage();
    }

    SelenideElement GarageName = Selenide.$("[class='panel-page_heading d-flex justify-content-between']");
    SelenideElement NameAuto = Selenide.$("[class='car_name h2']");
    SelenideElement MileageUpdate = Selenide.$("[class='car_update-mileage']");

}
