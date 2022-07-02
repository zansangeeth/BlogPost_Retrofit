package com.zasa.blogexplorer.models

/**
 **@Project -> BlogExplorer
 **@Author -> Sangeeth on 7/2/2022
 */
data class User(
    val id : Int,
    val name : String,
    val username : String,
    val email : String,
    val website : String,
    val company : Company
)
