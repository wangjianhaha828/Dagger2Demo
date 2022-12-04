package com.wangjian.dagger2demo.android

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [YourActivityModuleImpl::class, YourActivityModuleImpl2::class])
interface YourActivitySubcomponent : AndroidInjector<YourActivity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<YourActivity> {}
}