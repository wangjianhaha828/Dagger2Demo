package com.wangjian.dagger2demo.android

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [YourActivitySubcomponent::class])
abstract class YourActivityModule {
    @Binds
    @IntoMap
    @ClassKey(YourActivity::class)
    abstract fun bindYourAndroidInjectorFactory(factory:YourActivitySubcomponent.Factory):AndroidInjector.Factory<*>
}