package com.asep.ruhkehidupan.api

import com.asep.ruhkehidupan.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
        private fun getRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BuildConfig.API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        fun getApiService(): ApiService {
            return getRetrofit().create(ApiService::class.java)
        }
}