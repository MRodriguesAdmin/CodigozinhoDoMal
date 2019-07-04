package com.example.concreteaplication.API

import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*
import com.example.concreteaplication.Model.Repositorio
import io.reactivex.Observable

//https://api.github.com/search/repositories?q=language:Java&sort=stars&page=1

//https://api.github.com/repos/<criador>/<repositÃ³rio>/pulls
interface ServiceAPI {
    @GET("/search/repositorio/")
        fun getRepositorio(@Query("q") q : String, @Query("page"), @Query("")) : Observable<Repositorio>
}