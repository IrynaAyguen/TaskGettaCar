package com.telran.gettacar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsFilterPage extends PageBase {
    public CarsFilterPage(WebDriver driver) {
        super(driver);
    }


    public boolean isFilterFormPresent() {
        return driver.findElement(By.xpath("//span[contains(text(),'Filter')]")).isDisplayed();

    }

    @FindBy(xpath = "//h5[contains(.,'Body type')]")
    WebElement BodytypeFilterItem;

    public CarsFilterPage clickOnBodyType() {
        click(BodytypeFilterItem);
        return this;
    }

    @FindBy(xpath = "//div[@class='filters-section_body-types__31DdG']  //div[6] ")
    WebElement PickupItem;

    public CarsFilterPage clickPickupItem() {
        click(PickupItem);
        return this;
    }

    @FindBy(xpath = "//div[@class='cars-grid_car-cards-container__13OMI'] /div[1] ")
    WebElement firstCarInList;

    public CarPage selectFirstCar() {
        pause(2000);
        click(firstCarInList);
        return new CarPage(driver);
    }



    public boolean isUsedPickupTextPresent() {
        return driver.findElement(By.xpath("//h1[contains(.,'Used Pickup')]")).isDisplayed();
    }
}
