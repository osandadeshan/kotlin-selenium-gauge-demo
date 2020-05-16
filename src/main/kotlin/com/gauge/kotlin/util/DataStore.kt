package com.gauge.kotlin.util

import com.thoughtworks.gauge.datastore.DataStoreFactory

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2020
 * Time            : 4:03 PM
 * Description     : This is data store class
 **/

object DataStore {

    enum class DataStoreType {
        SCENARIO,
        SPEC,
        SUITE
    }

    private fun getScenarioDataStoreValue(variableName: String): String {
        val scenarioStore = DataStoreFactory.getScenarioDataStore()
        return scenarioStore[variableName] as String
    }

    private fun getSpecificationDataStoreValue(variableName: String): String {
        val specStore = DataStoreFactory.getSpecDataStore()
        return specStore[variableName] as String
    }

    private fun getSuiteDataStoreValue(variableName: String): String {
        val suiteStore = DataStoreFactory.getSuiteDataStore()
        return suiteStore[variableName] as String
    }

    private fun saveToScenarioDataStore(variableName: String, valueToBeStoredInDataStore: String) {
        val scenarioStore = DataStoreFactory.getScenarioDataStore()
        scenarioStore.put(variableName, valueToBeStoredInDataStore)
    }

    private fun saveToSpecificationDataStore(variableName: String, valueToBeStoredInDataStore: String) {
        val specStore = DataStoreFactory.getSpecDataStore()
        specStore.put(variableName, valueToBeStoredInDataStore)
    }

    private fun saveToSuiteDataStore(variableName: String, valueToBeStoredInDataStore: String) {
        val suiteStore = DataStoreFactory.getSuiteDataStore()
        suiteStore.put(variableName, valueToBeStoredInDataStore)
    }

    fun saveToDataStore(dataStoreType: DataStoreType, variableName: String, valueToBeStored: String) {
        when (dataStoreType) {
            DataStoreType.SPEC -> saveToSpecificationDataStore(
                variableName,
                valueToBeStored
            )
            DataStoreType.SCENARIO -> saveToScenarioDataStore(
                variableName,
                valueToBeStored
            )
            DataStoreType.SUITE -> saveToSuiteDataStore(
                variableName,
                valueToBeStored
            )
        }
    }

    fun readFromDataStore(dataStoreType: DataStoreType, variableName: String): String {
       return when (dataStoreType) {
            DataStoreType.SPEC -> getSpecificationDataStoreValue(
                variableName
            )
            DataStoreType.SCENARIO -> getScenarioDataStoreValue(
                variableName
            )
            DataStoreType.SUITE -> getSuiteDataStoreValue(
                variableName
            )
        }
    }


}