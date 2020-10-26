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

class GanpatiActivity : AppCompatActivity(), ExampleAdapter.OnItemClickListner {

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
                "वक्रतुंड महाकाय सूर्य कोटी समप्रभ, निर्विग्नहं कुरु मे दैव सर्व कार्येषु सर्वदा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "गणपती बाप्पा मोरया, मंगल मूर्ती मोरया !",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "अडचणी खूप आहेत जीवनात पण त्यांना समोर जायची ताकद बाप्पा फक्त तुझ्यामुळे येते.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "वाट पाहता बाप्पा तुझी वर्ष कधी सरले आता तुझया आगमनाला थोडे दिवस उरले.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "निरोप देतो बाप्पा आता आज्ञा असावी चुकले आमचे काही देवा क्षमा असावी.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "रूप तुझे वंदिन्या साज शब्दांचे सजले मुखी नाम तुझे आले हात चरणाशी जुळले.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "तुझको फिर से जलवा दिखाना ही होगा अगले बरस जल्दी आना ही होगा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "सुखकर्ता तू दुःखहर्ता तू अष्टविनायक मोरया.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "देवा तूंचि गणेशु । सकलमतिप्रकाशु । मंगलमूर्ती मोरया",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "साष्टांग नमन माझे, गौरी पुत्रा विनायका गणपती आगमनाच्या मन:पूर्वक",
                "motivateoneself"
            )
        )

    }


    override fun onItemClick(currentItem: ExampleItem) {

        val intent = Intent(this@GanpatiActivity, PageDetail::class.java)
        intent.putExtra("Quote", currentItem.text1)
        intent.putExtra("ID", currentItem.text2)
        startActivity(intent)

    }

    private fun toWriteActivity() {
        val intent = Intent(this, msg_activity::class.java)
        startActivity(intent)
    }
}