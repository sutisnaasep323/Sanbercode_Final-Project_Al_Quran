package com.asep.ruhkehidupan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.databinding.ItemDoaBinding
import com.asep.ruhkehidupan.model.Hafalan

class HafalanAdapter(private val listHafalan: Array<Hafalan>) :
    RecyclerView.Adapter<HafalanAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemDoaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun collapseExpandedView() {
            binding.dalil.visibility = View.GONE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemDoaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hafalan = listHafalan[position]
        with(holder.binding) {
            tvNumber.text = hafalan.number
            tvJudul.text = hafalan.judul
            tvArab.text = hafalan.arab
            tvIndo.text = hafalan.indonesia
            tvDalil.text = hafalan.dalil

            val isExpandable: Boolean = hafalan.isExpandable
            if (isExpandable) {
                tvDalil.visibility = View.VISIBLE
                view.visibility = View.VISIBLE
                down.setImageResource(R.drawable.ic_arrow_up)
            } else {
                tvDalil.visibility = View.GONE
                view.visibility = View.GONE
                down.setImageResource(R.drawable.ic_arrow_down)
            }

            down.setOnClickListener {
                isAnyItemExpanded(position)
                hafalan.isExpandable = !hafalan.isExpandable
                notifyItemChanged(position, 0)
            }

            tvDalil.setOnClickListener {
                isAnyItemExpanded(position)
                hafalan.isExpandable = !hafalan.isExpandable
                notifyItemChanged(position, 0)
            }
        }
    }

    private fun isAnyItemExpanded(position: Int) {
        val temp = listHafalan.indexOfFirst { it.isExpandable }
        if (temp >= 0 && temp != position) {
            listHafalan[temp].isExpandable = false
            notifyItemChanged(temp, 0)
        }
    }

    override fun getItemCount(): Int = listHafalan.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int, payloads: MutableList<Any>) {
        if (payloads.isNotEmpty() && payloads[0] == 0) {
            holder.collapseExpandedView()
        } else {
            super.onBindViewHolder(holder, position, payloads)
        }
    }
}
