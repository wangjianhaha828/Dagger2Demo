package com.wangjian.dagger2demo.android

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class YourApplication : Application(), HasAndroidInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        DaggerYourApplicationComponent.create().inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}
