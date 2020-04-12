package com.gauge.kotlin.util

import com.thoughtworks.gauge.AfterScenario
import com.thoughtworks.gauge.BeforeScenario
import org.openqa.selenium.WebDriver

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/12/2020
 * Time            : 5:42 PM
 * Description     : This is the driver class
 **/

class Driver {

    companion object {
        // Holds the WebDriver instance
        var webDriver: WebDriver? = null
    }

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeScenario
    fun initializeDriver() {
        webDriver = DriverFactory.driver
        webDriver?.manage()?.window()?.maximize()
    }

    // Close the webDriver instance
    @AfterScenario
    fun closeDriver() {
        webDriver!!.quit()
    }


}