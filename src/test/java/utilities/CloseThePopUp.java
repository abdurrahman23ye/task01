package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CloseThePopUp {

    //Serverin yavaş cevap verdiği zamanlar ortaya cikan popup i kapatmak icin bu method olusturuldu.

    public static void closeThePopUp(){



        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='X']"))).click();
        }


    }

