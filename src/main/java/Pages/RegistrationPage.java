package Pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.WithText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RegistrationPage {

    private final SelenideElement registerButton = $(".register");
    private final SelenideElement legalPerson =$(withText("იურიდიული პირი"));

    private final SelenideElement formRequiredFieldMessage = $(withText("წითლად მონიშნული ველების შევსება სავალდებულოა"));

    private final SelenideElement IsLegalSubscribedNewsletter = $("#IsLegalSubscribedNewsletter");

    private final SelenideElement legalForm = $("#lLegalForm");
    private final SelenideElement companyName = $("#lName");
    private final SelenideElement city = $("#lCity");
    private final SelenideElement postalIndex = $("#lPostalCode");
    private final SelenideElement mail = $("#lContactPersonEmail");
    private final SelenideElement password = $("#lContactPersonPassword");
    private final SelenideElement confirmPassword = $("#lContactPersonConfirmPassword");
    private final SelenideElement namesurname = $("#lContactPersonName");
    private final SelenideElement identificationCode = $("#lContactPersonPersonalID");
    private final SelenideElement phoneNumber = $("#lContactPersonPhone");
    private final SelenideElement AcceptCheckBox = $(By.xpath("/html/body/section[5]/div[1]/div/div[2]/div/div/div/div[1]/div[10]/div/input[1]"));

    private final SelenideElement legalInfoMassage = $("#legalInfoMassage");

    public SelenideElement getLegalInfoMassage() {
        return legalInfoMassage;
    }

    public SelenideElement getSubmitButton() {
        return SubmitButton;
    }

    private final SelenideElement SubmitButton = $(byXpath("/html/body/section[5]/div[1]/div/div[2]/div/div/div/div[1]/a/div/input"));
    public SelenideElement getLegalForm() {
        return legalForm;
    }

    public SelenideElement getCompanyName() {
        return companyName;
    }

    public SelenideElement getCity() {
        return city;
    }

    public SelenideElement getPostalIndex() {
        return postalIndex;
    }

    public SelenideElement getMail() {
        return mail;
    }

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getConfirmPassword() {
        return confirmPassword;
    }

    public SelenideElement getNamesurname() {
        return namesurname;
    }

    public SelenideElement getIdentificationCode() {
        return identificationCode;
    }

    public SelenideElement getPhoneNumber() {
        return phoneNumber;
    }

    public SelenideElement getAcceptCheckBox() {
        return AcceptCheckBox;
    }

    public final SelenideElement getRegisterButton() {
        return registerButton;
    }

    public SelenideElement getLegalPerson() {
        return legalPerson;
    }

    public SelenideElement getFormRequiredFieldMessage() {
        return formRequiredFieldMessage;
    }

    public SelenideElement getIsLegalSubscribedNewsletter() {
        return IsLegalSubscribedNewsletter;
    }
}
