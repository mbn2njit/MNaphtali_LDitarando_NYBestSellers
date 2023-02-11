package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

class BestSellerMovie
{
    @JvmField
    @SerializedName("title")
    var title: String? = null

    //TODO bookImageUrl
    @SerializedName("movie_image")
    var bookImageUrl: String? = null

    //TODO description
    @SerializedName("description")
    var description: String? = null
}