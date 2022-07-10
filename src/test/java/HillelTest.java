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
    public void canLogin() {
        WebDriverManager.chromedriver().setup();

        HomePage homePage = new HomePage();
        homePage.openPage();

        LoginFormPage loginFormPage = homePage.header.openLoginModal();
        GaragePage garagePage = loginFormPage.authorise(
                "orehokolka@ukr.net",
                "NF7e21dXNZzwB3D");

        garagePage.header.userMenu.shouldBe(Condition.visible);
        garagePage.sideMenu.garageIcon.shouldBe(Condition.visible);
        garagePage.alertSuccess.shouldBe(Condition.visible);
    }

    @Test
    public void canLogoutHeader() {
        WebDriverManager.chromedriver().setup();

        HomePage homePage = new HomePage();
        homePage.openPage();

        LoginFormPage loginFormPage = homePage.header.openLoginModal();
        GaragePage garagePage = loginFormPage.authorise(
                "orehokolka@ukr.net",
                "NF7e21dXNZzwB3D");

        DropdownMenuPage dropdownMenuPage = homePage.header.openDropdownMenu();
        dropdownMenuPage.LogoutBtn.click();

        homePage.header.signInBtn.shouldBe(Condition.visible);
        homePage.header.guestLogin.shouldBe(Condition.visible);
        homePage.SignUpBTN.shouldBe(Condition.visible);

    }


    @Test
    public void canLogOutSideMenu() {
        WebDriverManager.chromedriver().setup();

        HomePage homePage = new HomePage();
        homePage.openPage();

        LoginFormPage loginFormPage = homePage.header.openLoginModal();
        GaragePage garagePage = loginFormPage.authorise(
                "orehokolka@ukr.net",
                "NF7e21dXNZzwB3D");

        SideMenu sideMenu = new SideMenu();
        sideMenu.LogOutIcon.click();

        homePage.header.signInBtn.shouldBe(Condition.visible);
        homePage.header.guestLogin.shouldBe(Condition.visible);
        homePage.SignUpBTN.shouldBe(Condition.visible);

    }


    @Test
    public void canAddCar() {
        WebDriverManager.chromedriver().setup();

        HomePage homePage = new HomePage();
        homePage.openPage();

        LoginFormPage loginFormPage = homePage.header.openLoginModal();
        GaragePage garagePage = loginFormPage.authorise(
                "orehokolka@ukr.net",
                "NF7e21dXNZzwB3D");

        GaragePage garagePage1 = new GaragePage();
        garagePage.AddCarBtn.click();

        AddCarFormPage addCarFormPage = new AddCarFormPage();
        addCarFormPage.MileageInput.sendKeys(
                "1"
        );
        addCarFormPage.AddBtn.click();

        garagePage.GarageName.shouldBe(Condition.visible);
        garagePage.NameAuto.shouldHave(Condition.text("Audi TT"));
        garagePage.MileageUpdate.shouldBe(Condition.visible);

    }

}



