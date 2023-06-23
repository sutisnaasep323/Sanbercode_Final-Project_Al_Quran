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
    private var listDzikirShalat: MutableList<Dzikir> = arrayListOf()
    private lateinit var dzikirAdapter: DzikirAdapter
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDzikirShalatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        addDzikirList()
        setupDoaAdapter()
    }

    private fun setupRecyclerView() {
        binding.rvDzikir.setHasFixedSize(true)
        binding.rvDzikir.layoutManager = LinearLayoutManager(requireActivity())
    }

    private fun addDzikirList() {
        listDzikirShalat.addAll(DataDzikirBadaShalat.listDzikirBadaShalat)
    }

    private fun setupDoaAdapter() {
        dzikirAdapter = DzikirAdapter(listDzikirShalat)
        binding.rvDzikir.adapter = dzikirAdapter
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}