package com.example.rv_ex

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RVAdapter () : RecyclerView.Adapter<RVAdapter.ViewHolder>() {
    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(items : String) {
            //TODO: 구현
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}