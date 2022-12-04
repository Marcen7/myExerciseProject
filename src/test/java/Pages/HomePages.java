package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePages {
    @FindBy(css = "img[alt*='Oceń produkty']")
    private WebElement RateTheProduct_link;  //to jest pole


}
