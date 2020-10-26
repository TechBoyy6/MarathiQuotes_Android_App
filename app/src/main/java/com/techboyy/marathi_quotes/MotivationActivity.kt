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


class MotivationActivity : AppCompatActivity(), ExampleAdapter.OnItemClickListner {

    var bigFb: com.facebook.ads.InterstitialAd? = null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AudienceNetworkAds.initialize(this)

        /*fun Ad() {
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

         */

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
            intent.putExtra(Intent.EXTRA_TEXT, "Hey, I tried this app. It has plenty of marathi quotes and i think you should give it a try\n" +
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
                "जिंकणे म्हणजे नेहमी फक्त पहिला येणे असे नसते, एखादी गोष्ट पूर्वीपेक्षा जास्त चांगली करणे म्हणजेच जिंकणे होय.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "खूप माणसांची स्वप्ने या एका विचारामुळे अपूर्ण राहतात तो म्हणजे 'लोक काय म्हणतील?",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "बोलून विचार करण्यापेक्षा बोलण्याआधी विचार केलेला बरा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "मनुष्या जवळची नम्रता संपली कि, त्याच्या जवळची माणुसकीच संपली म्हणून समजावे.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जीवनात चांगल्या माणसांना शोधू नका, स्वतः चांगले व्हा आणि कुणीतरी तुम्हाला शोधत येईल.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "स्वतः चा विकास करा, लक्षात ठेवा, गती आणि वाढ हीच जिवंतपणाचे लक्षण आहेत.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "विजेते वेगळ्या गोष्टी करत नाही ते प्रत्येक गोष्ट वेगळेपणाने करतात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "शब्दांपेक्षा शांत राहूनच जास्त आक्रमक होता येत.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "चुकण हि ‘प्रकृती’, मान्य करण हि ‘संस्कृती’ आणि सुधारणा करण ही ‘प्रगती’ आहे",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "ज्याच्याजवळ उमेद आहे तो कधीही हरू शकत नाही.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "स्वभावातील गोडीने आणि जिभेवरील माधुर्याने माणसे जोडली जातात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "भरलेला खिसा माणसाला दुनिया दाखवतो, रिकामा खिसा मात्र दुनियेतील माणसं दाखवतो.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "बालपणीच्या भातुकलीचे खेळ आज आठविले\n" +
                        "आठवणी त्या सोनेरी मनात मी लपविल्या",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "काही उत्तरे बुध्दीला पटतात, पण मनाला नाही? \n" +
                        "काही माणसं भेटतात, पण समजता येत नाही!",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "वाट पहात राहीले डोळे मातेचे अंतसमयी\n" +
                        "बाळ तिचा परदेशी कसा येणार परतुनी",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "पावलांना अंत नाही, वेदनांना गाव नाही.\n" +
                        "मनशांती मिळत नाही, मोह सुटत नाही.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "रोज नव्याने भेटायचे नव्या बहाण्याने हसायचे\n" +
                        "रोज नवीन हे जीवन रोज आनंदाने जगायचे",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "जाती धर्माचा कसला हा खेळ आहे..\n" +
                        "इथे माणुसच माणुसकीला मारत आहे..!!",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "आयुष्यात जो तुम्हाला मान देऊन सोबत घेऊन जाईल त्याचाच मान राखा.\n" +
                        "कारण हया जगात मान देवून कान भरणारे खूप आहेत",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "एकच नाही व्यथा, सगळ्यांच्या वेगळ्या कथा, किती वेदना मनाला, नाही अंत काही दुःखांना",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "सुंदर चेहरे पाहीले की लोक प्रेमात पडतात स्वभाव  चांगला असेल तर प्रेमाने एकत्र राहता येते",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "पाण्यात पाय सोडणं सुखदायी असतं, फक्त पाण्याशी मैत्री करता यायला हवी...",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "आईला जन्मापासुन ओळखतो, पण बाप या जगातुन गेल्यानंतर समजतो.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "समर्पणाविना सेवा जणू वातीविण दिवा",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "मला वाचण्यासाठी संयम ठेवावा लागेल तुम्हाला घाईत वाचणाऱ्यांच्या हातात मी पडतच नाही.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "वाटेवरील काचांपेक्षा जास्त आजकाल काही नजरा टोचतात...",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "एकच साथ हवी होती तुझ्या सोबत जगण्याची हाता मध्ये हात घेवूनी मृगजळ पाहण्याची",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "अजुनही त्याच पायरीवर वाट तुझी पाहते भिजून गेला पदर पण मन रिते राहते",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "माणस असलेल्या घरात राहू नका, माणसाच्या घरात रहा...",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "सार काही विसरून आत्ता वेड्या सारख जगायच, डोळे असून सुद्धा आंधळ्या सारख पहायच, खोट का होईना पण हासत हासत मरायच…",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "सर्वात मोठे यश खूप वेळा सर्वात मोठ्या निराशे नंतरच मिळत असते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "भरलेला खिसा माणसाला दुनिया दाखवतो, रिकामा खिसा मात्र दुनियेतील माणसं दाखवतो.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "स्वभावातील गोडीने आणि जिभेवरील माधुर्याने माणसे जोडली जातात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "खूप माणसांची स्वप्ने या एका विचारामुळे अपूर्ण राहतात तो म्हणजे “लोक काय म्हणतील?",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "चुकण हि ‘प्रकृती’, मान्य करण हि ‘संस्कृती’ आणि सुधारणा करण ही ‘प्रगती’ आहे.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "समजवण्यापेक्षा समजून घेण्यामध्ये खरी परीक्षा असते, कारण समजवण्यासाठी अनुभवाचा कस लागतो, तर समजून घेण्यासाठी मनाचा मोठेपणा लागतो.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "शब्दांपेक्षा शांत राहूनच जास्त आक्रमक होता येत.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "रस्ता सापडत नसेल तर…स्वत:चा रस्ता स्वत:च तयार करा.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "स्वत:ला जिंकायचे असेल तर डोक्याचा उपयोग करा; इतरांना जिंकायचे असेल तर हृदयाचा उपयोग करा.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "नेहमी तुमचे सर्वोत्तम प्रयत्न करा आणि हे करून देखील ते तुमची कदर करत नसतील तर तो त्यांचा दोष आहे तुमचा नाही.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "विजेते वेगळ्या गोष्टी करत नाही ते प्रत्येक गोष्ट वेगळेपणाने करतात.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "माझं प्रयत्न इतरांपेक्षा श्रेष्ठ असला पाहिजे अस नाही, पण जो मी काल होतो त्यापेक्षा आज अधिक चांगला हवा.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                " कोणतेही कार्य हे अडथळ्याशिवाय पार पडत नाही. शेवटपर्यंत जे प्रयत्न करीत राहतात त्यानांच यश प्राप्त होते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जीवनात चांगल्या माणसांना शोधू नका, स्वतः चांगले व्हा आणि कुणीतरी तुम्हाला शोधत येईल.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "मनुष्या जवळची नम्रता संपली कि, त्याच्या जवळची माणुसकीच संपली म्हणून समजावे.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "बोलून विचार करण्यापेक्षा बोलण्याआधी विचार केलेला बरा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "आपण झोपेत पाहतो ते खर स्वप्न नसते, तर आपली झोप उडवत तेच खर स्वप्न असतं.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "डोक शांत असेल तर निर्णय चुकत नाही, भाषा गोड असेल तर माणसं तुटत नाहीत.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "यशाकडे नेणारा सर्वात जवळचा मार्ग अजून तयार व्हायचा आहे.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "माणसाला दोनच गोष्टी हुशार बनवतात..एक म्हणजे वाचलेली पुस्तकं आणि दुसरी भेटलेली माणसं.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "आपल्या नियतीचे मालक बना पण परिस्थितीचे गुलाम बनू नका.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जगा इतकं कि आयुष्य कमी पडेल, हसा इतके कि आनंद कमी पडेल, काही मिळाले तर नशिबाचा खेळ आहे, पण प्रयत्न इतके करा कि परमेश्वराला देणे भागच पडेल.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "शरीराला श्रमाकडे, बुद्धीला मनाकडे आणि हृदयाला भावनेकडे वळविणे म्हणजे शिक्षण.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.five,
                "कोणी कौतुक करो वा टीका लाभ तुमचाच, कौतुक प्रेरणा देते, तर टीका सुधारण्याची संधी.",
                "manmajhesairat"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "मानवाचा दानव होणे ही त्याची हार, मानवाचा महामानव होणे, हा त्याचा चमत्कार आणि मानवाचा माणूस होणे हे त्याचे यश आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "स्वतःची तुलना इतरां बरोबर करू नका, तसे केल्यास तुम्ही स्वतःचा अपमान करता आहात.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "व्यक्तिमत्व सुंदर नसेल तर दिसण्याला काहीच अर्थ नाही. कारण सुंदर दिसण्यात अन असण्यात खूप फरक असतो.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "चांगला गुरु यशाचे दरवाजे उघडून देऊ शकतो, पण त्यातून यशाच्या दिशेने जाण्यासाठी स्वतःलाच चालावे लागते.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                " विश्वास हा खोडरबर सारखा असतो तुम्ही केलेल्या प्रत्येक चुकीबरोबर तो कमी होत जातो.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "नात्याची सुंदरता एकमेकांचे दोष स्वीकारण्यात आहे कारण एकही दोष नसलेल्या माणसाचा शोध घेत बसलात, तर आयुष्यभर एकटे राहाल.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "अडचणीत असतांना अडचणीपासून दूर पळणे म्हणजे अजून मोठ्या अडचणीत जाण्यासारखेच आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "मोठी स्वप्ने पाहणारेच मोठी स्वप्ने सत्यात उतरवतात.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जीवनात चांगला माणूस होण्यासाठी एवढंच करा. चुकाल तेव्हा माफी मागा, अन कुणी चुकलं तर माफ करा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "न हरता, न थकता न थाबंता प्रयत्न करण्यांसमोर कधी कधी नशीब सुध्दा हरत.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "कारण सांगणारी लोक यशस्वी होत नाही..आणि यशस्वी होणारे लोक कारण सांगत नाही.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "नाही हा शब्द तुम्हाला ऐकू येत नाही, तोपर्यंत सगळे काही शक्य आहे.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "स्वतः चा विकास करा, लक्षात ठेवा, गती आणि वाढ हीच जिवंतपणाचे लक्षण आहेत.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "विचार असे मांडा कि तुमच्या विचारांवर कुणीतरी विचार केलाच पाहिजे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                " ना कुणाशी स्पर्धा असावी, ना कुणाच्या पुढे जाण्याची आकांक्षा असावी, फक्त स्व्ठ्ला सिद्ध करण्याची जिद्द असावी.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "तुमच्या अपयशाला कवटाळून बसू नका त्याच्या पासून शिका आणि पुन्हा सुरवात करा.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "प्रयत्न करणे सोडू नका तुम्ही आधीच खूप खूप सोसलय आता त्याची बक्षीस मिळण्याची वेळ आली आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                " जेव्हा एक विज काळोख्या अंधारतून, कठोर जमिनीतून उगवू शकते तर तुम्ही का नाही.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "आपली खरी स्वप्न तीच आहेत जी आपल्याला रात्री उशिरापर्यंत जगण्यास आणि सकाळी लवकर उठण्यास भाग पाडतात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "आयुष्य हा बुद्धिबळाचा खेळ आहे जर टिकून राहायचे असेल तर चाली रचत राहाव्या लागतील.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "ज्याच्याजवळ उमेद आहे तो कधीही हरू शकत नाही.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "सर्वात मोठे यश खूप वेळा सर्वात मोठ्या निराशे नंतरच मिळत असते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "जिंकण्याची मजा तेव्हाच येते….जेव्हा सर्वजन तुमच्या हरण्याची वाट पाहत असतात….",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "माणसाच्या आयुष्यातील संकट ही यशाचा आनंद घेण्यासाठी आवश्यक आहेत.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.three,
                "तुम्ही ठरवलेल्या धेय्यावर लोक हसत नसतील तर तुमची ध्येये खुपच लहान आहेत हे लक्ष्यात घ्या.",
                "marathi_quotes__"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "तुमच्या धेय्यावरून जग तुम्हाला ओळखत असतं.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "स्वप्न पाहतच असालं तर मोठाच पाहा. लहान कशाला? कारण मोठी स्वप्नेच माणसाच रक्त ढवळू शकतात.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "खर्या अर्थाने सामर्थवान बनायचे असेल तर एकट्याने लढायला शिका.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "ध्येय दूर आहे म्हणून रस्ता सोडू नका.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "तुमचा आजचा संघर्ष तुमचे उद्याचे सामर्थ निर्माण करतो त्यामुळे विचार बदला आणि! बदला तुमचे आयुष्य.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "यशस्वी होण्यासाठी तुमची यशस्वी होण्याची इछा अपयशी होण्याच्या भितिपेक्षा अधिक प्रबळ असली पाहिजे",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "ज्याला संधि मिलते तो नशीबवान. जो संधि निर्माण करतो तो बुद्धिवान. आणि जो संधिचे सोने करतो तो विजेता.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "यशाचा उत्तम मार्ग म्हणजे अजुन एकदा प्रयत्न करने होय",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                " विजेते वेगळ्या गोष्टी करत नाहीत. गोष्टी करत नाहीत. ते प्रत्येक गोष्ट वेगालळेपनाने करतात.",
                "motivateoneself"
            )
        )
        data.add(ExampleItem(R.drawable.four, "उठा आणि संघर्ष करा!", "_marathi.quotes"))
        data.add(
            ExampleItem(
                R.drawable.six,
                "स्वत:वर विश्वास ठेवता पण हा यशस्वी होण्याच्या मर्गातला पहिला टप्पा आहे.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "स्वप्न मोफतच असतात, फक्त त्यांचा पाठलाग करतांना आयुष्यात बरीच किंमत मोजावी लागते….",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                " काहीही झाल तरी प्रयत्न सोडू नका.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "यश हे सोपे कारण ते कशाच्या तरी तुलनेत असते, पण समाधान हे महाकाठीन, कारण त्याला मनाचीच परवानगी लागते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "प्रत्येक पाऊल योग्य नसते, पण धोके पत्करून त्यातून जे शिकत जातात ते धेय्य नक्क्की गाढतात.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "व्यक्तीमत्व सुंदर नसेल तर दिसण्याचा काहीच अर्थ नाही. कारण सुंदर दिसण्यात अन सुंदर असण्यात खूप फरक असतो.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "कधी कधी देव तुमची परीस्तीती बदलत नाही कारण त्याला तुमची मनस्थिती बदलायची असते.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "खूप मोठा अडथळा आला की समजावं आपण विजयाच्या जवळ आलो.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "अनुभवाने एक शिकवण दिली आहे, कुणाच्या चुका उणीवा शोधात बसू नका. नियती बघुन घेईल हिशोब तुम्ही करू नका.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "संकट तुमच्यातली शक्ती आणि जिद्द पाहण्यासाठीच येत असतात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "ज्याच्या जीवनामध्ये निश्चित धेय्य नसते, त्यालाच वेळ घालवण्यासाठी साधन शोधण्याची गरज असते.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "विजेते वेगळ्या गोष्टी करत नाही ते प्रत्येक गोष्ट वेगळेपणाने करतात.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "न हरता, न थकता न थांबता प्रयत्न करण्यासमोर कधी कधी नसीब सुद्धा हरत.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.four,
                "ज्याच्याजवळ उमेद आहे तो कधीही हरू शकत नाही.",
                "_marathi.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "कल्पनाशक्ती ही ज्ञानापेक्षा जास्त महत्वाची आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "कारणं सांगणारे लोक यशस्वी होत नाही. आणि यशस्वी होणारे लोकं “करणं” सांगत नाही.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "अपेक्षा अनपेक्षितरीत्या पूर्ण होतात. पण त्यासाठी भरपूर सहनशक्ती पाळणे आवश्यक ठरते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "जीवनात एकदा तरी “वाईट” दिवसांना सामोरे गेल्याशिवाय “चांगल्या” दिवसांची गरज काळात नाही.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "जीवन…. चांदन तेच असल तरी रात्र अगदी नवीन आहे…आयुष्य मात्र एकदाच का? हा प्रश्न जरा कठीण आहे…",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "निसर्गाचे नेहमीच अनुकरण करा, संयम हे त्याचे रहस्य होय.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "संकटात सापडल्यावरच माणूस स्वतःला ओळखतो.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "करू ना ! काय घाई आहे, म्हटलं कि ती गोष्ट होतचं नाही. आजचा दिवसच योग्य.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "देवाने तळहातावर नशिबाच्या रेष तर दिल्यात पण. मी विसरलोय त्याचा रंग ज्याचा त्यानेच भरायचा असतो.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "यशाची गुरुकिल्ली म्हणजे स्वतःला ओळखणं.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "आयुष्य सहज सोप जगायला शिका, तरच ते सुंदर होईल.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "अचूकता पाहिजे तर सराव महत्वाचा.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "चांगले पुस्तक म्हणजे मानवी आत्म्याचे अतिशुद्धी सार असते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.six,
                "मूर्ख माणूस शांत बसू शकत नाही.",
                "marathii.quotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "जगातील सर्व विचारी डोक्यांपेक्षा एक प्रेमळ अंतकरण श्रेष्ठ असते.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "दृष्टीकोन हा मनाचा आरसा आहे, तो नेहमी विचारच परावर्तीत करतो.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "खोटेपणा करणारा चोरांपेक्षाही वाईट असतो.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.two,
                "विचार करा निर्णय घ्या, आणि तुम्हाला जे योग्य वाटत तेच करा.",
                "marathisayings"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "वेळेचा सदुपयोग न करणे म्हणजे वेळ न मिळाल्यासारखेच आहे.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.one,
                "खूप हुशारीपेक्षा चिमुटभर विवेक श्रेष्ठ असतो.",
                "marathiquotes"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "लहान मुले म्हणजे देवा घरची फुलच.जसे जीवन असते तसा त्याचा अंत असतो.",
                "motivateoneself"
            )
        )
        data.add(
            ExampleItem(
                R.drawable.ic_person_black_24dp,
                "एक मिनिट उशिरा येण्यापेक्षा तीन तास लवकर येणे चांगले.",
                "motivateoneself"
            )
        )


    }


    override fun onItemClick(currentItem: ExampleItem) {

        val intent = Intent(this@MotivationActivity, PageDetail::class.java)
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