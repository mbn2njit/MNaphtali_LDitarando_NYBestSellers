package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

class BestSellerMovie
{
    @JvmField
    @SerializedName("title")
    var title: String? = null

    //TODO bookImageUrl
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    //TODO description
    @SerializedName("overview")
    var description: String? = null
}