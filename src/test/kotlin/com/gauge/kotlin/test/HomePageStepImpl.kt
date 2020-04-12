package com.gauge.kotlin.test

import com.gauge.kotlin.page.HomePage
import com.thoughtworks.gauge.Step

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/12/2020
 * Time            : 5:19 PM
 * Description     : This is homepage step implementation class
 **/

class HomePageStepImpl : TestBase () {

    @Step("On home page")
    fun goToHomePage() {
        driver?.get(APP_URL)
    }

    @Step("Click on Sign In button")
    fun clickOnSignInButton() {
        val homePage = HomePage(driver)
        homePage.clickOnSignInButton()
    }


}