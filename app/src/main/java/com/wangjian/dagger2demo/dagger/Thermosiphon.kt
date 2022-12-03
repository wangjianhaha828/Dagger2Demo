package com.wangjian.dagger2demo.dagger

import javax.inject.Inject

/** 用来吸咖啡的虹吸管 */
class Thermosiphon @Inject constructor(coffeeLogger: CoffeeLogger,heater: Heater) : Pumb {

    private val heater = heater
    private val coffeeLogger = coffeeLogger

    //泵
    override fun pumb() {
        if (heater.isHot()){
            coffeeLogger.log("=> => pumping => =>")
        }
    }
}