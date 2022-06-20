package com.birdeveloper.baseproject.data.api

import com.birdeveloper.baseproject.data.model.country.CountryResponse
import com.birdeveloper.baseproject.data.model.detail.CountryDetailResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("countries")
    suspend fun getCountries(
        @Header("X-RapidAPI-Key") token: String,
        @Query("limit") limit: String
    ): CountryResponse

    @GET("countries/{countryCode}")
    suspend fun getCountryDetail(
        @Path("countryCode") countryCode: String,
        @Header("X-RapidAPI-Key") token: String
    ): CountryDetailResponse
}