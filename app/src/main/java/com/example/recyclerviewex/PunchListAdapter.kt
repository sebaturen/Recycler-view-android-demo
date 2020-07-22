package com.example.recyclerviewex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_punch_list.view.*

class PunchListAdapter(private val punchList: List<Punch>) : RecyclerView.Adapter<PunchListAdapter.PunchListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PunchListViewHolder {

        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recycler_punch_list, parent, false)

        return PunchListViewHolder(itemView)
    }

    override fun getItemCount() = punchList.size

    override fun onBindViewHolder(holder: PunchListViewHolder, position: Int) {

        val currentItem = punchList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.time

    }

    class PunchListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView = itemView.img_method
        val textView: TextView = itemView.tv_time
    }

}