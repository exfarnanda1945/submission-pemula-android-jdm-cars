package com.example.submissiondicodingjdmcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        supportActionBar?.title= "About Me"
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }
}