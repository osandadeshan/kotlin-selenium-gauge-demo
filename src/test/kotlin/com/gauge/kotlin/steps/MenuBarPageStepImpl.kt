package com.gauge.kotlin.steps

import com.gauge.kotlin.page.MenuBarPage
import com.thoughtworks.gauge.Step

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2020
 * Time            : 5:16 PM
 * Description     : This is menu bar page step implementation class
 **/

class MenuBarPageStepImpl : TestBase () {

    var menuBarPage = MenuBarPage(driver)

    init {
        waitForPageLoad(driver)
    }

    @Step("Click on Sign In button")
    fun clickOnSignInButton() {
        menuBarPage.clickOnSignInButton()
    }

    @Step("Click on Sign Out button")
    fun clickOnSignOutButton() {
        menuBarPage.clickOnSignOutButton()
    }


}