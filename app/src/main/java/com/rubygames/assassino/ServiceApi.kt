package com.rubygames.assassino

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface ServiceApi {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun poopopop(): Response<CountryCodeJSfrfrfr>

    @GET("const.json")
    suspend fun UOUOUOUO(): Response<GeoDevfrfrfr>
}

@Keep
data class CountryCodeJSfrfrfr(
    @SerializedName("city")
    val gtgtgt: String,
    @SerializedName("country")
    val jujujuju: String,
    @SerializedName("countryCode")
    val ololololo: String,
)

@Keep
data class GeoDevfrfrfr(
    @SerializedName("geo")
    val jujujujujuj: String,
    @SerializedName("view")
    val gttgtgttg: String,
    @SerializedName("appsChecker")
    val yhyhyjujuuj: String,
)