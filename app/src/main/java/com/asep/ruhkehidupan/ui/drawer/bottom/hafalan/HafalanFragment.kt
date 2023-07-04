package com.asep.ruhkehidupan.ui.drawer.bottom.hafalan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.asep.ruhkehidupan.adapter.HafalanAdapter
import com.asep.ruhkehidupan.databinding.FragmentHafalanBinding
import com.asep.ruhkehidupan.model.Hafalan

class HafalanFragment : Fragment() {

    private var _binding: FragmentHafalanBinding? = null
    private lateinit var hafalanAdapter: HafalanAdapter
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHafalanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listHafalan = arrayOf(
            Hafalan("1","Jika Allah inginkan Kebaikan", "مَن يُرِدِ اللهُ به خيرًا يُفَقِّهْه في الدينِ", "Barangsiapa yang Allah kehendaki kebaikan padanya, niscaya Allah akan jadikan ia faham dalam agama", "(HR. al-Bukhari no. 71 dan Muslim no.1037)"),
            Hafalan("2","Berbeda antara orang yang mengetahui dan tidak mengetahui", "قُلْ هَلْ يَسْتَوِي الَّذِينَ يَعْلَمُونَ وَالَّذِينَ لَا يَعْلَمُونَ", "Katakanlah: Apakah sama orang-orang yang mengetahui dengan orang-orang yang tidak mengetahui?", "QS. Az-Zumar[39]: 9"),
            Hafalan("3", "Jangan Berputus Asa", "قُلْ يَا عِبَادِيَ الَّذِينَ أَسْرَفُوا عَلَىٰ أَنْفُسِهِمْ لَا تَقْنَطُوا مِنْ رَحْمَةِ اللَّهِ ۚ إِنَّ اللَّهَ يَغْفِرُ الذُّنُوبَ جَمِيعًا ۚ إِنَّهُ هُوَ الْغَفُورُ الرَّحِيمُ", "Katakanlah: \"Hai hamba-hamba-Ku yang malampaui batas terhadap diri mereka sendiri, janganlah kamu berputus asa dari rahmat Allah. Sesungguhnya Allah mengampuni dosa-dosa semuanya. Sesungguhnya Dialah Yang Maha Pengampun lagi Maha Penyayang.", "QS. Az-Zumar[39]: 53")
        )
        hafalanAdapter = HafalanAdapter(listHafalan)
        binding.rvHafalan.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireActivity())
            adapter = hafalanAdapter
        }
    }

}