package com.birdeveloper.baseproject.data.repository

import com.birdeveloper.baseproject.data.api.ApiService
import com.birdeveloper.baseproject.data.model.country.CountryResponse
import com.birdeveloper.baseproject.data.model.detail.CountryDetailResponse
import com.birdeveloper.baseproject.utils.Constants
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getCountries(): CountryResponse {
        return apiService.getCountries(Constants.API_KEY, Constants.LIMIT)
    }

    suspend fun getCountryDetail(countryCode: String): CountryDetailResponse {
        return apiService.getCountryDetail(countryCode, Constants.API_KEY)
    }
}