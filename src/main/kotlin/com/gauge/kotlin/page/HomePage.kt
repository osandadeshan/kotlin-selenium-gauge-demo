package com.gauge.kotlin.page

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/12/2020
 * Time            : 4:55 PM
 * Description     : This is homepage page object class
 **/

class HomePage(driver: WebDriver?) {

    @FindBy(xpath = "//a[@class='login']")
    private val signInButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun clickOnSignInButton() {
        signInButton?.click()
    }


}