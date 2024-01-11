package com.example.housedesignplan3dapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class remove_ads : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remove_ads)
        val tv_skip: TextView =findViewById(R.id.tv_skip)
        tv_skip.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}