package com.telran.gettacar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='hero-default-mode_buttons-wrapper__2UWjD ']/a[@href='/used/']")
    WebElement ChooseYourCarBtn;

    public CarsFilterPage clikOnChooseYourCarButton() {
        click(ChooseYourCarBtn);
        return new CarsFilterPage(driver);
    }
}
