package com.gauge.kotlin.steps

import com.gauge.kotlin.page.LoginPage
import com.gauge.kotlin.page.RegistrationPage
import com.gauge.kotlin.util.EpochTime
import com.gauge.kotlin.util.DataStore
import com.gauge.kotlin.util.DataStore.DataStoreType.SCENARIO
import com.thoughtworks.gauge.Step

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2020
 * Time            : 9:08 AM
 * Description     : This is registration step implementation class
 **/

class RegistrationStepImpl : TestBase() {

    private var loginPage = LoginPage(driver)
    private var registrationPage = RegistrationPage(driver)

    init {
        waitForPageLoad(driver)
    }

    @Step("Enter a new email to register")
    fun inputNewEmail() {
        val email = "automation"
        val generatedEmail = email.plus(EpochTime.getCurrentEpochTimeInMilliSeconds()).plus("@maxsoft.com")
        DataStore.saveToDataStore(SCENARIO, "newEmail", generatedEmail)
        loginPage.inputNewEmail(generatedEmail)
    }

    @Step("Click on Create an Account button")
    fun clickOnCreateAccountButton() {
        loginPage.clickOnCreateAccountButton()
    }

    @Step("Input personal information <title> <firstName> <lastName> <password>")
    fun fillPersonalInfo(title: String, firstName: String, lastName: String, password: String){
        registrationPage.fillPersonalInfo(title, firstName, lastName, password)
    }

    @Step("Input address information <company> <addressLine1> <addressLine2> <city> "
            + "<state> <postalCode> <country> <mobileNumber>")
    fun fillAddressInfo(company: String, addressLine1: String, addressLine2: String,
                        city: String, state: String, postalCode: String, country: String, mobileNumber: String){
        registrationPage.fillAddressInfo(company, addressLine1, addressLine2, city, state,
            postalCode, country, mobileNumber)
    }

    @Step("Click on Register button")
    fun clickOnRegisterBurron(){
        registrationPage.clickOnRegisterButton()
    }


}