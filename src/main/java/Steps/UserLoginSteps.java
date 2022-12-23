package Steps;

import Helpers.Constants;
import Pages.UserLoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.PressTab;

import static com.codeborne.selenide.Selenide.*;

public class UserLoginSteps {


    public UserLoginSteps OpenWebsite() {
        open(Constants.baseURL);
        return this;
    }

    public UserLoginSteps ClickLoginButton() {
        UserLoginPage userLoginPage = new UserLoginPage();

        userLoginPage.loginButton.click();

        return this;
    }

    public UserLoginSteps EnterEmail(String email) {

        UserLoginPage userLoginPage = new UserLoginPage();
        userLoginPage.emailInput.sendKeys(email);

        return this;
    }

    public UserLoginSteps EnterPassword(String password){

        UserLoginPage userLoginPage = new UserLoginPage();
        userLoginPage.passwordInput.sendKeys(password);

        return this;
    }

    public UserLoginSteps ClickAuthButton(){

        UserLoginPage userLoginPage = new UserLoginPage();
        userLoginPage.authButton.shouldBe(Condition.visible).click();

        return this;
    }

    public UserLoginSteps WaitAuthInfo() {

        UserLoginPage userLoginPage = new UserLoginPage();
        userLoginPage.authInfo.shouldBe(Condition.visible);
        return  this;
    }



}
