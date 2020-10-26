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

class LifeActivity : AppCompatActivity(), ExampleAdapter.OnItemClickListner {

    var bigFb: com.facebook.ads.InterstitialAd? = null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AudienceNetworkAds.initialize(this)


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
                "एखादी व्यक्ती तुमच्याशी ज्या प्रकारे वागते त्या मार्गाने एक संदेश आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "पुढे जा आपल्याला दुसर्या बाजूला काय असू शकते हे माहित नाही.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "बरेच लोक तुझ्यावर प्रेम करतात. काय नाही यावर लोकांकडे लक्ष देऊ नका.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "जआज कोणीतरी हसण्याचे कारण बना.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "आयुष्य आपल्याला अशा संधी देणार आहे जे आपल्या सर्व अपेक्षांपेक्षा जास्त असेल.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "हवा विकणारी एकमेव चिप्स कंपनीचा सन्मान.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "कधीकधी कुत्री होण्यासाठी शिका. सर्व वेळ आपण दयाळू रहायला नको.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जास्त विचार केल्यास नकारात्मक विचार होऊ शकतात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "आपण चढलेली सर्वात मोठी भिंत ही आपण आपल्या मनात निर्माण केली आहे.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "आपल्याला खरोखर जे काही सांगायचे आहे त्या गोष्टी करायला भाग पाडण्याची गरज नाही.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जो कोणी तुम्हाला खाली आणण्याचा प्रयत्न करीत आहे तो तुमच्यापेक्षा अल्प आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "गोष्टी सध्या कदाचित गडद आहेत परंतु प्रकाश येत आहे. धरुन रहा.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "हंगाम बदलतात पण काळ्या कपड्यांवरील माझे प्रेम अजूनही तशाच आहे.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "दृढ व्हा, आपण कोण आहात हे आपल्याला माहित नाही.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "आयुष्याला रिमोट नाही. उठा आणि ते स्वतः बदला.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "जेव्हा आयुष्य आपल्याला पावसाळ्याचा दिवस फेकतो, तलावामध्ये खेळा.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "वआपल्या मागे जीवन हे फॉन्ट मधील आयुष्य खूप महत्वाचे आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "मला आनंदाची गुरुकिल्ली सापडली. मूर्खांपासून दूर रहा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "जगातल्या सुट्टीप्रमाणे योग्य व्यक्तीबरोबर घालवलेला वेळ.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "घेणारे चांगले खाऊ शकतात, पण पेरणारे चांगले झोपतात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "कधीकधी कृपा इतरत्र हिरवी असते कारण ती बनावट असते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "गोपनीयता ही शक्ती आहे. लोक काय बिघडवत नाहीत.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "कोणती उदासिनता पाहण्याऐवजी काय आशीर्वाद आहे ते पहा.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जर संधी टेकली नाही तर दार बांधा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "चांगल्या मनाचे लोक नेहमीच नात्यात दुर्दैवी असतात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "बर्यापैकी लोक खरोखरच योग्य लोकांबद्दल बोलतात.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "संधीसाठी चालू नका. ते तयार करा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "आपण मूळ जन्माला आला एक कॉपी मरत नाही.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "ज्याने आपल्याला बांधले व मोडले त्या सर्वांचे आम्ही आहोत.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "गोष्टी चांगल्या होण्याआधीच बिघडू लागतात. फक्त चालू ठेवा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "थेट फक्त मागच्या बाजूस समजू शकते, परंतु पुढे सरसावत आयुष्य जगते.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "सौंदर्य तोंडावर नाही, सौंदर्य हृदयात प्रकाश आहे.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "प्रेम नसलेले जीवन उन्हाळ्याशिवाय वर्षासारखे असते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "आज असे काहीतरी करा जे भविष्यात आपले आभार मानेल.",
                "_marathi.quotes"
            )
        )

    }


    override fun onItemClick(currentItem: ExampleItem) {

        val intent = Intent(this@LifeActivity, PageDetail::class.java)
        intent.putExtra("Quote", currentItem.text1)
        intent.putExtra("ID", currentItem.text2)
        startActivity(intent)

    }

    private fun Share_btn() {
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra(Intent.EXTRA_TEXT, "Hey, I tried this app. It has plenty of marathi quotes and i think you should give it a try\n" +
                "\uD83D\uDC47The App Link\uD83D\uDC47\n" +
                "https://play.google.com/store/apps/details?id=com.techboyy.marathi_quotes")
        intent.type = "text/plain"

        startActivity(Intent.createChooser(intent, "share using:"))
    }

    private fun toWriteActivity() {
        val intent = Intent(this, msg_activity::class.java)
        startActivity(intent)
    }
}