package com.wangjian.dagger2demo.dagger

import com.wangjian.dagger2demo.MainActivity
import dagger.Component
import javax.inject.Singleton

/** 主要应用程序负责冲泡咖啡和打印日志. */


interface CoffeeApp {
    @Singleton
    @Component(modules = [HeaterModule::class,PumpModule::class])
    interface CoffeeShop{
        //这个名字可以随便起，参数都会被注入到生成的类中，也就是说：activity会成为生成类的内部对象
        fun inject(activity: MainActivity)
        fun marker():CoffeeMaker
        fun logger():CoffeeLogger
    }
}