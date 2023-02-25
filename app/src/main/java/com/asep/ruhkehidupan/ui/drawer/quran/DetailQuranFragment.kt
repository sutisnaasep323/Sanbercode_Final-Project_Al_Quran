package com.asep.ruhkehidupan.ui.drawer.quran

import android.R.attr
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.asep.ruhkehidupan.adapter.DetailSurahAdapter
import com.asep.ruhkehidupan.databinding.FragmentDetailQuranBinding
import com.asep.ruhkehidupan.viewmodel.QuranDetailViewModel


class DetailQuranFragment : Fragment() {

    private lateinit var mQuranDetailViewModel: QuranDetailViewModel
    private lateinit var detailSurahAdapter: DetailSurahAdapter
    private var _binding: FragmentDetailQuranBinding? = null
    private val binding get() = _binding!!
    private var nameSurah: String? = null
    private var id: Int? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailQuranBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments != null) {
            nameSurah = arguments?.getString(EXTRA_NAME_SURAH)
            id = arguments?.getInt(EXTRA_ID_SURAH)
        }

        Log.i("DetailQuran", id.toString())
        binding.tittleToolbar.text = nameSurah
        binding.backButton.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }

        mQuranDetailViewModel =
            ViewModelProvider(requireActivity(), ViewModelProvider.NewInstanceFactory()).get(
                QuranDetailViewModel::class.java
            )
        id?.let { mQuranDetailViewModel.setListSurah(it) }

        detailSurahAdapter = DetailSurahAdapter()
        binding.rvDetailSurah.setHasFixedSize(true)
        binding.rvDetailSurah.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvDetailSurah.adapter = detailSurahAdapter


        mQuranDetailViewModel.listDetailSurah.observe(requireActivity()) { data ->
            if(data.size != 0){
                detailSurahAdapter.setData(data)
            } else {
                Toast.makeText(requireActivity(), "Data Tidak Ditemukan!", Toast.LENGTH_SHORT).show()
            }
        }

        mQuranDetailViewModel.isLoading.observe(requireActivity()) {
            showLoading(it)
        }

    }

    private fun showLoading(isLoading: Boolean) {
        binding.progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()
    }

    override fun onStop() {
        super.onStop()
        (requireActivity() as AppCompatActivity).supportActionBar?.show()
    }

    companion object {
        const val EXTRA_NAME_SURAH = "extra_name_surah"
        const val EXTRA_ID_SURAH = "extra_id_surah"
    }

}