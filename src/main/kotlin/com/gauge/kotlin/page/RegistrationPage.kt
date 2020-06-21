package com.gauge.kotlin.page

import com.gauge.kotlin.util.driver.Driver.Companion.webDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.Select

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2020
 * Time            : 9:03 AM
 * Description     : This is registration page object class
 **/

class RegistrationPage(driver: WebDriver?) : BasePage() {

    val driver: WebDriver? = webDriver

    // Personal Information Locators
    private var genderXpath = "//*[text()[contains(.,'#title.')]]//input"

    @FindBy(id = "customer_firstname")
    private val firstNameTextBox: WebElement? = null

    @FindBy(id = "customer_lastname")
    private val lastNameTextBox: WebElement? = null

    @FindBy(id = "passwd")
    private val passwordTextBox: WebElement? = null

    // Address Information Locators
    @FindBy(id = "firstname")
    private val addressFirstNameTextBox: WebElement? = null

    @FindBy(id = "lastname")
    private val addressLastNameTextBox: WebElement? = null

    @FindBy(id = "company")
    private val companyTextBox: WebElement? = null

    @FindBy(id = "address1")
    private val addressLine1TextBox: WebElement? = null

    @FindBy(id = "address2")
    private val addressLine2TextBox: WebElement? = null

    @FindBy(id = "city")
    private val cityTextBox: WebElement? = null

    @FindBy(id = "id_state")
    private val stateDropdown: WebElement? = null

    @FindBy(id = "postcode")
    private val postalCodeTextBox: WebElement? = null

    @FindBy(id = "id_country")
    private val countryDropdown: WebElement? = null

    @FindBy(id = "phone_mobile")
    private val mobilePhoneTextBox: WebElement? = null

    @FindBy(id = "submitAccount")
    private val registerButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    // Personal Information Page Object Methods
    private fun selectGenderRadioButton(title: String){
        val xpathForGenderRadioButton = genderXpath.replace("#title", title)
        waitUntilElementIsClickable(By.xpath(xpathForGenderRadioButton), 30)
        driver?.findElement(By.xpath(xpathForGenderRadioButton))?.click()
    }

    private fun inputFirstName(firstName: String){
        waitUntilElementIsVisible(firstNameTextBox, 30)
        firstNameTextBox?.sendKeys(firstName)
    }

    private fun inputLastName(lastName: String){
        waitUntilElementIsVisible(lastNameTextBox, 30)
        lastNameTextBox?.sendKeys(lastName)
    }

    private fun inputPassword(password: String){
        waitUntilElementIsVisible(passwordTextBox, 30)
        passwordTextBox?.sendKeys(password)
    }

    fun fillPersonalInfo(title: String, firstName: String, lastName: String, password: String){
        selectGenderRadioButton(title)
        inputFirstName(firstName)
        inputLastName(lastName)
        inputPassword(password)
    }

    // Address Information Page Object Methods
    private fun inputCompany(company: String){
        waitUntilElementIsVisible(companyTextBox, 30)
        companyTextBox?.sendKeys(company)
    }

    private fun inputAddressLine1(addressLine1: String){
        waitUntilElementIsVisible(addressLine1TextBox, 30)
        addressLine1TextBox?.sendKeys(addressLine1)
    }

    private fun inputAddressLine2(addressLine2: String){
        waitUntilElementIsVisible(addressLine2TextBox, 30)
        addressLine2TextBox?.sendKeys(addressLine2)
    }

    private fun inputCity(city: String){
        waitUntilElementIsVisible(cityTextBox, 30)
        cityTextBox?.sendKeys(city)
    }

    private fun selectState(state: String){
        val dropdown = Select(stateDropdown)
        dropdown.selectByVisibleText(state)
    }

    private fun inputPostalCode(postalCode: String){
        waitUntilElementIsVisible(postalCodeTextBox, 30)
        postalCodeTextBox?.sendKeys(postalCode)
    }

    private fun selectCountry(country: String){
        val dropdown = Select(countryDropdown)
        dropdown.selectByVisibleText(country)
    }

    private fun inputMobileNumber(mobileNumber: String){
        waitUntilElementIsVisible(mobilePhoneTextBox, 30)
        mobilePhoneTextBox?.sendKeys(mobileNumber)
    }

    fun fillAddressInfo(company: String, addressLine1: String, addressLine2: String,
                        city: String, state: String, postalCode: String, country: String, mobileNumber: String){
        inputCompany(company)
        inputAddressLine1(addressLine1)
        inputAddressLine2(addressLine2)
        inputCity(city)
        selectState(state)
        inputPostalCode(postalCode)
        selectCountry(country)
        inputMobileNumber(mobileNumber)
    }

    fun clickOnRegisterButton(){
        waitUntilElementIsVisible(registerButton, 30)
        registerButton?.click()
    }


}