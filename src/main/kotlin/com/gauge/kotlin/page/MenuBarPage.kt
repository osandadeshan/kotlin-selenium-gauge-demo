package com.gauge.kotlin.page

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2020
 * Time            : 5:01 PM
 * Description     : This is menu bar page object class
 **/

class MenuBarPage(driver: WebDriver?) : BasePage(){

    @FindBy(xpath = "//a[@class='login']")
    private val signInButton: WebElement? = null

    @FindBy(css = ".logout")
    private val signOutButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun clickOnSignInButton() {
        signInButton?.click()
    }

    fun clickOnSignOutButton() {
        signOutButton?.click()
    }


}