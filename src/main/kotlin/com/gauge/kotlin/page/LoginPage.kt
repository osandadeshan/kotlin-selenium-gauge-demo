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
 * Time            : 5:03 PM
 * Description     : This is login page object class
 **/

class LoginPage(driver: WebDriver?) : BasePage() {

    @FindBy(id = "email")
    private val emailTextBox: WebElement? = null

    @FindBy(id = "passwd")
    private val passwordTextBox: WebElement? = null

    @FindBy(xpath = "//p[@class='submit']//span[1]")
    private val signInButton: WebElement? = null

    @FindBy(id = "email_create")
    private val registrationEmailTextBox: WebElement? = null

    @FindBy(id = "SubmitCreate")
    private val registrationButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun login(email: String, password: String){
        emailTextBox?.sendKeys(email)
        passwordTextBox?.sendKeys(password)
        signInButton?.click()
    }

    fun inputNewEmail(email: String){
        registrationEmailTextBox?.sendKeys(email)
    }

    fun clickOnCreateAccountButton(){
        registrationButton?.click()
    }


}