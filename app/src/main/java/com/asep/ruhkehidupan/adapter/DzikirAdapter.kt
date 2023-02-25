package com.asep.ruhkehidupan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.databinding.ItemDzikirBinding
import com.asep.ruhkehidupan.model.Dzikir

class DzikirAdapter(private val listDzikir: ArrayList<Dzikir>) :
    RecyclerView.Adapter<DzikirAdapter.DzikirViewHolder>(){

    inner class DzikirViewHolder(var binding: ItemDzikirBinding) : RecyclerView.ViewHolder(binding.root){
        fun collapseExpandedView(){
            binding.dalil.visibility = View.GONE
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
        val dzikir = listDzikir[position]
        holder.binding.tvJudul.text = dzikir.judul
        holder.binding.tvNumber.text = dzikir.number
        holder.binding.tvDibaca.text = dzikir.dibaca
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
        //holder.itemView.animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim)
    }

    private fun isAnyItemExpanded(position: Int){
        val temp = listDzikir.indexOfFirst {
            it.isExpandable
        }
        if (temp >= 0 && temp != position){
            listDzikir[temp].isExpandable = false
            notifyItemChanged(temp , 0)
        }
    }

    override fun onBindViewHolder(
        holder: DzikirViewHolder,
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