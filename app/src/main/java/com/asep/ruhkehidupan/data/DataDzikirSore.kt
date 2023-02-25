package com.asep.ruhkehidupan.data

import com.asep.ruhkehidupan.model.Dzikir

object DataDzikirSore {

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
        "11",
        "12",
        "13",
        "14",
        "15",
        "16",
        "17",
        "18",
        "19",
        "20",
        "21",
        "22",
    )

    private val judul = arrayOf(
        "Membaca ayat Kursi",
        "Membaca Surat Al-Ikhlas",
        "Membaca Surat Al-Falaq",
        "Membaca Surat An-Naas",
        "Membaca Doa Perlindungan",
        "Membaca Doa Berserah Diri",
        "Membaca Sayyidul Istighfar",
        "Membaca Doa Persaksian",
        "Membaca Doa Bersyukur",
        "Membaca Doa Keselamatan",
        "Membaca Doa Kecukupan",
        "Membaca Doa Keselamatan",
        "Membaca Doa Perlindungan",
        "Membaca Doa Agar Terhindar dari Marabahaya",
        "Membaca Doa Keridhaan",
        "Membaca Doa Pertolongan",
        "Membaca Doa Kebaikan",
        "Membaca Doa Fitrah",
        "Membaca Tasbih dan Tahmid",
        "Doa yang Menggabungkan Banyak Kebaikan",
        "Membaca Doa Perlindungan",
        "Membaca Shalawat atas Nabi ﷺ"
    )

    private val dibaca = arrayOf(
        "Dibaca sore 1x",
        "Dibaca sore 3x",
        "Dibaca sore 3x",
        "Dibaca sore 3x",
        "Dibaca sore 1x",
        "Dibaca sore 1x",
        "Dibaca sore 1x",
        "Dibaca sore 4x",
        "Dibaca sore 1x",
        "Dibaca sore 3x",
        "Dibaca sore 7x",
        "Dibaca sore 1x",
        "Dibaca sore 1x",
        "Dibaca sore 3x",
        "Dibaca sore 3x",
        "Dibaca sore 1x",
        "Dibaca sore 1x",
        "Dibaca sore 1x",
        "Dibaca sore 100x",
        "Dibaca sore 10x / 1x jika malas",
        "Dibaca sore 3x",
        "Dibaca sore 10x"
    )

    private val arabic = arrayOf(
        """
            اللّٰهُ لَآ ﺇِلٰهَ ﺇِلَّا هُوَ الْحَيُّ الْقَيُّومُ، لَا تَأْخُذُهُ سِنَةٌ وَلَا نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُۥۤ ﺇِلَّا بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِۦٓ ﺇِلَّا بِمَا شَآءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ ٥٥۲۝
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

        "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ لِلّٰهِ، وَالْحَمْدُ لِلّٰهِ، لَا ﺇِلٰهَ ﺇِلَّا اللّٰهُ وَحْدَهُ لَا شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرٌ. رَبِّ أَسْأَلُكَ خَيْرَ مَا فِيْ هٰذِهِ اللَّيْلَةِ وَخَيْرَ مَا بَعْدَهَا، وَأَعُوْذُ بِكَ مِنْ شَرِّ مَا فِيْ هٰذِهِ اللَّيْلَةِ وَشَرِّ مَا بَعْدَهَا، رَبِّ أَعُوْذُ بِكَ مِنَ الْكَسَلِ وَسُوْءِ الْكِبَرِ، رَبِّ أَعُوْذُ بِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ",

        "اَللّٰهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوْتُ، وَإِلَيْكَ الْمَصِيْرُ",

        "اَللّٰهُمَّ أَنْتَ رَبِّيْ لَا ﺇِلٰهَ ﺇِلَّا أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ وَأَبُوْءُ بِذَنْبِيْ، فَاغْفِرْ لِيْ، فَإِنَّهُ لَا يَغْفِرُ الذُّنُوْبَ ﺇِلَّا أَنْتَ",

        "اَللّٰهُمَّ إِنِّيْ أَمْسَيْتُ أُشْهِدُكَ وَأُشْهِدُ حَمَلَةَ عَرْشِكَ، وَمَلَائِكَتَكَ، وَجَمِيْعَ خَلْقِكَ، أَنَّكَ أَنْتَ اللّٰهُ لَا ﺇِلٰهَ ﺇِلَّا أَنْتَ وَحْدَكَ لاَ شَرِيْكَ لَكَ، وَأَنَّ مُحَمَّدًا عَبْدُكَ وَرَسُوْلُكَ",

        "اَللّٰهُمَّ مَا أَمْسَى بِي مِنْ نِعْمَةٍ أَوْ بِأَحَدٍ مِنْ خَلْقِكَ، فَمِنْكَ وَحْدَكَ، لَا شَرِيكَ لَكَ، فَلَكَ الْحَمْدُ، وَلَكَ الشُّكْرُ",

        " اَللّٰهُمَّ عَافِنِى فِى بَدَنِى، اَللّٰهُمَّ عَافِنِى فِى سَمْعِى، اَللّٰهُمَّ عَافِنِى فِى بَصَرِى، لَا ﺇِلٰهَ ﺇِلَّا أَنْتَ، اَللّٰھُمَّ اِنِّیْ أَعُوْذُبِكَ مِنَ الْکُفْرِ وَالْفَقْرِ، وَأَعُوْذُبِكَ مِنْ عَذَابِ الْقَبْرِ، لَا ﺇِلٰهَ ﺇِلَّا أَنْتَ",

        "حَسْبِيَ اللّٰهُ لَا ﺇِلٰهَ ﺇِلَّا هُوَ، عَلَيْهِ تَوَكَّلْتُ، وَهُوَ رَبُّ الْعَرْشِ الْعَظِيمَِ",

        "اَللّٰهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللّٰهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ، اَللّٰهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللّٰهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ، وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ",

        "اَللّٰهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لَا ﺇِلٰهَ ﺇِلَّا أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرُّهُ إِلَى مُسْلِمٍ",

        "بِسْمِ اللّٰهِ الَّذِى لَا يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلَا فِى السَّمَاءِ، وَهُوَ السَّمِيعُ الْعَلِيمُ",

        "رَضِيْتُ بِاللّٰهِ رَبًّا، وَبِاْلإِسْلَامِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللّٰهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا",

        "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ، وَلَا تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ",

        "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ لِلّٰهِ رَبِّ الْعَالَمِيْنَ، اَللّٰهُمَّ إِنِّيْ أَسْأَلُكَ خَيْرَ هٰذِهِ اللَّيْلَةِ׃ فَتْحَهَا، وَنَصْرَهَا، وَنُوْرَهَا، وَبَرَكَتَهَا، وَهُدَاهَا، وَأَعُوْذُ بِكَ مِنْ شَرِّ مَا فِيْهَا وَشَرِّ مَا بَعْدَهَا",

        "أَمْسَيْنَا عَلَى فِطْرَةِ اْلإِسْلَامِ وَعَلَى كَلِمَةِ اْلإِخْلَاصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللّٰهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْركِيْنَ",

        "سُبْحَانَ اللّٰهِ وَبِحَمْدِهِ",

        "لَا ﺇِلٰهَ ﺇِلَّا اللّٰهُ وَحْدَهُ لَا شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُِ",

        "أَعُوْذُ بِكَلِمَاتِ اللَّهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ",

        "اَللّٰهُمَّ صَلِّ وَ سَلِّمْ عَلَى نَبِيِّنَا مُحَمَّدٍ"
    )

    private val indonesia = arrayOf(
        "“Allah, Yang tidak ada ilah (yang berhak disembah) kecuali Dia, Yang Mahahidup lagi terus-menerus mengurusi (makhluk-Nya). tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tidak ada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan dan di belakang mereka, dan mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi-Nya meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia-lah yang Mahatinggi lagi Mahabesar.” (QS. Al-Baqarah: 255)",

        "“Katakanlah: 'Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala sesuatu. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia'.” (QS. Al Ikhlas: 1-4)",

        "“Katakanlah: 'Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dari kejahatan malam apabila telah gelap gulita, dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki'. (QS. Al Falaq: 1-5)",

        "“Katakanlah: 'Aku berlindung kepada Rabb manusia, Raja manusia, Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari (golongan) jin dan manusia'. (QS. An Naas: 1-6)",

        "“Kami telah memasuki waktu sore dan kerajaan hanya milik Allah. segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Hanya milik-Nya kerajaan dan segala puji hanya bagi-Nya. Dia-lah Yang Mahakuasa atas segala sesuatu. Wahai Rabbku, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepada-Mu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepada-Mu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di alam kubur.”",

        "“Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu sore, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi. Dengan rahmat dan pertolongan-Mu kami hidup. dan dengan kehendak-Mu kami mati. Dan kepada-Mu (kami semua) akan dikembalikan.”",

        "“Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.”",

        "“Ya Allah, sesungguhnya aku di waktu sore ini mempersaksikan Engkau, malaikat yang memikul ‘Arys-Mu, malaikat-malaikat dan seluruh makhluk-Mu, bahwa sesungguhnya Engkau adalah Allah, tiada ilah yang berhak disembah kecuali Engkau semata, tiada sekutu bagi-Mu dan sesungguhnya Muhammad adalah hamba dan utusan-Mu.”",

        "“Ya Allah, nikmat apapun yang ada padaku di waktu sore atau yang ada pada setiap makhluk-Mu, semuanya hanya dari-Mu semata, tiada sekutu bagi-Mu, bagi-Mu segala puji dan bagi-Mu segala syukur.”",

        "“Ya Allah, selamatkan tubuhku (dari penyakit dan yang tidak aku inginkan). Ya Allah, selamatkan pendengaranku (dari penyakit dan maksiat atau sesuatu yang tidak aku inginkan), Ya Allah selamatkan penglihatanku. Tiada Ilah yang berhak diibadahi kecuali engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kekafiran, Aku berlindung kepada-Mu dari siksa kubur. Tidak ada ilah yang berhak diibadahi kecuali Engkau.”",

        "“Cukuplah Allah (sebagai penolong) bagiku, tiada tuhan yang berhak disembah kecuali Dia. Hanya kepadanya aku bertawakal, dan Dialah Rabb yang memiliki 'Arasy yang besar”",

        "“Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari depan, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar marabahaya dari bawah.”",

        "“Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku sendiri atau menularkannya kepada seorang muslim.”",

        "“Dengan Nama Allah, Yang dengan Nama-Nya tidak ada sesuatu pun yang memudharatkan di bumi maupun di langit, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.”",

        "“Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad ﷺ sebagai Nabi (yang diutus oleh Allah).”",

        "“Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dari-Mu).”",

        "“Kami memasuk waktu sore, dan kerajaan hanya milik Allah, Rabb semesta alam. Ya Allah, sesungguhnya aku memohon kepada-Mu kebaikan malam ini: Keberhasilan mencapai tujuan, kemenangan (menghadapi musuh), cahaya (ilmu dan taufik), keberkahan dan petunjuk yang ada padanya. Dan Aku berlindung kepada-Mu dari keburukan apa yang ada di dalamnya dan keburukan sesudahnya”",

        "“Di waktu sore kami memegang agama Islam, kalimat ikhlas (kalimat syahadat), agama Nabi kami Muhammad shallallahu ‘alaihi wa sallam, dan agama bapak kami Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.”",

        "“Maha suci Allah, aku memuji-Nya.”",

        "“Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Hanya milik-Nya kerajaan dan segala puji hanya bagi-Nya. Dia-lah yang berkuasa atas segala sesuatu.”",

        "“Aku berlindung dengan kalimat-kalimat Allah yang sempurna, dari kejahatan sesuatu yang diciptakan-Nya.”",

        "“Ya Allah, limpahkanlah shalawat dan salam kepada Nabi Kami, Muhammad ﷺ.”"
    )

    private val dalil = arrayOf(
        "Rasulullah ﷺ bersabda, “Barangsiapa yang membaca ayat ini di pagi hari, maka dia dijaga dari gangguan jin hingga petang hari. Barangsiapa membacanya di petang hari, maka dia dijaga dari gangguan jin hingga pagi hari“\n\n(HR. Al-Hakim 1/562, dan dishahihkan oleh Al-Bani dalam Shahih at-Targhib wa At-Tarhib 1/273 dan beliau menisbatkan hadits tersebut kepada An-Nasa'i dan Ath-Thabrani. beliau berkata, ”Sanad Ath-Thabrani jayyid (baik)”)",

        "Rasulullah ﷺ bersabda, “Barangsiapa yang membaca ketiga surat (Al-Ikhlas, Al-Falaq, An-Naas, pent) tersebut tiga kali setiap pagi dan petang, maka ketiga surat tersebut mencukupinya dari segala sesuatu”\n\n(HR. Abu Dawud 4/322, At-Tirmidzi 5/567 dan lihat Shahih At-Tirmidzi 3/182)",

        "Rasulullah ﷺ bersabda, “Barangsiapa yang membaca ketiga surat (Al-Ikhlas, Al-Falaq, An-Naas, pent) tersebut tiga kali setiap pagi dan petang, maka ketiga surat tersebut mencukupinya dari segala sesuatu”\n\n(HR. Abu Dawud 4/322, At-Tirmidzi 5/567 dan lihat Shahih At-Tirmidzi 3/182)",

        "Rasulullah ﷺ bersabda, “Barangsiapa yang membaca ketiga surat (Al-Ikhlas, Al-Falaq, An-Naas, pent) tersebut tiga kali setiap pagi dan petang, maka ketiga surat tersebut mencukupinya dari segala sesuatu”\n\n(HR. Abu Dawud 4/322, At-Tirmidzi 5/567 dan lihat Shahih At-Tirmidzi 3/182)",

        "(HR. Muslim, 4/2088)",

        "(HR. At-Tirmidzi, 5/466, dan lihat Shahih At-Tirmidzi, 3/142)",

        "Rasulullah ﷺ bersabda, “Barangsiapa membacanya dengan yakin di petang hari, lalu dia meninggal dunia pada malam itu maka dia masuk Surga. Dan demikian juga ketika pagi hari”\n\n(HR. Bukhari 7/150)",

        "Rasulullah ﷺ bersabda, “Barangsiapa membaca doa ini ketika pagi dan petang hari sebanyak empat kali, maka Allah akan membebaskannya dari api Neraka”\n\n(HR. Abu Dawud 4/317; al-Bukhari dalam Al-Adab Al-Murfrad no 1201; An-Nasa'i  dalam kitab 'Amal Al-Yaum wa Al-Lailah no.9 hal. 138; Ibnu as-Sunni,  no. 70; Syaikh Abdul Aziz bin Abdullah bin Baz menyatakan bahwa sanad hadits Abu Dawud dan An-Nasa'i adalah hasan, Lihat Tuhfah Al-Akhyar, Hal.23)",

        "Rasulullah ﷺ bersabda, “Barangsiapa yang membacanya di pagi hari, maka sungguh dia telah bersyukur pada hari itu. Barangsiapa yang membacanya di petang hari, maka sungguh dia telah bersyukur pada malam hari itu”\n\n(HR. Abu Dawud 4/318; An-Nasa'i dalam kitab 'Amal Al-Yaum wa Al-Lailah no.7 hal. 137; Ibnu as-Sunni,  no. 41 hal.23; dan Ibnu Hibban (Mawarid) no. 2361. Syaikh Abdul Aziz bin Baz menyatakan bahwa sanad hadits tersebut hasan, Lihat Tuhfah Al-Akhyar, Hal.24)",

        "(HR. Abu Dawud 4/324, Ahmad 5/42, An-Nasai dalam 'Amal Al-Yaum wa Al-Lailah no.22 hal. 146; Ibnu as-Sunni,  no. 69; dan Al-Bukhari dalam Al-Adab Al-Mufrad. Syaikh Abdul Aziz bin Baz menyatakan sanad hadits tersebut hasan. Lihat Tuhfah Al-Akhyar, Hal.26)",

        "Rasulullah ﷺ bersabda, “Barangsiapa membacanya di pagi dan petang hari sebanyak tujuh kali, maka Allah akan mencukupkan baginya dari perkara dunia dan akhirat yang menjadi keinginan (cita-cita)nya”\n\n(HR. Ibnu as-Sunni, no.71 secara marfu' dan Abu Dawud secara mauquf, 4/321. serta sanadnya dinyatakan shahih oleh Syu'aib dan Abdul Qadir Al-Arna'uth. Lihat Zad Al-Ma'ad, 2/342)",

        "(HR. Abu Dawud dan Ibnu Majah. Lihat Shahih Ibnu Majah, 2/332)",

        "(HR. At-Tirmidzi dan Abu Dawud. Lihat kitab Shahih At-Tirmidzi, 3/142)",

        "Rasulullah ﷺ bersabda, “Barangsiapa yang membacanya sebanyak tiga kali di pagi dan petang hari, maka tidak ada sesuatu pun yang membahayakan dirinya”\n\n(HR. Abu Dawud, 4/323; At-Tirmidz, 5/465; Ibnu Majah dan Ahmad. lihat Shahih Ibnu Majah, 2/332. dan Al-Allamah Ibnu Baz menghasankannya dalam Tuhfah Al-Akhyar, Hal.39)",

        "Rasulullah ﷺ bersabda, “Barangsiapa yang membacanya sebanyak tiga kali di pagi dan petang hari, maka Allah memberikan keridhaan-Nya kepadanya pada Hari Kiamat”\n\n(HR. Ahmad, 4/337; An-Nasa'i dalam 'Amal Al-Yaum wa Al-Lailah no.4; Ibnu as-Sunni,  no. 68; Abu Dawud, 4/418; At-Tirmidzi, 5/465; serta di hasankan oleh Ibnu Baz dalam Tuhfah Al-Akhyar, Hal.39)",

        "(HR. Al-Hakim dan beliau menshahihkannya, serta disetujui oleh Imam Adz-Dzahabi, lihat kitabnya 1/545. Lihat Shahih At-Targhib wa At-Tarhib 1/273)",

        "(HR. Abu Dawud, 4/322, dan sanadnya dihasankan oleh Syu'aib dan Abdul Qadir Al-Arnau'th dalam Takhrij Zad Al-Ma'ad, 2/273)",

        "(HR. Ahmad, 3/406-407, 5/123. Lihat Shahih Al-Jami', 4/290. Diriwayatkan juga oleh Ibnu As-Sunni dalam 'Amal Al-Yaum wa Al-Lailah no.34)",

        "Rasulullah ﷺ bersabda, ”Barangsiapa yang membacanya sebanyak seratus kali di pagi dan petang hari, maka pada Hari Kiamat nanti tidak ada seseorang pun yang membawa sesuatu yang lebih baik dari apa yang dibawanya kecuali seseorang yang membaca seperti apa yang dia baca atau lebih banyak dari itu.”\n\n(HR. Muslim 4/2071)",

        "(HR. Abu Dawud, 4/319; Ibnu Majah; dan Ahmad 4/60. Lihat Shahih At-Targhib wa At-Tarhib, 1/270; Shahih Abi Dawud, 3/957; Shahih Ibnu Majah, 2/331; dan Zad al-Ma'ad, 2/377)",

        "Rasulullah ﷺ bersabda, ”Barangsiapa yang membaca doa ini sebanyak tiga kali di petang hari, niscaya racun tidak akan ada memudharatkannya pada malam itu”\n\n(HR. Ahmad, 2/290; An-Nasa'i dalam 'Amal Al-Yaum wa Al-Lailah no.590; dan Ibnu as-Sunni, no.68. Lihat Shahih At-Tirmidzi, 3/187; Shahih Ibnu Majah, 2/266; dan Tuhfah Al-Akhyar, hal.45)",

        "Rasulullah ﷺ bersabda, ”Barangsiapa bershalawat untukku sepuluh kali pada pagi hari dan sepuluh kali pada petang hari, dia mendapatkan syafa'atku pada Hari Kiamat”\n\n(HR. Ath-Thabrani melalui dua sanad, yang salah satunya adalah jayyid (baik). Lihat Majma' Az-Zawa'id, 10/120 dan Shahih At-Targhib wa At-Tarhib, 1/273)"

    )

    val listDataSore: ArrayList<Dzikir>
        get() {
            val list = arrayListOf<Dzikir>()
            for (position in judul.indices) {
                val dzikir = Dzikir()
                dzikir.judul = judul[position]
                dzikir.number = number[position]
                dzikir.dibaca = dibaca[position]
                dzikir.arabic = arabic[position]
                dzikir.indonesia = indonesia[position]
                dzikir.dalil = dalil[position]
                list.add(dzikir)
            }
            return list
        }

}