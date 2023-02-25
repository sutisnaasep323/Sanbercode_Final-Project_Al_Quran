package com.asep.ruhkehidupan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.model.AyahsItem

class DetailSurahAdapter : RecyclerView.Adapter<DetailSurahAdapter.ViewHolder>() {
    private val listSurah = ArrayList<AyahsItem>()
    fun setData(items: List<AyahsItem>) {
        listSurah.clear()
        listSurah.addAll(items)
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNumber: TextView = view.findViewById(R.id.tv_detail_number)
        val tvArabic: TextView = view.findViewById(R.id.tv_detail_arab)
        val tvArti: TextView = view.findViewById(R.id.tv_detail_indo)
        val tvTittleTafsir: TextView = view.findViewById(R.id.tv_title_tafsir)
        val tvTafsir: TextView = view.findViewById(R.id.tv_tafsir)
        val viewLine: View = view.findViewById(R.id.view_line)
        val downButton: ImageButton = view.findViewById(R.id.down_button)

        fun collapseExpandedView(){
            tvTafsir.visibility = View.GONE
        }
    }

    override fun getItemCount() = listSurah.size

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_detail_surah, viewGroup, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listSurah[position]

        holder.tvNumber.text = data.number.insurah.toString()
        holder.tvArabic.text = data.text.ar
        holder.tvArti.text = data.translation.id
        holder.tvTafsir.text = data.tafsir.id

        val isExpandable: Boolean = data.tafsir.isExpandable
        if (isExpandable){
            holder.tvTafsir.visibility = View.VISIBLE
            holder.viewLine.visibility = View.VISIBLE
            holder.downButton.setImageResource(R.drawable.ic_arrow_up)
        } else {
            holder.tvTafsir.visibility = View.GONE
            holder.viewLine.visibility = View.GONE
            holder.downButton.setImageResource(R.drawable.ic_arrow_down)
        }

        holder.downButton.setOnClickListener {
            isAnyItemExpanded(position)
            data.tafsir.isExpandable = !data.tafsir.isExpandable
            notifyItemChanged(position, Unit)
        }

        holder.tvTittleTafsir.setOnClickListener {
            isAnyItemExpanded(position)
            data.tafsir.isExpandable = !data.tafsir.isExpandable
            notifyItemChanged(position, Unit)
        }
    }

    private fun isAnyItemExpanded(position: Int){
        val temp = listSurah.indexOfFirst {
            it.tafsir.isExpandable
        }
        if (temp >= 0 && temp != position){
            listSurah[temp].tafsir.isExpandable = false
            notifyItemChanged(temp , 0)
        }
    }

    override fun onBindViewHolder(
        holder: DetailSurahAdapter.ViewHolder,
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