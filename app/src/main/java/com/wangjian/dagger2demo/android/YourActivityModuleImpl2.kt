package com.wangjian.dagger2demo.android

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class YourActivityModuleImpl2 constructor(private val arg1: String = "arg1", private val arg2: String = "arg2") {

    @Provides
    @Named("withArg")
    fun provideListWithData():MutableList<String>{
        return mutableListOf(arg1,arg2)
    }
}