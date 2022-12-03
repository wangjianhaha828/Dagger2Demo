package com.wangjian.dagger2demo.dagger

import dagger.Binds
import dagger.Module

@Module
abstract class PumpModule {
    //提供泵
    @Binds
    abstract fun providePumb(pumb: Thermosiphon): Pumb
}