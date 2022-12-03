package com.wangjian.dagger2demo.dagger

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface HeaterModule {
    @Binds
    @Singleton
    fun bindHeater(impl: ElectricHeater):Heater
}