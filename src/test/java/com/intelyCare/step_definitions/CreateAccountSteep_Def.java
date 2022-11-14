package com.intelyCare.step_definitions;

import com.github.javafaker.Faker;
import com.intelyCare.pages.createAccountPage;
import com.intelyCare.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class CreateAccountSteep_Def {

    createAccountPage createAccountPage = new createAccountPage();
    Faker faker = new Faker();



    @When("i open the page")
    public void i_open_the_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @And("i enter username and password")
    public void iEnterUsernameAndPassword() {
        String name = faker.name().username();

        String fullEmail = name +"@mailinator.com";
        createAccountPage.emailInput.sendKeys(fullEmail);

        System.out.println(fullEmail);

        String password = faker.bothify("?password#",true);
        System.out.println(password);
        createAccountPage.passwordInput.sendKeys(password);


    }



    @When("i click create account")
    public void i_click_create_account() {
        createAccountPage.createAccountButton.click();



    }


    @When("i fill all the fields with data")
    public void iFillAllTheFieldsWithData() {

        createAccountPage.firstName.sendKeys(faker.name().firstName());

        createAccountPage.lastName.sendKeys(faker.name().lastName());

        createAccountPage.mobileNumber.sendKeys(faker.numerify("7589577506"));

        createAccountPage.zipcode.sendKeys("02090");

        Wait.waitForElementClickable(createAccountPage.qualifications);

        createAccountPage.qualifications.click();


        Wait.waitForElementClickable(createAccountPage.RNOption);
        RandomElement.selectRandomWebElement(createAccountPage.qualificationsSelect).click();


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ESCAPE).perform();




        List<WebElement> shifts= new ArrayList<>();
        shifts.add(createAccountPage.dayShifts);
        shifts.add(createAccountPage.eveningsShifts);
        shifts.add(createAccountPage.overnightShifts);
        shifts.add(createAccountPage.weekdayShifts);
        shifts.add(createAccountPage.weekendShifts);

        RandomElement.selectRandomWebElement(shifts).click();


        RandomElement.selectRandomWebElement(createAccountPage.monthRadioButtons).click();

        createAccountPage.termsAndConditions.click();
    }

    @Then("continue button is enabled")
    public void continueButtonIsEnabled() {

        Assert.assertTrue(createAccountPage.continueButton.isEnabled());
    }

    @And("i click continue Button")
    public void iClickContinueButton() {

        createAccountPage.continueButton.click();
    }

    @Then("i land on OTP page")
    public void iLandOnOTPPage() {

        Wait.waitForElement(createAccountPage.confirmPhoneNumber);
        String actualResults = createAccountPage.confirmPhoneNumber.getText();
        String expectedResult = "Confirm your phone number";

        Assert.assertEquals(expectedResult,actualResults);
        Driver.getDriver().findElement(By.tagName("h3"));

    }
}
