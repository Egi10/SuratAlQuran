package id.co.egifcb.suratal_quran.model

import com.google.gson.annotations.SerializedName

data class Response (
        @SerializedName("status")
        val status: String? = null,

        @SerializedName("hasil")
        val hasil: ArrayList<Surat>?)