package com.wangjian.dagger2demo.android

import android.app.Application
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class,YourActivityModule::class])
interface YourApplicationComponent {
    fun inject(application: YourApplication)
}