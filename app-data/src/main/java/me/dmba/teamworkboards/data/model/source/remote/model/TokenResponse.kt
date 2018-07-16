package me.dmba.teamworkboards.data.model.source.remote.model

import com.google.gson.annotations.SerializedName

/**
 * Created by dmba on 7/16/18.
 */
data class TokenResponse(

    @SerializedName("access_token") val accessToken: String,

    @SerializedName("installation") val installation: Installation,

    @SerializedName("status") val status: String

)

data class Installation(

    @SerializedName("id") val id: Int,

    @SerializedName("name") val name: String,

    @SerializedName("region") val region: String,

    @SerializedName("apiEndPoint") val apiEndPoint: String,

    @SerializedName("url") val url: String,

    @SerializedName("chatEnabled") val chatEnabled: Boolean,

    @SerializedName("company") val company: Company,

    @SerializedName("logo") val logo: String

)

data class Company(

    @SerializedName("id") val id: Int,

    @SerializedName("name") val name: String,

    @SerializedName("logo") val logo: String

)
