package com.sauce.page;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

    @FindBy (id ="first-name")
    public WebElement inputFirstname;

    @FindBy (id = "last-name")
    public WebElement inputLastname;

    @FindBy (id ="postal-code")
    public WebElement inputPostalCode;

    @FindBy (id ="continue")
    public WebElement continueBtn;
    public void enterDetails(String firstname,String lastname, String postalCode){
        inputFirstname.sendKeys(firstname);
        inputLastname.sendKeys(lastname);
        inputPostalCode.sendKeys(postalCode);
        continueBtn.click();
    }
    public String getTotalPrice(String totalPrice){
        return Driver.get().findElement(By.xpath("//*[.='Total: $"+totalPrice+"']")).getText();
    }
}
