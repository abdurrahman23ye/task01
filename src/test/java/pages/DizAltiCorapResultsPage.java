package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DizAltiCorapResultsPage {

    public DizAltiCorapResultsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@class='checkbox'])[5]")
    public WebElement siyahColourCheckBox;

    @FindBy(xpath = "//label[@class='selected-filters-item']")
    public WebElement selectedItemLAbel;

    @FindBy(xpath = "//div[@class='count']") //urunlerin yeri degisebileceginden urun ekleme indeksi uzerinden locate ettim
    public WebElement firstFilteredResult;





}
