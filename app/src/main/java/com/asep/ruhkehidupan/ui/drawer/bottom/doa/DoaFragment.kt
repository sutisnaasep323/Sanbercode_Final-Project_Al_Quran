package com.asep.ruhkehidupan.ui.drawer.bottom.doa

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
    private val binding get() = _binding!!
    private lateinit var doaAdapter: DoaAdapter
    private val doaList: MutableList<Dzikir> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDoaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        addDoaList()
        setupDoaAdapter()
    }

    private fun setupRecyclerView() {
        binding.rvDoa.setHasFixedSize(true)
        binding.rvDoa.layoutManager = LinearLayoutManager(requireActivity())
    }

    private fun addDoaList() {
        doaList.addAll(DataDoaHarian.listDataDoaHarian)
    }

    private fun setupDoaAdapter() {
        doaAdapter = DoaAdapter(doaList)
        binding.rvDoa.adapter = doaAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}