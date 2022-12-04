package com.wangjian.dagger2demo.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wangjian.dagger2demo.R
import dagger.android.AndroidInjection
import javax.inject.Inject

class YourActivity : AppCompatActivity() {
    @Inject
    lateinit var list: MutableList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your)
        AndroidInjection.inject(this)
        Log.d("测试",list.toString())
    }
}