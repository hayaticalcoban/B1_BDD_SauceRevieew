package com.sauce.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

}
