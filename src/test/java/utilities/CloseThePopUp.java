package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AppearPopUp;

import java.util.ArrayList;
import java.util.List;

public class CloseThePopUp {

    //Serverin yavaş cevap verdiği zamanlar ortaya cikan popup i kapatmak icin bu method olusturuldu.

    public void CloseThePopUp(){

        AppearPopUp appearPopUp=new AppearPopUp();

        List<WebElement> popUp=Driver.getDriver().findElements(By.xpath("//div[text()='X']"));

        if(popUp.size()!=0){appearPopUp.closePopUp.click();}


        }


    }

