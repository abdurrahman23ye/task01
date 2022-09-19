package stepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import java.time.Duration;



public class MyStepdefinitions {

    AllPages allPages=new AllPages();




    Actions actions=new Actions(Driver.getDriver());
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Faker faker=new Faker();




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
        actions.sendKeys(Keys.PAGE_UP).perform();



        Assert.assertTrue(allPages.
                dizAltiCorapResultsPage().
                selectedItemLAbel.
                getText().
                equalsIgnoreCase("siyah"));
    }

    @And("Kullanici rastgele bir urunu sepete ekler")
    public void kullaniciRastgeleBirUrunuSepeteEkler() {

        wait.until(ExpectedConditions.elementToBeClickable(allPages.
                dizAltiCorapResultsPage().firstFilteredResult));


        allPages.dizAltiCorapResultsPage().firstFilteredResult.click();


        wait.
                until(ExpectedConditions.
                        elementToBeClickable(allPages.productAddingCartPage().addToCartButton));

        allPages.productAddingCartPage().addToCartButton.click();
    }

    @And("Kullanici sepeti goruntule butonunu tiklar")
    public void kullaniciSepetiGoruntuleButonunuTiklar() {

        allPages.productAddingCartPage().showToCartButton.click();
    }

    @And("Kullanici siparisi onayla butonuna basar")
    public void kullaniciSiparisiOnaylaButonunaBasar() {






        allPages.cartPage().confirmOrdersButton.click();
    }

    @And("Kullanici acilan sayfada uye olmadan devam et butonuna tiklar")
    public void kullaniciAcilanSayfadaUyeOlmadanDevamEtButonunaTiklar() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();




        wait.until(ExpectedConditions.elementToBeClickable(allPages.
                orderPage().continueWithoutRegisterButton));

        allPages.orderPage().continueWithoutRegisterButton.click();
    }

    @And("Kullanici ekrani renk kategorileri gorulene kadar asagi indirir")
    public void kullaniciEkraniRenkKategorileriGoruleneKadarAsagiIndirir() {

        //Javascripexecuter sürekli sorun verdigi icin scrollda action class ini kullandim

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();




    }



    @And("Kullanici email labeline email adresi yazar ve devam et butonunu tiklar")
    public void kullaniciEmailLabelineEmailAdresiYazarVeDevamEtButonunuTiklar() {

        allPages.orderPage().emailLabel.sendKeys(ConfigReader.getProperty("mail1"));
        allPages.orderPage().devamEtLabel.click();



    }


    @And("Kullanici yeni adres ekle linkine basar")
    public void kullaniciYeniAdresEkleLinkineBasar() {
        allPages.addingAdressPage().createAdress.click();
    }


    @And("Kullanici adres bilgilerini girer ve kaydet tusuna basar")
    public void kullaniciAdresBilgileriniGirerVeKaydetTusunaBasar() {

        Select townShip=new Select(Driver.getDriver().
                findElement(By.xpath("//select[@name='township']")));

        Select district=new Select(Driver.getDriver().
                findElement(By.xpath("//select[@name='district']")));



        allPages.addingAdressPage().adressTitle.sendKeys("ev");
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.name().firstName()).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.name().lastName()).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.phoneNumber().subscriberNumber(10)).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("ankara").perform();
        actions.sendKeys(Keys.TAB).perform();
        townShip.selectByIndex(3);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Bayat Mah. cumhuriyet sok. no:14/7").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("06710").perform();
        district.selectByIndex(3);

        allPages.addingAdressPage().savingAdressButoon.click();

    }


    @And("Kullanici rastgele kargo tercihi yapar kaydedip devam eder")
    public void kullaniciRastgeleKargoTercihiYaparKaydedipDevamEder() {


        wait.until(ExpectedConditions.
                elementToBeClickable(allPages.addingAdressPage().selectingShippingOption));

        allPages.addingAdressPage().selectingShippingOption.click();




    }
}



