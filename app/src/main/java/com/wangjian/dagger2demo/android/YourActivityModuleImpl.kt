package com.wangjian.dagger2demo.android

import dagger.Module
import dagger.Provides

@Module
class YourActivityModuleImpl {
    @Provides
    fun provideListWithData():MutableList<String>{
        return mutableListOf("one","two","three")
    }
}