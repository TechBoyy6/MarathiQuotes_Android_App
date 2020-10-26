package com.techboyy.marathi_quotes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.ads.*
import kotlinx.android.synthetic.main.activity_category.*

class MainActivity : AppCompatActivity() {


    var bigFb: com.facebook.ads.InterstitialAd? = null
    lateinit var fbAds: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        //facebook banner ad
        fbAds = AdView(this, "2655198851472863_2655201524805929", AdSize.BANNER_HEIGHT_50)
        banner_Ad.addView(fbAds)
        fbAds.loadAd()

        //facebook interstitial ad
        fun Ad() {
            bigFb = com.facebook.ads.InterstitialAd(this, "2655198851472863_2655417854784296")
            bigFb?.setAdListener(object : InterstitialAdListener {
                override fun onInterstitialDisplayed(ad: Ad) {
                    null
                }

                override fun onAdClicked(p0: Ad?) {
                    null
                }

                override fun onInterstitialDismissed(ad: Ad) {
                    null
                }

                override fun onError(ad: Ad, adError: AdError) {
                    null
                }

                override fun onAdLoaded(ad: Ad) {
                    bigFb?.show()
                }

                override fun onLoggingImpression(p0: Ad?) {
                    null
                }
            })
            bigFb?.loadAd()

        }

        Share_Btn.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(
                Intent.EXTRA_TEXT,
                "Hey, I tried this app. It has plenty of marathi quotes and i think you should give it a try\n" +
                        "\uD83D\uDC47The App Link\uD83D\uDC47\n" +
                        "https://play.google.com/store/apps/details?id=com.techboyy.marathi_quotes"
            )
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "share using:"))
        }

        friendship.setOnClickListener {
            val intent = Intent(this, FrndshipActivity::class.java)
            startActivity(intent)
        }

        tilak.setOnClickListener {
            val intent = Intent(this, TilakActivity::class.java)
            startActivity(intent)
        }

        ganpati.setOnClickListener {
            val intent = Intent(this, GanpatiActivity::class.java)
            startActivity(intent)
        }

        motivation.setOnClickListener {
            val intent = Intent(this, MotivationActivity::class.java)
            startActivity(intent)
        }

        rakshabandhan.setOnClickListener {
            Ad()
            val intent = Intent(this, RakshabandhanActivity::class.java)
            startActivity(intent)
        }

        savarkar.setOnClickListener {
            val intent = Intent(this, SavarkarActivity::class.java)
            startActivity(intent)
        }

        life.setOnClickListener {
            val intent = Intent(this, LifeActivity::class.java)
            startActivity(intent)
        }


    }
}

