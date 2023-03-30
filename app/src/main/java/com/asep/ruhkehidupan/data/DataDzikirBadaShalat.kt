package com.asep.ruhkehidupan.data

import com.asep.ruhkehidupan.model.Dzikir

object DataDzikirBadaShalat {

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
        "10"
    )

    private val arabic = arrayOf(
        """
            أَسْتَغْفِرُ اللّٰهَ (۳×)
            اَللّٰهُمَّ أَنْتَ السَّلَامُ، وَمِنْكَ السَّلَامُ، تَبَارَكْتَ يَا ذَا الْجَلَالِ وَاْلإِكْرَامِ
        """.trimIndent(),

        "لَا  ﺇِلٰهَ ﺇِلَّا اللّٰهُ وَحْدَهُ لَا شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ، اَللّٰهُمَّ لَا مَانِعَ لِمَا أَعْطَيْتَ، وَلَا مُعْطِيَ لِمَا مَنَعْتَ، وَلَا يَنْفَعُ ذَا الْجَدِّ مِنْكَ الْجَدُّ",

        "لَا ﺇِلٰهَ ﺇِلَّا اللّٰهُُ وَحْدَهُ لَا شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. لَا حَوْلَ وَلَا قُوَّةَ ﺇِلَّا بِاللّٰهِ، لَا  ﺇِلٰهَ ﺇِلَّا اللّٰهُ، وَلَا نَعْبُدُ ﺇِلَّا إِيَّاهُ، لَهُ النِّعْمَةُ وَلَهُ الْفَضْلُ وَلَهُ الثَّنَاءُ الْحَسَنُ، لَا  ﺇِلٰهَ ﺇِلَّا اللّٰهُ مُخْلِصِيْنَ لَهُ الدِّيْنَ وَلَوْ كَرِهَ الْكَافِرُوْنَ",

        """
            سُبْحَانَ اللّٰهِ (۳۳×)،
            اَلْحَمْدُ لِلّٰهِ (۳۳×)،
            اَللّٰهُ أَكْبَرُ (۳۳×)،
            لَا ﺇِلٰهَ ﺇِلَّا اللّٰهُُ وَحْدَهُ لَا شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ
        """.trimIndent(),

        """
            ۞ بِسْمِ ٱللّٰهِ ٱلرَّحْمٰنِ ٱلرَّحِيمِ ۞
            
            قُلْ هُوَ اللّٰهُ أَحَدٌ ۱۝ اَللّٰهُ الصَّمَدُ ۲۝ لَمْ يَلِدْ وَلَمْ يُولَدْ ۳۝ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ ٤۝
            """.trimIndent(),

        """
            ۞ بِسْمِ ٱللّٰهِ ٱلرَّحْمٰنِ ٱلرَّحِيمِ ۞
            
            قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ ۱۝ مِن شَرِّ مَا خَلَقَ ۲۝ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ ۳۝ وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ ٤۝ وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ ٥۝
            """.trimIndent(),

        """
            ۞ بِسْمِ ٱللّٰهِ ٱلرَّحْمٰنِ ٱلرَّحِيمِ ۞
            
            قُلْ أَعُوذُ بِرَبِّ النَّاسِ ۱۝ مَلِكِ النَّاسِ ۲۝ ﺇِلٰهِ النَّاسِ ۳۝ مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ ٤۝ الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ ٥۝ مِنَ الْجِنَّةِ وَالنَّاسِ ٦۝
            """.trimIndent(),

        """
             ۞ أَعُـوذُ بِاللّٰهِ مِنَ الـشَّيْطَانِ الـرَّجِيـمِ ۞

            اللّٰهُ لَآ ﺇِلٰهَ ﺇِلَّا هُوَ الْحَيُّ الْقَيُّومُ، لَا تَأْخُذُهُ سِنَةٌ وَلَا نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُۥۤ ﺇِلَّا بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِۦٓ ﺇِلَّا بِمَا شَآءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ ٥٥۲۝
        """.trimIndent(),

        "لَا ﺇِلٰهَ ﺇِلَّا اللّٰهُ وَحْدَهُ لَا شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، يُحْيِي وَيُمِيْتُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْر",

        "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلًا مُتَقَبَّلًا"
    )

    private val indonesia = arrayOf(
        "“Aku minta ampun kepada Allah,” (3x). “Ya Allah, Engkau pemberi keselamatan, dan dariMu keselamatan, Maha Suci Engkau, wahai Tuhan Yang Pemilik Keagungan dan Kemuliaan.”",

        "“Tiada Rabb yang berhak disembah selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya. Bagi-Nya puji dan bagi-Nya kerajaan. Dia Maha Kuasa atas segala sesuatu. Ya Allah, tidak ada yang mencegah apa yang Engkau berikan dan tidak ada yang memberi apa yang Engkau cegah. Tidak berguna kekayaan dan (serta kedudukan) seseorang tidak berguna untuk menhindari hukuman (azab) dariMu”",

        "“Tiada Rabb (yang berhak disembah) kecuali Allah, Yang Maha Esa, tidak ada sekutu bagi-Nya. Bagi-Nya kerajaan dan pujian. Dia Mahakuasa atas segala sesuatu. Tidak ada daya dan kekuatan kecuali (dengan pertolongan) Allah. Tiada Rabb (yang hak disembah) kecuali Allah. Kami tidak menyembah kecuali kepada-Nya. Bagi-Nya nikmat, anugerah dan pujian yang baik. Tiada Rabb (yang hak disembah) kecuali Allah, kami memurnikan ibadah hanya kepadaNya, sekalipun orang-orang kafir membencinya.”",

        "“Maha Suci Allah (33 x), segala puji bagi Allah (33 x), Allah Maha Besar (33 x). Tidak ada Rabb (yang berhak disembah) kecuali Allah Yang Maha Esa, tidak ada sekutu bagi-Nya. Bagi-Nya kerajaan. Bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.”",

        "“Katakanlah: 'Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala sesuatu. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia'.” (QS. Al Ikhlas: 1-4)",

        "“Katakanlah: 'Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dari kejahatan malam apabila telah gelap gulita, dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki'. (QS. Al Falaq: 1-5)",

        "“Katakanlah: 'Aku berlindung kepada Rabb manusia, Raja manusia, Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari (golongan) jin dan manusia'. (QS. An Naas: 1-6)",

        "“Allah, Yang tidak ada ilah (yang berhak disembah) kecuali Dia, Yang Mahahidup lagi terus-menerus mengurusi (makhluk-Nya). tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tidak ada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan dan di belakang mereka, dan mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi-Nya meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia-lah yang Mahatinggi lagi Mahabesar.” (QS. Al-Baqarah: 255)",

        "“Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Hanya milik-Nya kerajaan dan segala puji hanya bagi-Nya. yang Menghidupkan dan yang Mematikan Dia-lah yang berkuasa atas segala sesuatu.” (Dibaca 10 x sesudah shalat Maghrib dan shalat Subuh)",

        "“Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat, rizki yang baik dan amal yang diterima.” (Dibaca setelah shalat Shubuh)"

    )

    private val dalil = arrayOf(
        "(HR. Muslim, 1/414)",

        "(HR. Al-Bukhari, 1/255; dan Muslim, 1/414)",

        "(HR. Muslim, 1/415)",

        "Rasulullah ﷺ bersabda, “Barangsiapa yang membaca kalimat tersebut setiap selesai shalat, maka diampuni kesalahan-kesalahannya, sekalipun seperti buih lautan”\n\n(HR. Muslim, 1/418)",

        "(HR. Abu Dawud, 2/86. An-Nasa'i, 3/68. Lihat pula Shahih, At-Tirmidzi, 2/8)",

        "(HR. Abu Dawud, 2/86. An-Nasa'i, 3/68. Lihat pula Shahih, At-Tirmidzi, 2/8)",

        "(HR. Abu Dawud, 2/86. An-Nasa'i, 3/68. Lihat pula Shahih, At-Tirmidzi, 2/8)",

        "Rasulullah ﷺ bersabda, “Barangsiapa yang membacanya setiap selesai shalat, maka tidak ada yang menghalanginya masuk surga selain kematian“\n\n(HR. An-Nasa'i dalam 'Amal Al-Yaum wa Al-Lailah, no.100; Ibnu as-Sunni, no.121; dishahihkan oleh Al-AlBani dalam Shahih al-Jami, 5/329; dan Silsilah Al-Ahadits Ash-Shahihah, 2/697, no.972)",

        "(HR. Tirmidzi, 5/515; Ahmad, 4/227. Untuk takhrij hadits tersebut, lihat di Zad Al-Ma'ad, 1/300)",

        "(HR. Ibnu Majah dan ahli hadits yang lain. Lihat Shahih Ibnu Majah, 1/152 dan Majma' az-Zawa'id, 10/111)"
    )

    val listDzikirBadaShalat: ArrayList<Dzikir>
        get() {
            val list = arrayListOf<Dzikir>()
            for (position in arabic.indices) {
                val dzikir = Dzikir()
                dzikir.number = number[position]
                dzikir.arabic = arabic[position]
                dzikir.indonesia = indonesia[position]
                dzikir.dalil = dalil[position]
                list.add(dzikir)
            }
            return list
        }
}