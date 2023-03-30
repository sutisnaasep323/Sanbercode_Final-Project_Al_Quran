package com.asep.ruhkehidupan.data

import com.asep.ruhkehidupan.model.Dzikir

object DataDoaHarian {

    private val number = arrayOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11"
    )

    private val judul = arrayOf(
        "Doa Ketika Keluar Rumah (1)",
        "Doa Ketika Keluar Rumah (2)",
        "Doa Berlindung dari Wabah",
        "Doa Mohon Rezeki Halal & Lunas Utang",
        "Doa Memohon Kebaikan di Seluruh Perkara",
        "Doa Berlindung dari Hilangnya Nikmat",
        "Doa Memohon Kemudahan",
        "Doa Ketika Dalam Kesulitan",
        "Doa Memohon Hidayah, Ketakwaan, Iffah, dan Kekayaan Jiwa",
        "Doa Memohon Kebaikan Dunia dan Akhirat",
        "Doa Penutup Sebelum Tidur"
    )

    private val arabic = arrayOf(
        "بِسْمِ اللّٰهِ تَوَكَّلْتُ عَلَى اللّٰهِ، لَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللّٰهِ",

        "اَللّٰهُمَّ إنِّي أَعُوذُ بِكَ أَنْ أَضِلَّ أَوْ أُضَلَّ، أَوْ أَزِلَّ أَوْ أُزَلَّ، أَوْ أَظْلِمَ أَوْ أُظْلَمَ، أَوْ أَجْهَلَ أَوْ يُجْهَلَ عَلَيَّ",

        "اَللّٰهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْبَرَصِ، وَالْجُنُونِ، وَالْجُذَامِ، وَمِنْ سَيِّئِ اْلأَسْقَامِ",

        "اَللّٰهُمَّ اكْفِنِي بِحَلَالِكَ عَنْ حَرَامِكَ وَأَغْنِنِي بِفَضْلِكَ عَمَّنْ سِوَاكَ",

        "اَللّٰهُمَّ رَحْمَتَكَ أَرْجُو، فَلَا تَكِلْنِى إِلَى نَفْسِى طَرْفَةَ عَيْنٍ، وَأَصْلِحْ لِى شَأْنِى كُلَّهُ، لَا إِلٰهَ إِلَّا أَنْتَ",

        "اَللّٰهُمَّ إِنِّيْ أَعُوْذُ بِكَ مِنْ زَوَالِ نِعْمَتِكَ، وَتَحَوُّلِ عَافِيَتِكَ، وَفُجَاءَةِ نِقْمَتِكَ، وَجَمِيْعِ سَخَطِكَ",

        "اَللّٰهُمَّ لَا سَهْلَ إِلَّا مَا جَعَلْتَهُ سَهْلًا، وَأَنْتَ تَجْعَلُ الْحَزْنَ إِذَا شِئْتَ سَهْلًا",

        "لَا إِلٰهَ إِلَّا اللّٰهُ الْعَظِيْمُ الْحَلِيْمُ، لَا إِلٰهَ إِلَّا اللّٰهُ رَبُّ الْعَرْشِ الْعَظِيْمِ، لَا إِلٰهَ إِلَّا اللّٰهُ رَبُّ السَّمٰوَاتِ وَ رَبُّ اْلأَرْضِ وَ رَبُّ الْعَرْشِ الْكَرِيْمِ",

        "اَللّٰهُمَّ إِنِّي أَسْأَلُكَ الْهُدَى، وَالتُّقَى، وَالْعَفَافَ، وَالْغِنَى",

        "رَبَّنَا آتِنَا فِى الدُّنْيَا حَسَنَةً وَفِي اْلآخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ",

        "اَللَّهُمَّ أَسْلَمْتُ نَفْسِيْ إِلَيْكَ، وَفَوَّضْتُ أَمْرِيْ إِلَيْكَ، وَوَجَّهْتُ وَجْهِيَ إِلَيْكَ، وَأَلْجَأْتُ ظَهْرِيْ إِلَيْكَ، رَغْبَةً وَرَهْبَةً إِلَيْكَ، لاَ مَلْجَأَ وَلاَ مَنْجَا مِنْكَ إِلاَّ إِلَيْكَ، آمَنْتُ بِكِتَابِكَ الَّذِيْ أَنْزَلْتَ وَبِنَبِيِّكَ الَّذِيْ أَرْسَلْتَ"

    )

    private val indonesia = arrayOf(
        "“Dengan nama Allah, aku bertawakkal kepada Allah. tidak ada daya dan kekuatan kecuali dengan pertolongan Allah.“",

        "“Ya Allah, aku berlindung kepada-Mu dari kesesatan diriku atau disesatkan orang lain, dari ketergelinciran diriku atau digelincirkan orang lain, dari menzholimi diriku atau dizholimi orang lain, dari kebodohan diriku atau dijahilin orang lain.“",

        "“Ya Allah, aku berlindung kepada-Mu dari penyakit kulit, gila, lepra, dan dari penyakit yang buruk lainnya.“",

        "“Ya Allah, berilah aku kecukupan dengan rezeki yang halal, sehingga aku tidak memerlukan yang haram, dan berilah aku kekayaan dengan karuniamu, sehingga aku tidak memerlukan bantuan orang lain, selain diri-Mu.”",

        "“Ya Allah, dengan rahmat-Mu, aku berharap, janganlah Engkau sandarkan urusanku pada diriku walau sekejap mata, perbaikilah segala urusanku seluruhnya, tidak ada ilah yang berhak disembah selain Engkau“",

        "“Ya Allah, aku berlindung kepada-Mu dari hilangnya kenikmatan yang telah Engkau berikan, dari berubahnya kesehatan yang telah Enkau anugerahkan, dari siksa-Mu yang datang tiba-tiba, dan dari semua kemurkaan-Mu.“",

        "“Ya Allah, tidak ada kemudahan kecuali yang Engkau buat mudah. Dan engkau menjadikan kesedihan (kesulitan), jika Engkau kehendaki pasti akan menjadi mudah.“",

        "“Tiada Tuhan yang berhak diibadahi kecuali Allah Yang Maha Agung dan Maha Penyantun, Tiada Tuhan yang berhak diibadahi kecuali Allah Rabb Penguasa Arsy yang agung, Tiada Tuhan yang berhak disembah kecuali Allah Rabb langit dan bumi, serta Rabb Arsy yang mulia.“",

        "“Ya Allah, sesungguhnya aku memohon kepada-MU hidayah (petunjuk), ketaqwaan, iffah (kehormatan diri / terhindar dari yang haram), serta memohon kepada-MU kekayaan jiwa.“",

        "“Ya Allah, berikanlah kepada kami kebaikan di dunia dan berikan pula kebaikan di akhirat, dan lindungilah kami dari siksa api neraka.“",

        "“Ya Allah, aku menyerahkan diriku kepadaMu, aku menyerahkan urusanku kepadaMu, aku menghadapkan wajahku kepadaMu, aku menyandarkan punggungku kepadaMu, karena senang (mendapatkan rahmatMu) dan takut pada (siksaanMu, bila melakukan kesalahan). Tidak ada tempat perlindungan dan penyelamatan dari (ancaman)Mu, kecuali kepadaMu. Aku beriman pada kitab yang telah Engkau turunkan, dan (kebenaran) NabiMu yang telah Engkau utus.“"

    )

    private val dalil = arrayOf(
        "(HR. Abu Dawud, no. 5095; At-Tirmidzi, no. 3426)",
        "(HR. Abu Dawud, no. 5094; Ibnu Majah, no. 3884)",
        "(HR. Abu Dawud, no. 1554)",
        "(HR. Tirmidzi, no. 3563; Ahmad, no. 1319)",
        "(HR. Abu Dawud, no. 5090)",
        "(HR. Muslim, no.2739)",
        "(HR. Ibnu as-Sunni dalam 'Amal Al-Yaum wa Al-Lailah no. 351)",
        "(HR. Bukhari, no. 6346)",
        "(HR. Muslim, no. 2721)",
        "(QS. Al-Baqarah: 201)",
        "(HR. Bukhari, no. 6313; Muslim, no. 2710)"
    )

    val listDataDoaHarian: ArrayList<Dzikir>
        get() {
            val list = arrayListOf<Dzikir>()
            for (position in arabic.indices) {
                val dzikir = Dzikir()
                dzikir.judul = judul[position]
                dzikir.number = number[position]
                dzikir.arabic = arabic[position]
                dzikir.indonesia =indonesia[position]
                dzikir.dalil =dalil[position]
                list.add(dzikir)
            }
            return list
        }
}