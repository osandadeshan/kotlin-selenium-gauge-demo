package com.gauge.kotlin.util

import java.util.concurrent.TimeUnit

/**
 * Project Name    : kotlin-selenium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2020
 * Time            : 4:23 PM
 * Description     : This is epoch time class
 **/

object EpochTime {

    fun getCurrentEpochTimeInSeconds(): Long {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())
    }

    fun getCurrentEpochTimeInMilliSeconds(): Long {
        return System.currentTimeMillis()
    }


}