package com.wangjian.dagger2demo.dagger

/** 加热咖啡的加热器 */
interface Heater {
    //打开
    fun on()
    //关闭
    fun off()
    //是否是热的
    fun isHot(): Boolean
}