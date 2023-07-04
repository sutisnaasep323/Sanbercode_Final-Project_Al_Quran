package com.asep.ruhkehidupan.adapter

import android.animation.LayoutTransition
import android.os.Build
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.databinding.ItemDzikirBinding
import com.asep.ruhkehidupan.model.Dzikir

class DzikirAdapter(private val listDzikir: MutableList<Dzikir>) :
    RecyclerView.Adapter<DzikirAdapter.DzikirViewHolder>() {

    inner class DzikirViewHolder(private val binding: ItemDzikirBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            setupListeners()
        }

        fun bind(dzikir: Dzikir) = with(binding) {
            tvJudul.text = dzikir.judul
            tvNumber.text = dzikir.number
            tvDibaca.text = dzikir.dibaca
            tvArab.text = dzikir.arabic
            tvIndo.text = dzikir.indonesia
            dalil.text = dzikir.dalil

            hiddenView.visibility = if (dzikir.isExpandable) View.VISIBLE else View.GONE
        }

        private fun setupListeners() {
            binding.down.setOnClickListener {
                collapseExpandedView()
            }

            binding.tvDalil.setOnClickListener {
                collapseExpandedView()
            }
        }

        private fun collapseExpandedView() {
            val dzikir = listDzikir[adapterPosition]
            dzikir.isExpandable = !dzikir.isExpandable
            notifyItemChanged(adapterPosition,0)
            val transition = AutoTransition()
            TransitionManager.beginDelayedTransition(binding.cdDzikir, transition)
            binding.hiddenView.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
            val visibility = binding.hiddenView.visibility
            binding.down.setImageResource(getArrowDrawableResId(visibility))
        }

        private fun getArrowDrawableResId(visibility: Int): Int {
            return if (visibility == View.VISIBLE) R.drawable.ic_arrow_up else R.drawable.ic_arrow_down
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DzikirViewHolder {
        val binding = ItemDzikirBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DzikirViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDzikir.size
    }

    override fun onBindViewHolder(holder: DzikirViewHolder, position: Int) {
        holder.bind(listDzikir[position])
    }

}
