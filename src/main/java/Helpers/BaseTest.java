package Helpers;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

public class BaseTest {
    @BeforeSuite
    public void setup() {
        Configuration.timeout = 5000;
    }

}
