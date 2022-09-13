package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Kabul Et']")
    public WebElement acceptCookieButton;

    @FindBy(xpath = "//a[@href='/giyim-aksesuar/']")
    public WebElement giyimVeAksesuarLink;

    @FindBy(xpath = "//a[@href='/giyim-aksesuar/dizalti-corap/']")
    public WebElement dizAltiCorapLink;


}
