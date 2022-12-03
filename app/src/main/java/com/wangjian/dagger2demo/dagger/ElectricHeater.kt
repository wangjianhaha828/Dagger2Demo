package com.wangjian.dagger2demo.dagger

import javax.inject.Inject

/** 用来加热咖啡的电加热器。 */
class ElectricHeater @Inject constructor(coffeeLogger: CoffeeLogger) : Heater{
    private val coffeeLogger = coffeeLogger
    private var heating: Boolean = false

    override fun on() {
        this.heating = true
        coffeeLogger.log("~ ~ ~ heating ~ ~ ~")
    }

    override fun off() {
        this.heating = false
    }

    override fun isHot(): Boolean {
        return heating
    }
}