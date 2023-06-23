package com.asep.ruhkehidupan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.databinding.ItemDoaBinding
import com.asep.ruhkehidupan.model.Dzikir

class DoaAdapter(private val listDoa: MutableList<Dzikir>) :
    RecyclerView.Adapter<DoaAdapter.DoaViewHolder>() {

    inner class DoaViewHolder(val binding: ItemDoaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun collapseExpandedView() {
            binding.dalil.visibility = View.GONE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val binding = ItemDoaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return DoaViewHolder(binding)
    }

    override fun getItemCount(): Int = listDoa.size

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val dzikir = listDoa[position]
        with(holder.binding) {
            tvJudul.text = dzikir.judul
            tvNumber.text = dzikir.number
            tvArab.text = dzikir.arabic
            tvIndo.text = dzikir.indonesia
            dalil.text = dzikir.dalil

            val isExpandable: Boolean = dzikir.isExpandable
            if (isExpandable) {
                dalil.visibility = View.VISIBLE
                view.visibility = View.VISIBLE
                down.setImageResource(R.drawable.ic_arrow_up)
            } else {
                dalil.visibility = View.GONE
                view.visibility = View.GONE
                down.setImageResource(R.drawable.ic_arrow_down)
            }

            down.setOnClickListener {
                isAnyItemExpanded(position)
                dzikir.isExpandable = !dzikir.isExpandable
                notifyItemChanged(position, 0)
            }

            tvDalil.setOnClickListener {
                isAnyItemExpanded(position)
                dzikir.isExpandable = !dzikir.isExpandable
                notifyItemChanged(position, 0)
            }
        }
    }

    private fun isAnyItemExpanded(position: Int) {
        val temp = listDoa.indexOfFirst { it.isExpandable }
        if (temp >= 0 && temp != position) {
            listDoa[temp].isExpandable = false
            notifyItemChanged(temp, 0)
        }
    }

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int, payloads: MutableList<Any>) {
        if (payloads.isNotEmpty() && payloads[0] == 0) {
            holder.collapseExpandedView()
        } else {
            super.onBindViewHolder(holder, position, payloads)
        }
    }

}
