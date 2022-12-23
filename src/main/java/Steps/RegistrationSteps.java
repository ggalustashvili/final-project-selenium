package Steps;

import Pages.RegistrationPage;
import com.codeborne.selenide.Condition;

public class RegistrationSteps {

    public RegistrationSteps OpenUserLoginPage(){

        UserLoginSteps userLoginSteps = new UserLoginSteps();
        userLoginSteps
                .OpenWebsite()
                .ClickLoginButton();

        return this;

    }

    public RegistrationSteps OpenRegistrationPage(){
        RegistrationPage registrationPage = new RegistrationPage();

        OpenUserLoginPage();
        registrationPage.getRegisterButton().shouldBe(Condition.visible).click();

       return this;
    }

    public RegistrationSteps SwitchToLegalPersonTab(){
        RegistrationPage registrationPage = new RegistrationPage();

        registrationPage.getLegalPerson().shouldBe(Condition.visible).click();

        return this;
    }

    public RegistrationSteps SelectLegalForm(){
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.getLegalForm().shouldBe(Condition.visible).selectOptionContainingText("სააქციო საზოგადოება");

        return this;
    }

    public RegistrationSteps FillPage(){

        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.getCity().setValue("თბილისი");
        registrationPage.getCompanyName().setValue("ნიკორა");
        registrationPage.getNamesurname().setValue("მოყმე უცხო");
        registrationPage.getIdentificationCode().setValue("12345678910");
        registrationPage.getPassword().setValue("hello");
        registrationPage.getConfirmPassword().setValue("hello");
        registrationPage.getPhoneNumber().setValue("5553123132");
        registrationPage.getPostalIndex().setValue("5534");

        return this;
    }

    public RegistrationSteps LegalNewsCheckBoxClick(){
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.getIsLegalSubscribedNewsletter().click();

        return this;

    }

    public RegistrationSteps AcceptTerms(){
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.getAcceptCheckBox().click();
    return  this;
    }

    public RegistrationSteps RegisterAction(){
        RegistrationPage registrationPage = new RegistrationPage();

        registrationPage.getSubmitButton().shouldBe(Condition.visible).click();

        return this;
    }

    public RegistrationSteps CheckForlegalInfoMassage(){
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.getAcceptCheckBox().shouldBe(Condition.visible);
        return this;
    }

}
