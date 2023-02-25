package com.asep.ruhkehidupan.ui.drawer.doa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.asep.ruhkehidupan.adapter.DoaAdapter
import com.asep.ruhkehidupan.data.DataDoaHarian
import com.asep.ruhkehidupan.databinding.FragmentDoaBinding
import com.asep.ruhkehidupan.model.Dzikir

class DoaFragment : Fragment() {

    private var _binding: FragmentDoaBinding? = null
    private var listDoa: ArrayList<Dzikir> = arrayListOf()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDoaBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDoa.setHasFixedSize(true)
        binding.rvDoa.layoutManager = LinearLayoutManager(requireActivity())

        listDoa.addAll(DataDoaHarian.listDataDoaHarian)
        val doaAdapter = DoaAdapter(listDoa)
        binding.rvDoa.adapter = doaAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}