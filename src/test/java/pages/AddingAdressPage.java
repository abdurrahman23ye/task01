package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddingAdressPage {

    public AddingAdressPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Yeni adres oluştur']")
    public WebElement createAdress;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement adressTitle;

    @FindBy(xpath = "//button[@type='button' and @class='button green js-set-country js-prevent-emoji']")
    public WebElement savingAdressButoon;

    @FindBy(xpath = "(//div[@class='radio'])[3]")
    public WebElement selectingShippingOption;

    @FindBy(xpath = "//button[@type='submit' and @class='button block green js-proceed-button']")
    public WebElement savingShippingButton;


}
