package com.gauge.kotlin.util

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/12/2020
 * Time            : 5:15 PM
 * Description     : This is the driver factory class
 **/

internal object DriverFactory {

    // Get a new WebDriver Instance.
    // There are various implementations for this depending on browser. The required browser can be set as an environment variable.
    // Refer http://getgauge.io/documentation/user/current/managing_environments/README.html
    val driver: WebDriver
        get() {
            val browser = System.getenv("BROWSER")
            if (browser == null) {
                WebDriverManager.chromedriver().setup()
                return ChromeDriver()
            }
            return when (browser) {
                "IE" -> {
                    WebDriverManager.iedriver().setup()
                    InternetExplorerDriver()
                }
                "EDGE" -> {
                    WebDriverManager.edgedriver().setup()
                    EdgeDriver()
                }
                "FIREFOX" -> {
                    WebDriverManager.firefoxdriver().setup()
                    FirefoxDriver()
                }
                else -> {
                    WebDriverManager.chromedriver().setup()
                    ChromeDriver()
                }
            }
        }


}
