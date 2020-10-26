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

class TilakActivity : AppCompatActivity(), ExampleAdapter.OnItemClickListner {

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
                "स्वराज्य हा माझा जन्मसिद्द हक्क आहे आणि तो मी मिळवणारच.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "कार्यात यश मिळो वा ना मिळो प्रयत्न करण्यात कधीही माघार घेता कामा नये.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "महान गोष्टी सहज मिळत नाहीत आणि सहज मिळणाऱ्या गोष्टी महान नसतात.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "एका चांगल्या वृत्तपत्राचे शब्दच आपोआप बोलत असतात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "भारताचे तोपर्यंत रक्त वाहल्या जात आहेत जोपर्यंत लोकांचे सापळे उरत नाहीत.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "भारताची सध्याची स्थिती ही सध्याच्या सरकार मुळे आहे.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "देव पण त्यांचीच मदत करते जे स्वतःची मदत करतो.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "एक वेळ राज्य कमावणे सोपे असते,पण राज्य राखणे कठीण असते.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "परमेश्वर अस्पृश्यता मानत असतील तर मी परमेश्वरालाच मानणार नाही.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "माणसाने माणसाला भ्यावे ही शरमेची गोष्ट आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "समोर अंधार असला तरी त्या पलीकडे उजेड आहे हे लक्षात ठेवा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "स्वातंत्र्य म्हणजे विष,स्वराज्य म्हणजे दुध.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "स्वराज्य हा माझा जन्मसिद्ध हक्क आहे आणि तो मी मिळवणारच. ",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "एक वेळ राज्य कमावणे सोपे असते, पण राज्य राखणे कठीण असते.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जेथे बुद्धीचे क्षेत्र संपते तिथे श्रद्धेचे क्षेत्र सुरु होते. ",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "परमेश्वर अस्पृश्यता मानत असतील तर मी परमेश्वरालाच मानणार नाही.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "पुढे जाणाऱ्याला माघे खेचू नका.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "माणसाने माणसाला भ्याये ही शरमेची गोष्ट आहे.",
                "motivateoneself"
            )
        )

        Ad()
    }


    override fun onItemClick(currentItem: ExampleItem) {

        val intent = Intent(this@TilakActivity, PageDetail::class.java)
        intent.putExtra("Quote", currentItem.text1)
        intent.putExtra("ID", currentItem.text2)
        startActivity(intent)

    }

    private fun toWriteActivity() {
        val intent = Intent(this, msg_activity::class.java)
        startActivity(intent)
    }
}