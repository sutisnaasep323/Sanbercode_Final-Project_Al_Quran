package com.asep.ruhkehidupan.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.asep.ruhkehidupan.model.Dzikir
import com.asep.ruhkehidupan.ui.drawer.dzikir.DzikirPagiFragment
import com.asep.ruhkehidupan.ui.drawer.dzikir.DzikirPetangFragment

class SectionsPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> DzikirPagiFragment()
            else -> DzikirPetangFragment()
        }
    }
    override fun getItemCount(): Int {
        return 2
    }
}


