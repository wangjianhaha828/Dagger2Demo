package com.wangjian.dagger2demo.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wangjian.dagger2demo.R
import dagger.android.AndroidInjection
import javax.inject.Inject
import javax.inject.Named

class YourActivity : AppCompatActivity() {
    @Inject
    @Named("withoutArg")
    lateinit var withoutArgList: MutableList<String>
    @Inject
    @Named("withArg")
    lateinit var withArgList: MutableList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your)
        AndroidInjection.inject(this)
        Log.d("测试",withoutArgList.toString())
        Log.d("测试",withArgList.toString())
    }
}