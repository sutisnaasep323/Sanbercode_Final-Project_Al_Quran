package com.asep.ruhkehidupan.ui.drawer.dzikir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.asep.ruhkehidupan.adapter.DzikirAdapter
import com.asep.ruhkehidupan.data.DataDzikirBadaShalat
import com.asep.ruhkehidupan.databinding.FragmentDzikirShalatBinding
import com.asep.ruhkehidupan.model.Dzikir


class DzikirShalatFragment : Fragment() {
    private var _binding: FragmentDzikirShalatBinding? = null
    private var listDzikirShalat: ArrayList<Dzikir> = arrayListOf()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDzikirShalatBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDzikir.setHasFixedSize(true)
        binding.rvDzikir.layoutManager = LinearLayoutManager(requireActivity())
        listDzikirShalat.addAll(DataDzikirBadaShalat.listDzikirBadaShalat)
        val dzikirAdapter = DzikirAdapter(listDzikirShalat)
        binding.rvDzikir.adapter = dzikirAdapter
    }
}