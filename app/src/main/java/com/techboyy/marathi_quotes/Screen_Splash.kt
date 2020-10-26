package com.techboyy.marathi_quotes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Screen_Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)


        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(1000)
                    val intent =Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                }catch (e: Exception) {
                    e.printStackTrace()
                }
            }

        }
        background.start()
    }
}