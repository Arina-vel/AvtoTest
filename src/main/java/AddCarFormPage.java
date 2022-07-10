import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class AddCarFormPage {

    SelenideElement MileageInput = Selenide.$("[id='addCarMileage']");
    SelenideElement AddBtn = Selenide.$x("//*[text()='Add']");

    public AddCarFormPage openAddCarForm(String mileage) {
        MileageInput.sendKeys(mileage);
        AddBtn.click();
        return new AddCarFormPage();
    }

    //Selenide.$("[id='addCarMileage']").click();
    //Selenide.$("[id='addCarMileage']").sendKeys("1");
    //Selenide.$x("//*[text()='Add']").click();
}
