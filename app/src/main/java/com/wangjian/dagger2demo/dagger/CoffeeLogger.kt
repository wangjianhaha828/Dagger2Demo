package com.wangjian.dagger2demo.dagger

import javax.inject.Inject
import javax.inject.Singleton

/** 在煮咖啡时记录步骤的记录器。 */
@Singleton
class CoffeeLogger @Inject constructor() {

    private var logs: MutableList<String> = mutableListOf()

    //记录日志
    fun log(msg: String) {
        logs.add(msg)
    }
    //返回所有日志
    fun logs():MutableList<String>{
        val newLogs = mutableListOf<String>()
        newLogs.addAll(logs)
        return newLogs
    }
}