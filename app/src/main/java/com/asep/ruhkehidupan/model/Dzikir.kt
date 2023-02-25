package com.asep.ruhkehidupan.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Dzikir(
    var judul: String? = " ",
    var number: String? = " ",
    var dibaca: String? = " ",
    var arabic: String? = " ",
    var latin: String? = " ",
    var indonesia: String? = " ",
    var dalil: String? = " ",
    var isExpandable: Boolean = false
): Parcelable