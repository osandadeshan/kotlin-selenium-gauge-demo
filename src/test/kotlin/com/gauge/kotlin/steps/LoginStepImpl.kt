package com.gauge.kotlin.steps

import com.gauge.kotlin.page.LoginPage
import com.gauge.kotlin.util.datastore.DataStore.DataStoreType
import com.gauge.kotlin.util.datastore.DataStore.readFromDataStore
import com.thoughtworks.gauge.Step

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/12/2020
 * Time            : 5:25 PM
 * Description     : This is login step implementation class
 **/

class LoginStepImpl : TestBase() {

    var loginPage = LoginPage(driver)

    init {
        waitForPageLoad(driver)
    }

    @Step("Login to the application using email <email> and password <password>")
    fun login(email: String, password: String) {
        loginPage.login(email, password)
    }

    @Step("Login to the application using email in <emailVariableName> variable of <emailDataStoreType> data store and password <password>")
    fun loginWithDataStores(emailVariableName: String, emailDataStoreType: DataStoreType, password: String) {
        loginPage.login(readFromDataStore(emailDataStoreType, emailVariableName), password)
    }


}