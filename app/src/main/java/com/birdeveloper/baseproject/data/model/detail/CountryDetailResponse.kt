package com.birdeveloper.baseproject.data.model.detail

import com.google.gson.annotations.SerializedName

data class CountryDetailResponse (
    @SerializedName("data")
    val data: CountryDetail
)