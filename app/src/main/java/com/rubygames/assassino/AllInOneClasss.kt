package com.rubygames.assassino

import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import android.app.Application


class AllInOneClasss : Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ftgtt)
        Hawk.init(this).build()
    }

    companion object {
        const val ftgtt = "407f1532-62f5-4e24-92f2-a98d2ff2ad4a"
        var appsCheckgtgt = "appsChecker"
        var countryCodegtgt: String? = "countryCode"
        var geogtgt = "geo"
        var C1rgttg: String? = "c11"
        var linkgtgtg = "link"
        var MAIN_IDgtgttg: String? = "mainid"
        var DEEPLgttt: String? = "d11"
    }
}