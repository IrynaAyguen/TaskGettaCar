package com.telran.gettacar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarPage extends PageBase{
    public CarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="price-box-details-wrapper")
    WebElement priceBox;

    public boolean isPriceBoxPresent() {
        return driver.findElement(By.id("price-box-details-wrapper")).isDisplayed();
    }


    public String getPriceStr() {
        String priceOfCar = driver.findElement(By.xpath("//div[@class='price-box-details_carPrice__2OTPp'] /span")).getText();
        return priceOfCar;
    }
}
