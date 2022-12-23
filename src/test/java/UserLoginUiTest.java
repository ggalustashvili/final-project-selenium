import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.MatcherAssert.assertThat;

import Helpers.BaseTest;
import Helpers.Constants;
import Pages.HolidayPage;
import Pages.RegistrationPage;
import Pages.UserLoginPage;
import Steps.HolidaySteps;
import Steps.RegistrationSteps;
import Steps.UserLoginSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class UserLoginUiTest extends BaseTest {


    @Test(priority = 1)
    public void Test1() {
        UserLoginPage userLoginPage = new UserLoginPage();
        UserLoginSteps userLoginSteps = new UserLoginSteps();

        userLoginSteps.OpenWebsite()
                .ClickLoginButton()
                .EnterEmail("daada@gmail.com")
                .EnterPassword("hihi21212121")
                .ClickAuthButton()
                .WaitAuthInfo();

        assertThat(userLoginPage.getAuthInfo().getText(), containsString("მეილი ან პაროლი არასწორია, თუ დაგავიწყდათ პაროლი,გთხოვთ ისარგებლოთ პაროლის აღდგენის ფუნქციით!"));
        assertThat(userLoginPage.getPasswordInput().getText(), equalTo(""));

    }

    @Test(priority = 2)
    public void  Test2(){
        RegistrationPage registrationPage = new RegistrationPage();
        RegistrationSteps registrationSteps = new RegistrationSteps();

        registrationSteps.OpenRegistrationPage()
                .SwitchToLegalPersonTab();

        registrationPage.getFormRequiredFieldMessage().shouldBe(visible);
        registrationPage.getIsLegalSubscribedNewsletter().shouldBe(checked);

    }

    @Test(dependsOnMethods = "Test2" , priority = 3)
    public void Test3(){
        RegistrationPage registrationPage = new RegistrationPage();
        RegistrationSteps registrationSteps = new RegistrationSteps();

        registrationSteps.OpenRegistrationPage()
                .SwitchToLegalPersonTab()
                .SelectLegalForm()
                .FillPage()
                .AcceptTerms()
                .RegisterAction()
                .CheckForlegalInfoMassage();



        assertThat(registrationPage.getLegalInfoMassage().getText() ,equalTo("რეგისტრაციის დროს დაფიქსირდა შეცდომა!"));

    }

    @Test(priority = 4)
    public void Test4(){
        HolidayPage holidayPage = new HolidayPage();
        HolidaySteps holidaySteps = new HolidaySteps();

        holidaySteps.OpenPage()
                .NavigateToHolidayPage()
                .SetHolidayPriceRange( 170 , 180 )
                .FilterTheHolidays();
    }



}
