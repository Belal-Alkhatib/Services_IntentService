package com.example.and2_nluc4_intentservice

import android.app.IntentService
import android.content.Intent
import android.os.SystemClock
import android.util.Log

class MyIntentService : IntentService("MyIntentService") {

    override fun onCreate() {
        super.onCreate()
        Log.e("hzm","onCreate")

    }

    override fun onHandleIntent(intent: Intent?) {
        Log.e("hzm","onHandleIntent")
        Log.e("hzm",Thread.currentThread().name)
        val msg = intent!!.getStringExtra("msg")

        for(i in 0..5){
            Log.e("hzm","i = $i   $msg")
            //Thread.sleep(1000) نفس وظيفة السطر التالي2
            SystemClock.sleep(1000)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("hzm","onDestroy")
    }
}