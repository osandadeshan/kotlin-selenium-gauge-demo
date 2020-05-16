package com.gauge.kotlin.steps

import com.thoughtworks.gauge.Step
import org.junit.Assert
import java.lang.Thread.sleep

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/12/2020
 * Time            : 5:15 PM
 * Description     : This is common step implementation class
 **/

class CommonStepImpl : TestBase() {

    @Step("On landing page")
    fun goToHomePage() {
        driver?.get(appUrl)
    }

    @Step("Page title is <pageTitle>")
    fun validatePageTitle(pageTitle: String){
        Assert.assertEquals(pageTitle, driver?.title)
    }

    @Step("Wait <seconds> seconds")
    fun wait(seconds: Int){
        sleep((seconds * 1000).toLong())
    }


}