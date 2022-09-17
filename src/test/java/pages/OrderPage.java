package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderPage {

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='#' and @title='ÜYE OLMADAN DEVAM ET']")
    public WebElement continueWithoutRegisterButton;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement emailLabel;

    @FindBy(xpath = "//button[@class='button block green']")
    public WebElement devamEtLabel;







}
