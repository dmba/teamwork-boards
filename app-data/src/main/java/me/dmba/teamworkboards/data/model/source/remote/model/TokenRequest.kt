package me.dmba.teamworkboards.data.model.source.remote.model

import com.google.gson.annotations.SerializedName

/**
 * Created by dmba on 7/16/18.
 */
data class TokenRequest(

    @SerializedName("code") val code: String

)
