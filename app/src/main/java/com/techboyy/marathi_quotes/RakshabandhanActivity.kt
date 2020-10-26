package com.techboyy.marathi_quotes

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.facebook.ads.Ad
import com.facebook.ads.AdError
import com.facebook.ads.AudienceNetworkAds
import com.facebook.ads.InterstitialAdListener
import kotlinx.android.synthetic.main.activity_main.*

class RakshabandhanActivity : AppCompatActivity(), ExampleAdapter.OnItemClickListner {

    var bigFb: com.facebook.ads.InterstitialAd? = null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AudienceNetworkAds.initialize(this)

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

        val data = ArrayList<ExampleItem>()
        recycler_view.adapter = ExampleAdapter(data, this)
        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //INTERSTITIAL AD on WRITE BUTTON
        msg_btn.setOnClickListener {
            bigFb = com.facebook.ads.InterstitialAd(this, "2655198851472863_2655417854784296")
            bigFb?.setAdListener(object : InterstitialAdListener {
                override fun onInterstitialDisplayed(ad: Ad) {
                    null
                }

                override fun onAdClicked(p0: Ad?) {
                    null
                }

                override fun onInterstitialDismissed(ad: Ad) {
                    toWriteActivity()
                }

                override fun onError(ad: Ad, adError: AdError) {
                    toWriteActivity()
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
                Intent.EXTRA_TEXT, "Hey, I tried this app. It has plenty of marathi quotes and i think you should give it a try\n" +
                        "\uD83D\uDC47The App Link\uD83D\uDC47\n" +
                        "https://play.google.com/store/apps/details?id=com.techboyy.marathi_quotes")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "share using:"))
        }


        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "आयुष्य सुंदर आहे तुझ्यामुळे माझ्या प्रिये.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "तुझी आनंदाची दुनिया आहे माझी बाळ बहीण !! रक्षाबंधनच्या हार्दिक शुभेच्छा!",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "भाऊ व बहिणी हात पायांसारखेच जवळ आहेत.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "एक बहीण हा आपला आरसा - आणि विरुद्ध आहे.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "एक भाऊ बनविण्यासाठी दोन माणसे लागतात.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "पवित्र प्रेमाचं अतूट नातं,राखी पौर्णिमेच्या हार्दिक शुभेच्छा.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "चंद्राला चंदन देवाला वंदन भाऊ बहिणीच प्रेम म्हणजे रक्षाबंधन.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "ओ..माझा भाऊ- जोपर्यंत तू माझ्या आयुष्यात नाहीस तोपर्यंत मला मित्राची गरज नाही.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "बहिणी सुगंध आणि वास सामायिक करतात ... सामान्य बालपणाची भावना.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "आम्ही दररोज वस्तू मिळवतो आणि हरवितो. पण एका गोष्टीवर माझ्यावर विश्वास ठेवा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "बहीण एक व्यक्ती जी तुम्ही जिथे होता तिथे होता.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "जेव्हा गोष्टी ठीक नसतात तेव्हा ज्याला आपण कॉल करू शकता.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "फक्त कुटुंब पेक्षा अधिक आहे; एक बहीण एक कायमचा मित्र आहे.रक्षाबंधन शुभेच्छा.",
                "manmajhesairat"
            )
        )


    }


    override fun onItemClick(currentItem: ExampleItem) {

        val intent = Intent(this@RakshabandhanActivity, PageDetail::class.java)
        intent.putExtra("Quote", currentItem.text1)
        intent.putExtra("ID", currentItem.text2)
        startActivity(intent)

    }

    private fun toWriteActivity() {
        val intent = Intent(this, msg_activity::class.java)
        startActivity(intent)
    }
}