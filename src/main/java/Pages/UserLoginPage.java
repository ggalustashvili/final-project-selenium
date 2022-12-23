package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UserLoginPage {

    public SelenideElement loginButton = $(".swoop-login");
    public SelenideElement emailInput = $(".mail-input");
    public SelenideElement passwordInput = $("#feed-password");
    public SelenideElement authButton = $("#AuthBtn");

    public SelenideElement authInfo = $("#authInfo");

    public SelenideElement getLoginButton() {
        return loginButton;
    }

    public SelenideElement getEmailInput() {
        return emailInput;
    }

    public SelenideElement getPasswordInput() {

        return passwordInput;

    }

    public SelenideElement getAuthButton() {

        return authButton;

    }

    public SelenideElement getAuthInfo(){
        return authInfo;
    }

}
