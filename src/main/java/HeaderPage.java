import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class HeaderPage{
    SelenideElement signInBtn = Selenide.$(".header_signin");
    SelenideElement userMenu = Selenide.$("#userNavDropdown");
    SelenideElement guestLogin = Selenide.$("[class='header-link -guest']");



    public LoginFormPage openLoginModal() {
        signInBtn.click();
        return new LoginFormPage();
    }

    public DropdownMenuPage openDropdownMenu(){
        userMenu.click();
        return new DropdownMenuPage();
    }

}
