package com.wangjian.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wangjian.dagger2demo.dagger.DaggerCoffeeApp_CoffeeShop

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build()
        coffeeShop.marker().brew()
        coffeeShop.logger().logs().forEach { log -> Log.d("测试",log) }
    }
}