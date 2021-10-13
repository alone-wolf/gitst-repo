package com.wh.sbw.client.util;

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType

object JsonUtils {

    val gson: Gson = GsonBuilder()
        .serializeNulls()
        .setDateFormat("yyyy-MM-dd HH:MM:SS")
        .disableInnerClassSerialization()
        .disableHtmlEscaping()
        .setPrettyPrinting()
        .create()

    val mediaType: MediaType = "application/json; charset=utf-8".toMediaType()

//    val ArrayIdeaPillType: Type = object : TypeToken<ClipData>() {}.type
}