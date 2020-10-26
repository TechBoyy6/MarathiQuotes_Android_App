package com.techboyy.marathi_quotes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import kotlinx.android.synthetic.main.activity_msg.*

class msg_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_msg)

        page_btn.setOnClickListener {
            val link = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/motivateoneself"))
            startActivity(link)
        }
    }
}
