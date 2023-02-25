package com.asep.ruhkehidupan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.databinding.ItemDoaBinding
import com.asep.ruhkehidupan.model.Dzikir

class DoaAdapter(private val listDoa: ArrayList<Dzikir>) :
    RecyclerView.Adapter<DoaAdapter.DoaViewHolder>() {

    class DoaViewHolder(var binding : ItemDoaBinding) : RecyclerView.ViewHolder(binding.root){
        fun collapseExpandedView(){
            binding.dalil.visibility = View.GONE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val binding = ItemDoaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DoaViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDoa.size
    }

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val dzikir = listDoa[position]
        holder.binding.tvJudul.text = dzikir.judul
        holder.binding.tvNumber.text = dzikir.number
        holder.binding.tvArab.text = dzikir.arabic
        holder.binding.tvIndo.text = dzikir.indonesia
        holder.binding.dalil.text = dzikir.dalil
        val isExpandable: Boolean = dzikir.isExpandable
        if (isExpandable){
            holder.binding.dalil.visibility = View.VISIBLE
            holder.binding.view.visibility = View.VISIBLE
            holder.binding.down.setImageResource(R.drawable.ic_arrow_up)
        } else {
            holder.binding.dalil.visibility = View.GONE
            holder.binding.view.visibility = View.GONE
            holder.binding.down.setImageResource(R.drawable.ic_arrow_down)
        }

        holder.binding.down.setOnClickListener {
            isAnyItemExpanded(position)
            dzikir.isExpandable = !dzikir.isExpandable
            notifyItemChanged(position, Unit)
        }

        holder.binding.tvDalil.setOnClickListener {
            isAnyItemExpanded(position)
            dzikir.isExpandable = !dzikir.isExpandable
            notifyItemChanged(position, Unit)
        }
    }

    private fun isAnyItemExpanded(position: Int){
        val temp = listDoa.indexOfFirst {
            it.isExpandable
        }
        if (temp >= 0 && temp != position){
            listDoa[temp].isExpandable = false
            notifyItemChanged(temp , 0)
        }
    }

    override fun onBindViewHolder(
        holder: DoaAdapter.DoaViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {

        if(payloads.isNotEmpty() && payloads[0] == 0){
            holder.collapseExpandedView()
        }else{
            super.onBindViewHolder(holder, position, payloads)

        }
    }

}