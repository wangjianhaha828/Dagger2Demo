package com.wangjian.dagger2demo.android

import android.app.Application
import dagger.Component
import dagger.android.AndroidInjectionModule

//注意：针对安卓中使用，除了自己的module，还需要加入AndroidInjectionModule::class
@Component(modules = [AndroidInjectionModule::class,YourActivityModule::class])
interface YourApplicationComponent {
    fun inject(application: YourApplication)
}