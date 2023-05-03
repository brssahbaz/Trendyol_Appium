package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class GenderPage {
    ElementHelper elementHelper;

    By image = By.xpath("");
    By buttons = By.className("");

    public GenderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkImage() {


    }

    public void clickButton(String button) {


    }


}
