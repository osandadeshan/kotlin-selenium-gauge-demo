package com.gauge.kotlin.test

import com.gauge.kotlin.util.Driver
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.WebDriverWait


/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/12/2020
 * Time            : 5:17 PM
 * Description     : This is the base class for tests
 **/

open class TestBase {

    val driver: WebDriver? = Driver.webDriver
    var APP_URL = System.getenv("application_endpoint")

    open fun waitForPageLoad(driver: WebDriver?) {
        val pageLoadCondition: ExpectedCondition<Boolean> =
            ExpectedCondition { driver -> (driver as JavascriptExecutor?)!!.executeScript("return document.readyState") == "complete" }
        val wait = WebDriverWait(driver, 30)
        wait.until(pageLoadCondition)
    }


}