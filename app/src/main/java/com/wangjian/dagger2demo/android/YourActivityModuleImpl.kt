package com.wangjian.dagger2demo.android

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class YourActivityModuleImpl {
    @Provides
    @Named("withoutArg")
    fun provideListWithData():MutableList<String>{
        return mutableListOf("one","two","three")
    }
}