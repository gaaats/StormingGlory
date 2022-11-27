package com.rubygames.assassino

import androidx.appcompat.app.AppCompatActivity
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.rubygames.assassino.AllInOneClasss.Companion.C1rgttg
import com.rubygames.assassino.AllInOneClasss.Companion.DEEPLgttt
import com.rubygames.assassino.AllInOneClasss.Companion.MAIN_IDgtgttg
import com.rubygames.assassino.AllInOneClasss.Companion.linkgtgtg
import com.rubygames.assassino.databinding.ActivityOpenPolicyyyBinding
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException
import android.os.*
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib



class OpenPolicyyyActivity : AppCompatActivity() {

    private fun apapapap(uri: String): Boolean {

        val mpmpmpmpm = packageManager
        try {

            mpmpmpmpm.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private fun ftgttwebSettings() {
        val gtgtt = gthyhujuu.settings
        gtgtt.javaScriptEnabled = true

        gtgtt.useWideViewPort = true

        gtgtt.loadWithOverviewMode = true
        gtgtt.allowFileAccess = true
        gtgtt.domStorageEnabled = true
        gtgtt.userAgentString = gtgtt.userAgentString.replace("; wv", "")

        gtgtt.javaScriptCanOpenWindowsAutomatically = true
        gtgtt.setSupportMultipleWindows(false)

        gtgtt.displayZoomControls = false
        gtgtt.builtInZoomControls = true
        gtgtt.setSupportZoom(true)

        gtgtt.pluginState = WebSettings.PluginState.ON
        gtgtt.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        gtgtt.setAppCacheEnabled(true)

        gtgtt.allowContentAccess = true
    }

    private val gtgtgt = 1

    var frfrrf: ValueCallback<Array<Uri>>? = null
    lateinit var gthyhujuu: WebView
    lateinit var frrgtttg: ActivityOpenPolicyyyBinding
    var ikioiol: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frrgtttg = ActivityOpenPolicyyyBinding.inflate(layoutInflater)
        setContentView(frrgtttg.root)

        gthyhujuu = frrgtttg.viviviviiveeee
        Snackbar.make(
            frrgtttg.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val gtgtrrr = CookieManager.getInstance()
        gtgtrrr.setAcceptCookie(true)
        gtgtrrr.setAcceptThirdPartyCookies(gthyhujuu, true)
        ftgttwebSettings()
        val acrgtgt: Activity = this
        gthyhujuu.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (apapapap(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                gthyyhy(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(acrgtgt, description, Toast.LENGTH_SHORT).show()
            }


        }
        gthyhujuu.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                frfrrf?.onReceiveValue(null)
                frfrrf = filePathCallback
                var frgthyju: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (frgthyju!!.resolveActivity(packageManager) != null) {

                    var drfrgtt: File? = null
                    try {
                        drfrgtt = jukiloo()
                        frgthyju.putExtra("PhotoPath", ikioiol)
                    } catch (ex: IOException) {
                    }

                    if (drfrgtt != null) {
                        ikioiol = "file:" + drfrgtt.absolutePath
                        frgthyju.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(drfrgtt)
                        )
                    } else {
                        frgthyju = null
                    }
                }
                val cfdfdde = Intent(Intent.ACTION_GET_CONTENT)
                cfdfdde.addCategory(Intent.CATEGORY_OPENABLE)
                cfdfdde.type = "image/*"
                val tgtgt: Array<Intent?> =
                    frgthyju?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val gtgthyhhy = Intent(Intent.ACTION_CHOOSER)
                gtgthyhhy.putExtra(Intent.EXTRA_INTENT, cfdfdde)
                gtgthyhhy.putExtra(Intent.EXTRA_TITLE, getString(R.string.dfgtimage_chooserefrgtgttt))
                gtgthyhhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, tgtgt)
                startActivityForResult(
                    gtgthyhhy, gtgtgt
                )
                return true
            }

            @Throws(IOException::class)
            private fun jukiloo(): File {
                var frgtgy = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frgtgy.exists()) {
                    frgtgy.mkdirs()
                }

                frgtgy =
                    File(frgtgy.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frgtgy
            }

        }

        gthyhujuu.loadUrl(ftgtt())
    }


    private fun kpiiplkl(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val gtthynnmmnn = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gtthynnmmnn"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val nbbnbm =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $nbbnbm"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val mjmjjhhgf = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $mjmjjhhgf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    private fun ftgtt(): String {

        val spoontgt = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val hyjuuu = "com.rubygames.assassino"

        val defrr:String? = Hawk.get(C1rgttg, "null")
        val thyy: String? = Hawk.get(MAIN_IDgtgttg, "null")
        val dpOnedeefr: String? = Hawk.get(DEEPLgttt, "null")

        val afIdfrftg = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)



        val af_idfgtt = "deviceID="
        val subOneftgt = "sub_id_1="
        val adiddddd = "ad_id="
        val sub4ftgtgt = "sub_id_4="
        val sub5frgttg = "sub_id_5="
        val sub6frgt = "sub_id_6="


        val namingtgt = "naming"
        val deppgtgt = "deeporg"


        val gthyy = Build.VERSION.RELEASE

        val linkABfrgtgt = Hawk.get(linkgtgtg, "null")

        var aftgtgtt = ""
        if (defrr != "null"){
            aftgtgtt = "$linkABfrgtgt$subOneftgt$defrr&$af_idfgtt$afIdfrftg&$adiddddd$thyy&$sub4ftgtgt$hyjuuu&$sub5frgttg$gthyy&$sub6frgt$namingtgt"
            kpiiplkl(afIdfrftg.toString())
        } else {
            aftgtgtt = "$linkABfrgtgt$subOneftgt$dpOnedeefr&$af_idfgtt$afIdfrftg&$adiddddd$thyy&$sub4ftgtgt$hyjuuu&$sub5frgttg$gthyy&$sub6frgt$deppgtgt"
            kpiiplkl(afIdfrftg.toString())
        }
        Log.d("lolo", "res is $aftgtgtt")

        return spoontgt.getString("SAVED_URL", aftgtgtt).toString()
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gtgtgt || frfrrf == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var rerererer: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                rerererer = arrayOf(Uri.parse(ikioiol))
            } else {
                val gtgtggttg = data.dataString
                if (gtgtggttg != null) {
                    rerererer = arrayOf(Uri.parse(gtgtggttg))
                }
            }
        }
        frfrrf?.onReceiveValue(rerererer)
        frfrrf = null
    }




    var urlfififif = ""
    fun gthyyhy(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val gtgyhyj = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val defr = gtgyhyj.edit()
                defr.putString("SAVED_URL", lurlurlurlurlur)
                defr.apply()
            }
        }
    }

    private var yhygttt6 = false
    override fun onBackPressed() {


        if (gthyhujuu.canGoBack()) {
            if (yhygttt6) {
                gthyhujuu.stopLoading()
                gthyhujuu.loadUrl(urlfififif)
            }
            this.yhygttt6 = true
            gthyhujuu.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                yhygttt6 = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}




