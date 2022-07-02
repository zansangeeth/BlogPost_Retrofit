package com.zasa.blogexplorer.api

import com.zasa.blogexplorer.models.Post
import retrofit2.http.GET

/**
 **@Project -> BlogExplorer
 **@Author -> Sangeeth on 7/2/2022
 */
interface BlogAPI {

    @GET("posts")
    suspend fun getPosts() : List<Post>

}