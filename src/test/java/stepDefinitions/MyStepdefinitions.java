package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AllPages;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;


public class MyStepdefinitions {

    AllPages allPages=new AllPages();




    Actions actions=new Actions(Driver.getDriver());
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();



    @Given("Kullanici {string} web sayfasina gider")
    public void kullaniciAWebSayfasinaGider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Kullanici cerezleri kabul eder")
    public void kullaniciCerezleriKabulEder() {

       allPages.mainPage().acceptCookieButton.click();
    }


    @And("Kullanici giyim ve aksesuar linkinin uzerine gelir")
    public void kullaniciGiyimVeAksesuarLinkininUzerineGelir() {

        actions.moveToElement(allPages.mainPage().giyimVeAksesuarLink).perform();


    }


    @And("Kullanici kategorilerin gorulmesini bekler ve kadin ic giyim kategorisinde dizalti corap secenegine tiklar")
    public void kullaniciKategorilerinGorulmesiniBeklerVeKadinIcGiyimKategorisindeDizaltiCorapSecenegineTiklar() {

        wait.until(ExpectedConditions.visibilityOf(allPages.mainPage().dizAltiCorapLink));

        allPages.mainPage().dizAltiCorapLink.click();

    }


    @And("Kullanici dizalti corap sonuclarini siyah renk olarak filtreler")
    public void kullaniciDizaltiCorapSonuclariniSiyahRenkOlarakFiltreler() {

        allPages.dizAltiCorapResultsPage().siyahColourCheckBox.click();
    }


    @And("Kullanici siyah renk filtresinin aktif oldugunu dogrular")
    public void kullaniciSiyahRenkFiltresininAktifOldugunuDogrular() {

        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();

        Assert.assertTrue(allPages.
                dizAltiCorapResultsPage().
                selectedItemLAbel.
                getText().
                equalsIgnoreCase("siyah"));
    }

    @And("Kullanici rastgele bir urunu sepete ekler")
    public void kullaniciRastgeleBirUrunuSepeteEkler() {

        jse.executeScript("arguments[0].scrollIntoView()", allPages.dizAltiCorapResultsPage().firstFilteredResult);

        wait.until(ExpectedConditions.visibilityOf(allPages.dizAltiCorapResultsPage().firstFilteredResult));

        allPages.dizAltiCorapResultsPage().firstFilteredResult.click();


        wait.until(ExpectedConditions.visibilityOf(allPages.productAddingCartPage().addToCartButton));

        allPages.productAddingCartPage().addToCartButton.click();
    }

    @And("Kullanici sepeti goruntule butonunu tiklar")
    public void kullaniciSepetiGoruntuleButonunuTiklar() {

        allPages.productAddingCartPage().showToCartButton.click();
    }

    @And("Kullanici siparisi onayla butonuna basar")
    public void kullaniciSiparisiOnaylaButonunaBasar() {

        jse.executeScript("arguments[0].scrollIntoView()", allPages.cartPage().confirmOrdersButton);

        wait.until(ExpectedConditions.visibilityOf(allPages.cartPage().confirmOrdersButton));


        allPages.cartPage().confirmOrdersButton.click();
    }

    @And("Kullanici acilan sayfada uye olmadan devam et butonuna tiklar")
    public void kullaniciAcilanSayfadaUyeOlmadanDevamEtButonunaTiklar() {

        jse.executeScript("arguments[0].scrollIntoView()", allPages.orderPage().continueWithoutRegisterButton);

        wait.until(ExpectedConditions.visibilityOf(allPages.orderPage().continueWithoutRegisterButton));

        allPages.orderPage().continueWithoutRegisterButton.click();
    }

    @And("Kullanici ekrani renk kategorileri gorulene kadar asagi indirir")
    public void kullaniciEkraniRenkKategorileriGoruleneKadarAsagiIndirir() {

        //Javascripexecuter sürekli sorun verdigi icin action class ini kullandim

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
}
