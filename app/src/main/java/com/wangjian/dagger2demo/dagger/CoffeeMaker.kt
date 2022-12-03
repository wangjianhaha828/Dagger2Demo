package com.wangjian.dagger2demo.dagger

import javax.inject.Inject

/** 用来煮咖啡的咖啡机。 */
class CoffeeMaker @Inject constructor(coffeeLogger: CoffeeLogger, heater: Heater, pumb: Pumb) {
    //加热器
    private val heater = heater

    //泵
    private val pumb = pumb

    //日志
    private val coffeeLogger = coffeeLogger

    //沏咖啡
    fun brew() {
        heater.on()
        pumb.pumb()
        coffeeLogger.log(" [_]P coffee! [_]P ")
        heater.off()
    }
}