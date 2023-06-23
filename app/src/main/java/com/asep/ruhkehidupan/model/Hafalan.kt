package com.asep.ruhkehidupan.model

data class Hafalan(
    val number: String,
    val judul: String,
    val arab: String,
    val indonesia: String,
    val dalil: String,
    var isExpandable: Boolean = false
)
