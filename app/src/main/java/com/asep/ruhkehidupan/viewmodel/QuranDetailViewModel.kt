package com.asep.ruhkehidupan.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.asep.ruhkehidupan.api.ApiConfig
import com.asep.ruhkehidupan.model.AyahsItem
import com.asep.ruhkehidupan.model.QuranDetailResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class QuranDetailViewModel : ViewModel() {

    private val _listDetailSurah = MutableLiveData<List<AyahsItem>>()
    val listDetailSurah: LiveData<List<AyahsItem>> = _listDetailSurah

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    fun setListSurah(id: Int) {
        _isLoading.value = true
        val apiService = ApiConfig.getApiService()
        val callback = object : Callback<QuranDetailResponse> {
            override fun onResponse(
                call: Call<QuranDetailResponse>,
                response: Response<QuranDetailResponse>
            ) {
                _isLoading.value = false
                if (response.isSuccessful) {
                    val detailSurah = response.body()?.data?.ayahs
                    Log.i("detail", detailSurah.toString())
                    _listDetailSurah.value = response.body()?.data?.ayahs
                } else {
                    Log.e("failure", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<QuranDetailResponse>, t: Throwable) {
                _isLoading.value = false
                Log.e("failure", t.toString())
            }
        }
        apiService.getDetailSurah(id).enqueue(callback)
    }

}
