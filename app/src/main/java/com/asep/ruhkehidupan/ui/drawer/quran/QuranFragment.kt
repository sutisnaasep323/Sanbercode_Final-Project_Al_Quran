package com.asep.ruhkehidupan.ui.drawer.quran

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.adapter.SurahAdapter
import com.asep.ruhkehidupan.databinding.FragmentQuranBinding
import com.asep.ruhkehidupan.model.Data
import com.asep.ruhkehidupan.viewmodel.QuranViewModel

class QuranFragment : Fragment() {

    private lateinit var mQuranViewModel: QuranViewModel
    private var _binding: FragmentQuranBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQuranBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mQuranViewModel =
            ViewModelProvider(requireActivity(), ViewModelProvider.NewInstanceFactory()).get(
                QuranViewModel::class.java
            )
        binding.rvSurah.layoutManager = LinearLayoutManager(requireContext())
        mQuranViewModel.listSurah.observe(requireActivity()) { data ->
            setListSurah(data)
        }

        mQuranViewModel.isLoading.observe(requireActivity()) {
            showLoading(it)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setListSurah(data: List<Data>?) {
        val listSurahAdapter = data?.let { SurahAdapter(it) }
        binding.rvSurah.apply {
            setHasFixedSize(true)
            listSurahAdapter?.notifyDataSetChanged()
            adapter = listSurahAdapter
        }

        listSurahAdapter?.setOnItemClickCallback(object: SurahAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Data) {
                onDetailClick(data)
            }

        })
    }

    private fun onDetailClick(data: Data) {
        val mBundle = Bundle()
        val mDetailQuranFragment = DetailQuranFragment()
        val mFragmentManager = parentFragmentManager
        val number = data.number
        val surah = data.asma.id.jsonMemberLong

        mBundle.putString(DetailQuranFragment.EXTRA_NAME_SURAH, surah)
        mBundle.putInt(DetailQuranFragment.EXTRA_ID_SURAH, number)

        mDetailQuranFragment.arguments = mBundle
        mFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment_content_navigation, mDetailQuranFragment, DetailQuranFragment::class.java.simpleName)
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