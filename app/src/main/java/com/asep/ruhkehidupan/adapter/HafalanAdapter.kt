package com.asep.ruhkehidupan.adapter

import android.animation.LayoutTransition
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.databinding.ItemDoaBinding
import com.asep.ruhkehidupan.model.Hafalan

class HafalanAdapter(private val listDzikir: Array<Hafalan>) :
    RecyclerView.Adapter<HafalanAdapter.DzikirViewHolder>() {

    inner class DzikirViewHolder(private val binding: ItemDoaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            setupListeners()
        }

        fun bind(hafalan: Hafalan) = with(binding) {
            tvJudul.text = hafalan.judul
            tvNumber.text = hafalan.number
            tvArab.text = hafalan.arab
            tvIndo.text = hafalan.indonesia
            dalil.text = hafalan.dalil

            hiddenView.visibility = if (hafalan.isExpandable) View.VISIBLE else View.GONE
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
            val hafalan = listDzikir[adapterPosition]
            hafalan.isExpandable = !hafalan.isExpandable
            notifyItemChanged(adapterPosition,0)
            val transition = AutoTransition()
            TransitionManager.beginDelayedTransition(binding.cdDoa, transition)
            binding.hiddenView.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
            val visibility = binding.hiddenView.visibility
            binding.down.setImageResource(getArrowDrawableResId(visibility))
        }

        private fun getArrowDrawableResId(visibility: Int): Int {
            return if (visibility == View.VISIBLE) R.drawable.ic_arrow_up else R.drawable.ic_arrow_down
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DzikirViewHolder {
        val binding = ItemDoaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DzikirViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDzikir.size
    }

    override fun onBindViewHolder(holder: DzikirViewHolder, position: Int) {
        holder.bind(listDzikir[position])
    }

}
