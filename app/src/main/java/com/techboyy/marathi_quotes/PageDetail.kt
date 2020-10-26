package com.techboyy.marathi_quotes

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.facebook.ads.AdSize
import com.facebook.ads.AdView
import com.facebook.ads.*
import kotlinx.android.synthetic.main.activity_page_detail.*

class PageDetail : AppCompatActivity() {

    var fbAds : AdView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_detail)
        AudienceNetworkAds.initialize(this)

        val quote = intent.getStringExtra("Quote")
        val id = intent.getStringExtra("ID")

        val bigQuote: TextView = findViewById(R.id.bigquote)
        bigQuote.text = quote.toString()

        val bigId: Button = findViewById(R.id.big_id)
        bigId.text = id.toString()

        fbAds = AdView(this, "2655198851472863_2655201524805929", AdSize.BANNER_HEIGHT_50)
        banner_detail.addView(fbAds)
        fbAds!!.loadAd()

        Share_Btn.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, bigQuote.text.toString())
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "share to:"))
        }

        big_id.setOnClickListener {
            val link =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/${big_id.text}"))
            startActivity(link)
        }

        big_id_sign.setOnClickListener {
            val link =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/${big_id.text}"))
            startActivity(link)
        }
    }

    override fun onDestroy() {
        fbAds?.destroy()
        super.onDestroy()
    }
}
