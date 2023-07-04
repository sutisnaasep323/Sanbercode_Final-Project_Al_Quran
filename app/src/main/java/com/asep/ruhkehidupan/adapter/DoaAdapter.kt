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
import com.asep.ruhkehidupan.model.Dzikir

class DoaAdapter(private val listDzikir: MutableList<Dzikir>) :
    RecyclerView.Adapter<DoaAdapter.DoaViewHolder>() {

    inner class DoaViewHolder(private val binding: ItemDoaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            setupListeners()
        }

        fun bind(dzikir: Dzikir) = with(binding) {
            tvJudul.text = dzikir.judul
            tvNumber.text = dzikir.number
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
            TransitionManager.beginDelayedTransition(binding.cdDoa, transition)
            binding.hiddenView.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
            val visibility = binding.hiddenView.visibility
            binding.down.setImageResource(getArrowDrawableResId(visibility))
        }

        private fun getArrowDrawableResId(visibility: Int): Int {
            return if (visibility == View.VISIBLE) R.drawable.ic_arrow_up else R.drawable.ic_arrow_down
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val binding = ItemDoaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DoaViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDzikir.size
    }

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        holder.bind(listDzikir[position])
    }

}
