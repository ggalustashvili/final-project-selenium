package Steps;

import Pages.HolidayPage;
import Pages.UserLoginPage;
import com.codeborne.selenide.Condition;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class HolidaySteps {

    public HolidaySteps OpenPage() {

        UserLoginSteps userLoginSteps = new UserLoginSteps();
        userLoginSteps.OpenWebsite();

        return this;
    }

    public HolidaySteps NavigateToHolidayPage() {

        HolidayPage holidayPage = new HolidayPage();
        holidayPage.getHolidayTabButton().click();

        return this;
    }

    public HolidaySteps SetHolidayPriceRange(int min, int max) {

        HolidayPage holidayPage = new HolidayPage();
        holidayPage.PriceFilter().scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}");
        holidayPage.getMinPrice().shouldBe(Condition.visible).click();
        holidayPage.getMinPrice().sendKeys(Integer.toString(min));
        holidayPage.getMaxPrice().shouldBe(Condition.visible).click();
        holidayPage.getMaxPrice().sendKeys(Integer.toString(max));

        return this;
    }

    public HolidaySteps FilterTheHolidays() {

        HolidayPage holidayPage = new HolidayPage();
        holidayPage.getSubmitButton().click();

        return this;
    }

    public  HolidaySteps OfferList(){
        HolidayPage holidayPage = new HolidayPage();
        holidayPage.getOfferList();
        holidayPage.getOfferList().stream().forEach(e -> System.out.println(e));
        return  this;
    }

}
