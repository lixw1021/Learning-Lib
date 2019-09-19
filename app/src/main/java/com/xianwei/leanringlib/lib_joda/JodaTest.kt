package com.xianwei.leanringlib.lib_joda

import org.joda.time.Period
import org.joda.time.format.PeriodFormat
import java.util.*

fun main() {

    val period = Period.days(1)

    println(period.toString(PeriodFormat.getDefault()))
    println(period.toString(PeriodFormat.wordBased(Locale.FRENCH)))
}