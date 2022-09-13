package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductAddingCartPage {

    public ProductAddingCartPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement addToCartButton;


}
