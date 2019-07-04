package com.example.concreteaplication.API.Utils

import com.example.concreteaplication.Model.Repositorio
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitUtils{
    companion object{
        fun getRepositorio(): Repositorio? {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.github.com")
                .build()
            return retrofit.create<Repositorio>(Repositorio::class.java)
        }
    }
}
