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


}
