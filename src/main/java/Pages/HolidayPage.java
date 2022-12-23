package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HolidayPage {

    private final SelenideElement HolidayTabButton = $(".cat-2");
    private final SelenideElement MinPrice = $(By.xpath("/html/body/div[10]/div[4]/div[1]/div/div/div/section/div/div[4]/div/input[1]"));
    private final SelenideElement MaxPrice = $(By.xpath("/html/body/div[10]/div[4]/div[1]/div/div/div/section/div/div[4]/div/input[2]"));
    private final SelenideElement SubmitButton = $(By.xpath("/html/body/div[10]/div[4]/div[1]/div/div/div/section/div/div[5]/div[1]"));
    private final SelenideElement PriceFilter = $(By.xpath("/html/body/div[10]/div[4]/div[1]/div/div/div/section/div/div[4]"));
    private final ElementsCollection OfferList = $$(".deal-voucher-price");

    public SelenideElement getPriceFilter() {
        return PriceFilter;
    }

    public ElementsCollection getOfferList() {
        System.out.println(OfferList);
        return OfferList;
    }



    public SelenideElement getHolidayTabButton() {
        return HolidayTabButton;
    }

    public SelenideElement getMinPrice() {
        return MinPrice;
    }

    public SelenideElement getMaxPrice() {
        return MaxPrice;
    }

    public SelenideElement getSubmitButton() {
        return SubmitButton;
    }
    public SelenideElement PriceFilter(){
        return PriceFilter;
    }


}
