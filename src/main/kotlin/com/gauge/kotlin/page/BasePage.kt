package com.gauge.kotlin.page

import com.gauge.kotlin.util.driver.Driver.Companion.webDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2020
 * Time            : 11:55 AM
 * Description     : This is base page
 **/

open class BasePage {

    private val driver: WebDriver? = webDriver

    protected fun waitUntilElementIsClickable(by: By, timeOut: Long) {
        val wait = WebDriverWait(driver, timeOut)
        wait.until(ExpectedConditions.elementToBeClickable(by))
    }

    protected fun waitUntilElementIsClickable(element: WebElement?, timeOut: Long) {
        val wait = WebDriverWait(driver, timeOut)
        wait.until(ExpectedConditions.elementToBeClickable(element))
    }

    protected fun waitUntilElementIsVisible(by: By, timeOut: Long) {
        val wait = WebDriverWait(driver, timeOut)
        wait.until(ExpectedConditions.visibilityOfElementLocated(by))
    }

    protected fun waitUntilElementIsVisible(element: WebElement?, timeOut: Long) {
        val wait = WebDriverWait(driver, timeOut)
        wait.until(ExpectedConditions.visibilityOf(element))
    }


}