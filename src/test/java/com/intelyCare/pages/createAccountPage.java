package com.intelyCare.pages;

import com.intelyCare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class createAccountPage {


    public createAccountPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "input_0")
    public WebElement emailInput;

    @FindBy( id= "input_1")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement createAccountButton;


    @FindBy(xpath = "//input[@ng-model='user.profile.firstName']")
    public WebElement firstName;


    @FindBy(xpath = "//input[@automation-id='last-name-answer']")
    public WebElement lastName;


    @FindBy(xpath = "//input[@automation-id='mobile-answer']")
    public WebElement mobileNumber;


    @FindBy(xpath = "//input[@automation-id='zip-code-answer']")
    public WebElement zipcode;


    @FindBy(xpath = "//md-select[@id='select_8']")
    public WebElement qualifications;

    @FindBy(xpath = "//md-option[@ng-value='qtype.payload'][1]")
    public WebElement RNOption;

    @FindBy(xpath = "//md-option[@ng-value='qtype.payload']")
    public List<WebElement> qualificationsSelect;


    @FindBy(xpath = "(//div[@class='md-label'])[1]")
    public WebElement dayShifts;


    @FindBy(xpath = "(//div[@class='md-label'])[2]")
    public WebElement eveningsShifts;


    @FindBy(xpath = "(//div[@class='md-label'])[3]")
    public WebElement overnightShifts;


    @FindBy(xpath = "(//div[@class='md-label'])[4]")
    public WebElement weekendShifts;


    @FindBy(xpath = "(//div[@class='md-label'])[5]")
    public WebElement weekdayShifts;

    @FindBy(xpath = "//md-radio-button[@role='radio']")
    public List<WebElement> monthRadioButtons;

    @FindBy(xpath = "(//div[@class='md-label'])[9]")
    public WebElement termsAndConditions;


    @FindBy(xpath = "//span[.='Continue']")
    public WebElement continueButton;


    @FindBy(xpath = "//h3[.='Confirm your phone number']")
    public WebElement confirmPhoneNumber;



}
