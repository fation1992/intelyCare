package com.intelyCare.utilities;

import org.openqa.selenium.WebElement;

import java.util.List;

public class RandomElement {


    public static WebElement selectRandomWebElement(List<WebElement> listWebElements) {

        java.util.Random random = new java.util.Random();

        int index = random.nextInt(listWebElements.size());

        return listWebElements.get(index);


    }

}
