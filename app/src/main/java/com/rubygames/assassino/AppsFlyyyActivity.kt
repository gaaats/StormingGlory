package com.rubygames.assassino

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.rubygames.assassino.AllInOneClasss.Companion.C1rgttg
import com.rubygames.assassino.AllInOneClasss.Companion.DEEPLgttt
import com.rubygames.assassino.AllInOneClasss.Companion.appsCheckgtgt
import com.rubygames.assassino.AllInOneClasss.Companion.countryCodegtgt
import com.rubygames.assassino.AllInOneClasss.Companion.geogtgt
import com.rubygames.assassino.databinding.ActivityAppsFlyyyBinding
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


class AppsFlyyyActivity : AppCompatActivity() {


    private fun intLONEfgtgt() {
        val intenthjuuu = Intent(this@AppsFlyyyActivity, GaaameeeeActivity::class.java)
        Hawk.put(geogtgt, null)
        Hawk.put(countryCodegtgt, null)
        Hawk.put(AllInOneClasss.appsCheckgtgt, null)
        startActivity(intenthjuuu)
        finish()
    }

    lateinit var bindAsf: ActivityAppsFlyyyBinding

    private val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(C1rgttg, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        bindAsf = ActivityAppsFlyyyBinding.inflate(layoutInflater)
        setContentView(bindAsf.root)

        val appsCh: String? = Hawk.get(appsCheckgtgt, "null")

        if (appsCh == "1") {
            AppsFlyerLib.getInstance()
                .init("ESpV7pEhnh7i8QTxr5ch47", conversionDataListener, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        gtgthy()

    }


    private fun intWE() {
        val intent = Intent(this@AppsFlyyyActivity, OpenPolicyyyActivity::class.java)
        Hawk.put(geogtgt, null)
        Hawk.put(countryCodegtgt, null)
        Hawk.put(AllInOneClasss.appsCheckgtgt, null)
        startActivity(intent)
        finish()
    }


    private fun gtgthy() {

        val ftgtt: String = Hawk.get(geogtgt)
        val gtghylp: String = Hawk.get(countryCodegtgt, "null")

        val deeplinkgtgt: String? = Hawk.get(DEEPLgttt, "null")
        val appsChgtghy: String? = Hawk.get(appsCheckgtgt, "null")
        var namingghyh: String? = Hawk.get(C1rgttg)

        if (appsChgtghy == "1") {
            val executorServicegtgyh = Executors.newSingleThreadScheduledExecutor()
            executorServicegtgyh.scheduleAtFixedRate({
                if (namingghyh != null) {

                    if (namingghyh!!.contains("tdb2") || ftgtt.contains(gtghylp) || deeplinkgtgt!!.contains(
                            "tdb2"
                        )
                    ) {
                        executorServicegtgyh.shutdown()

                        intWE()
                    } else {
                        executorServicegtgyh.shutdown()

                        intLONEfgtgt()
                    }
                } else {
                    namingghyh = Hawk.get(C1rgttg)
                }
            }, 0, 1, TimeUnit.SECONDS)
        } else if (ftgtt.contains(gtghylp)) {

            intWE()
        } else {
            intLONEfgtgt()
        }

    }


}
