package com.telran.gettacar.tests;

import com.telran.gettacar.pages.CarPage;
import com.telran.gettacar.pages.CarsFilterPage;
import com.telran.gettacar.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectCarPositiveTest extends TestBase {
    @Test
    public void selectCarPositiveTest() {
        new HomePage(driver).clikOnChooseYourCarButton();
        Assert.assertTrue(new CarsFilterPage(driver).isFilterFormPresent());
        new CarsFilterPage(driver). clickOnBodyType().clickPickupItem();
        Assert.assertTrue(new CarsFilterPage(driver).isUsedPickupTextPresent());
        new CarsFilterPage(driver).selectFirstCar();
        Assert.assertTrue(new CarPage(driver).isPriceBoxPresent());
        String priceStr= (new CarPage(driver).getPriceStr()).substring(1);
        int indexOfOR = priceStr.indexOf("or");
        String priceS= priceStr.substring(0,indexOfOR-1);
        double price = Double.parseDouble(priceS.replace(",",""));
        String highOrLow = getResult(price);
        System.out.println("price of the car = "+ price);
        System.out.println("rezult = "+ highOrLow);
    }

    private String getResult(double price) {
        String rezultStr;
        if (price>=20000){
            rezultStr="High";
        }else{
            rezultStr="Low";
        }
        return rezultStr;
    }
}
