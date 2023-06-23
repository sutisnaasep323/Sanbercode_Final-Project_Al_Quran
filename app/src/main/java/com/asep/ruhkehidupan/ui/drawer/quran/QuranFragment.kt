package com.asep.ruhkehidupan.ui.drawer.quran

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.adapter.SurahAdapter
import com.asep.ruhkehidupan.databinding.FragmentQuranBinding
import com.asep.ruhkehidupan.model.Data
import com.asep.ruhkehidupan.network.NetworkUtils
import com.asep.ruhkehidupan.viewmodel.QuranViewModel

class QuranFragment : Fragment() {

    private lateinit var mQuranViewModel: QuranViewModel
    private var _binding: FragmentQuranBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuranBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (NetworkUtils.isInternetAvailable(requireContext())) {
            // Inisialisasi ViewModel
            setupViewModel()

            // Konfigurasi tampilan UI
            setupUI()

            // Observasi perubahan data
            setupObservers()
        } else {
            // Tampilkan UI saat tidak ada koneksi internet
            showNoInternetUI()
        }
    }

    private fun setupViewModel() {
        mQuranViewModel =
            ViewModelProvider(requireActivity(), ViewModelProvider.NewInstanceFactory()).get(
                QuranViewModel::class.java
            )
    }

    private fun setupUI() {
        binding.rvSurah.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun setupObservers() {
        mQuranViewModel.listSurah.observe(viewLifecycleOwner) { data ->
            setListSurah(data)
        }

        mQuranViewModel.isLoading.observe(viewLifecycleOwner) {
            showLoading(it)
        }
    }

    private fun showNoInternetUI() {
        binding.rvSurah.visibility = View.GONE
        binding.errorLayout.visibility = View.VISIBLE
        binding.btnRefresh.setOnClickListener {
            quranRefresh()
        }
        showLoading(false)
    }

    private fun quranRefresh() {
        // Refresh fragment dengan replace ke fragment yang sama
        val mCategoryFragment = QuranFragment()
        val mFragmentManager = parentFragmentManager
        mFragmentManager.beginTransaction().apply {
            replace(
                R.id.frame_container,
                mCategoryFragment,
                QuranFragment::class.java.simpleName
            )
            commit()
        }
    }

    private fun setListSurah(data: List<Data>?) {
        val listSurahAdapter = data?.let { SurahAdapter(it) }
        binding.rvSurah.apply {
            setHasFixedSize(true)
            listSurahAdapter?.notifyDataSetChanged()
            adapter = listSurahAdapter
        }

        listSurahAdapter?.setOnItemClickCallback(object : SurahAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Data) {
                onDetailClick(data)
            }
        })
    }

    private fun onDetailClick(data: Data) {
        val mBundle = Bundle().apply {
            // Mengisi bundle dengan data yang diperlukan untuk DetailQuranFragment
            putString(DetailQuranFragment.EXTRA_NAME_SURAH, data.asma.id.jsonMemberLong)
            putInt(DetailQuranFragment.EXTRA_ID_SURAH, data.number)
        }

        val mDetailQuranFragment = DetailQuranFragment().apply {
            // Mengatur argument Bundle pada DetailQuranFragment
            arguments = mBundle
        }

        parentFragmentManager.beginTransaction().apply {
            replace(
                R.id.nav_host_fragment_content_navigation,
                mDetailQuranFragment,
                DetailQuranFragment::class.java.simpleName
            )
            addToBackStack(null)
            commit()
        }
    }

    private fun showLoading(isLoading: Boolean) {
        binding.progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

