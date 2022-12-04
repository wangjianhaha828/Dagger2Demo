package com.wangjian.dagger2demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.wangjian.dagger2demo.android.YourActivity
import com.wangjian.dagger2demo.dagger.CoffeeApp
import com.wangjian.dagger2demo.dagger.CoffeeMaker
import com.wangjian.dagger2demo.dagger.DaggerCoffeeApp_CoffeeShop
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var coffeeShop: CoffeeApp.CoffeeShop
    @Inject
    lateinit var coffeeMaker: CoffeeMaker
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build()
//        coffeeShop.marker().brew()
//        coffeeShop.logger().logs().forEach { log -> Log.d("测试",log) }

        DaggerCoffeeApp_CoffeeShop.builder().build().inject(this)
//        coffeeShop.marker().brew()
        coffeeMaker.brew()
        coffeeShop.logger().logs().forEach { log -> Log.d("测试",log) }

        findViewById<Button>(R.id.button).setOnClickListener{
            startActivity(Intent(this,YourActivity::class.java))
        }
    }
}