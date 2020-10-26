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

class SavarkarActivity : AppCompatActivity(), ExampleAdapter.OnItemClickListner {

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
                "आरएसएस च्या माणसाचे उपकथन पुढीलप्रमाणे असेलः तो जन्मला, शाखेत गेला आणि मेला.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "हे मातृभूमी तुझंसाठी मरण ते जनन, तुजविण जनन ते मरण",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "अनादी मी आणि अनंत मी अवध्य मी भला, मारील रिपु जगती असा कवण जन्माला.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "पतितांनाच उद्धरण्याचे कार्य राष्ट्रीय हितास आवश्यक आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "मनुष्याच्या सर्व शक्ती ह्या त्याने स्वतःला ओळखण्यात आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "उदात्त ध्येयासाठी केलेले बलिदान कधीही वाया जात नाही.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "कर्तव्याची निष्ठा केवळ संकटांचा सामना करणे, दु: ख आणि आयुष्यभर संघर्षात असते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "आपल्या मातृभूमी साठी बलिदान म्हणजे आयुष्य तुझ्याशिवाय जगणे म्हणजेच मृत्यू होय.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "सर्व हिंदुस्थान मधील माझ्या भावांना वीर सावरकर यांच्या जयंती निमित्त हार्दिक शुभेच्छा.",
                "marathiquotes"
            )
        )

    }


    override fun onItemClick(currentItem: ExampleItem) {

        val intent = Intent(this@SavarkarActivity, PageDetail::class.java)
        intent.putExtra("Quote", currentItem.text1)
        intent.putExtra("ID", currentItem.text2)
        startActivity(intent)

    }

    private fun toWriteActivity() {
        val intent = Intent(this, msg_activity::class.java)
        startActivity(intent)
    }
}