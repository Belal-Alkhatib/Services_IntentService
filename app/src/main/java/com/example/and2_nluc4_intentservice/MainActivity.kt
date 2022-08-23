package com.example.and2_nluc4_intentservice

import android.app.job.JobInfo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
        val i = Intent(this, MyIntentService::class.java)
            i.putExtra("msg",txtInput.text.toString())
            startService(i)
        }

        btnStop.setOnClickListener {
            val i = Intent(this, MyIntentService::class.java)
            stopService(i)
        }
    }
}