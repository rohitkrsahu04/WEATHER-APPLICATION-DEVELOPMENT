package com.example.weatherapp
import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Streaming

interface ApiInterface {
    @GET("weather")
    fun getweatherData(

        @Query("q") city: String,
        @Query("appid") appid: String,
        @Query("units") units: String
    ) :retrofit2.Call<weatherapp>
}
