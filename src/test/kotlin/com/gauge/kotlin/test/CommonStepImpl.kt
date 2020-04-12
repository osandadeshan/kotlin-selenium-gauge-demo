package com.gauge.kotlin.test

import com.thoughtworks.gauge.Step
import org.junit.Assert

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/12/2020
 * Time            : 5:15 PM
 * Description     : This is common step implementation class
 **/

class CommonStepImpl : TestBase() {

    @Step("Page title is <pageTitle>")
    fun validatePageTitle(pageTitle: String){
        Assert.assertEquals(pageTitle, driver?.title)
    }


}