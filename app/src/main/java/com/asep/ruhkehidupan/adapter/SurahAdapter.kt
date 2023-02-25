package com.asep.ruhkehidupan.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.model.Data
import com.asep.ruhkehidupan.ui.drawer.quran.DetailQuranFragment
import com.asep.ruhkehidupan.ui.drawer.quran.QuranFragment

class SurahAdapter(private val dataSurah: List<Data>) :
    RecyclerView.Adapter<SurahAdapter.SurahViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class SurahViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNameSurahID: TextView = view.findViewById(R.id.tv_name_surah_id)
        val tvNameSurahArabic: TextView = view.findViewById(R.id.tv_name_surah_arabic)
        val tvNumber: TextView = view.findViewById(R.id.tv_number)
        val tvDesc: TextView = view.findViewById(R.id.tv_desc_surah)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): SurahViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_surah, viewGroup, false)
        return SurahViewHolder(view)
    }

    override fun onBindViewHolder(holder: SurahViewHolder, position: Int) {
        val data = dataSurah[position]
        holder.tvNameSurahID.text = data.asma.id.jsonMemberShort
        holder.tvNameSurahArabic.text = data.asma.ar.jsonMemberShort
        holder.tvDesc.text = String.format("%s - %s ayat", data.type.id, data.ayahCount)
        holder.tvNumber.text = data.number.toString()
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(dataSurah[holder.adapterPosition])
        }
    }

    override fun getItemCount() = dataSurah.size

    interface OnItemClickCallback {
        fun onItemClicked(data: Data)
    }

}