package com.gauge.kotlin.test

import com.gauge.kotlin.page.LoginPage
import com.thoughtworks.gauge.Step

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/12/2020
 * Time            : 5:25 PM
 * Description     : This is loginpage step implementation class
 **/

class LoginStepImpl : TestBase() {

    @Step("Login to the application using email <email> and password <password>")
    fun login(email: String, password: String) {
        waitForPageLoad(driver)
        val loginPage = LoginPage(driver)
        loginPage.login(email, password)
    }


}