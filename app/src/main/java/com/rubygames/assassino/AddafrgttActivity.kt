package com.rubygames.assassino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.rubygames.assassino.AllInOneClasss.Companion.MAIN_IDgtgttg
import com.rubygames.assassino.AllInOneClasss.Companion.appsCheckgtgt


class AddafrgttActivity : AppCompatActivity() {

    private fun intALonegtgt() {
        val intentgtgttg = Intent(this@AddafrgttActivity, GaaameeeeActivity::class.java)
        Hawk.put(AllInOneClasss.geogtgt, null)
        Hawk.put(AllInOneClasss.countryCodegtgt, null)
        startActivity(intentgtgttg)
        finish()
    }

    private fun intAfbgtgtt() {
        val intent = Intent(this@AddafrgttActivity, AppsFlyyyActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addafrgtt)
        checkCountrygtgttg()
    }

    private fun getShDatafrrfr(): String? {
        val restCheck: String? = Hawk.get(appsCheckgtgt)
        return restCheck
    }

    private fun checkCountrygtgttg() {

        val check = getShDatafrrfr()

        if (check == "0") {
            intALonegtgt()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                getAdIdgttg()
            }

            intAfbgtgtt()
        }
    }

    private fun getAdIdgttg(){
        val frfrrf = AdvertisingIdClient(applicationContext)
        frfrrf.start()
        val ggtgttt = frfrrf.info.id
        Hawk.put(MAIN_IDgtgttg, ggtgttt)
    }


}