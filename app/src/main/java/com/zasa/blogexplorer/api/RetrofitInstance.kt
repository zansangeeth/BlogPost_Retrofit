package com.zasa.blogexplorer.api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 **@Project -> BlogExplorer
 **@Author -> Sangeeth on 7/2/2022
 */

private val BASE_URL = "https://jsonplaceholder.typicode.com/"

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val api : BlogAPI by lazy {
        retrofit.create(BlogAPI::class.java)
    }

}