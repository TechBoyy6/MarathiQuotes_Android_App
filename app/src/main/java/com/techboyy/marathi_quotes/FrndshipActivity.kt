package com.techboyy.marathi_quotes

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.facebook.ads.Ad
import com.facebook.ads.AdError
import com.facebook.ads.AudienceNetworkAds
import com.facebook.ads.InterstitialAdListener
import kotlinx.android.synthetic.main.activity_main.*

class FrndshipActivity : AppCompatActivity(), ExampleAdapter.OnItemClickListner {

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
                "यशाकडे नेणारा सर्वात जवळचा मार्ग अजून तयार व्हायचा आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "डोक शांत असेल तर निर्णय चुकत नाही, भाषा गोड असेल तर माणसं तुटत नाहीत.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "देव ज्यांना रक्ताच्या नात्यात जोडायला विसरतो त्यांनाच मित्र म्हणून पाठवतो.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "समोरच्याच्या मनाची काळजी तुम्ही तुमच्या मनापेक्षा जास्त घेता याची जाणीव म्हणजे मैत्री.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "रक्ताच्या नात्यापेक्षा एक घट्ट नात असत ते म्हणजे मैत्री.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "पैश्या पेक्षा मित्र कमवा तेव्हा जास्त श्रीमंत व्हाल.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "लाईफ आनंदात जगायाला शिकवते ती म्हणजे मैत्री.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "मैत्रीच्या वेलीला पाण्याची गरज नसावी फक्त त्या वेलीला मैत्रीची पान असावी.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "मैत्रीला कधी गंध नसतो,मैत्रीचा फक्त छंद असतो,मैत्री सर्वांनी करावी त्यात खरा आनंद असतो.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "मनाच्या इवल्याश्या कोपर्यात काही जण हक्काने राज्य करतात त्यालाच तर मैत्री म्हणतात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जुना तो पाऊस पुन्हा बरसतोय होऊनी नवा धुंद अश्या वेळी सहवास तुझा मजला पुन्हा नव्याने हवा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "तुझ्या माझ्या अतुट मैत्रीचं रहस्य मी जाणलंय आता मात्र मनात वेळोवेळी तुलाच ठाणलंय.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जास्त काही नाही फक्त एक असा मित्र हवा जो खिशाचे वजन पाहून बदलणार नाही.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "खरे मित्र कधीच दूर जात नाहीत, जरी ते रोज बोलत नसले तरी…",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जो टीका करतो मात्र मैत्री तुटेल याच्या भितीने सावध राहतो तो तुमचा मित्र नाही",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "मैत्री हा जर तुमचा विकपॉईंट असेल तर तुम्ही जगातील शक्तीमान व्यक्ती आहात",
                "marathiquotes"
            )
        )

    }


    override fun onItemClick(currentItem: ExampleItem) {

        val intent = Intent(this@FrndshipActivity, PageDetail::class.java)
        intent.putExtra("Quote", currentItem.text1)
        intent.putExtra("ID", currentItem.text2)
        startActivity(intent)

    }

    private fun toWriteActivity() {
        val intent = Intent(this, msg_activity::class.java)
        startActivity(intent)
    }
}