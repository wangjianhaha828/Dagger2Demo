package com.wangjian.dagger2demo.dagger

import dagger.Component
import javax.inject.Singleton

/** 主要应用程序负责冲泡咖啡和打印日志. */


interface CoffeeApp {
    @Singleton
    @Component(modules = [HeaterModule::class,PumpModule::class])
    interface CoffeeShop{
        fun marker():CoffeeMaker
        fun logger():CoffeeLogger
    }
}