package com.asep.ruhkehidupan.ui.drawer.dzikir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.asep.ruhkehidupan.adapter.DzikirAdapter
import com.asep.ruhkehidupan.data.DataDzikirPagi
import com.asep.ruhkehidupan.databinding.FragmentDzikirPagiBinding
import com.asep.ruhkehidupan.model.Dzikir

class DzikirPagiFragment : Fragment() {
    private var _binding: FragmentDzikirPagiBinding? = null
    private var listDzikirPagi: ArrayList<Dzikir> = arrayListOf()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDzikirPagiBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDzikir.setHasFixedSize(true)
        binding.rvDzikir.layoutManager = LinearLayoutManager(requireActivity())
        listDzikirPagi.addAll(DataDzikirPagi.listDataPagi)
        val dzikirAdapter = DzikirAdapter(listDzikirPagi)
        binding.rvDzikir.adapter = dzikirAdapter
    }

}