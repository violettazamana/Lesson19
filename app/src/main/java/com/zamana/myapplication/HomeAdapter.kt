package com.zamana.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zamana.myapplication.databinding.ItemHomeworkBinding

class HomeAdapter(
    val context: Context,
) : RecyclerView.Adapter<HomeVH>() {

    var listHome: ArrayList<HomeWork> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeVH {
        return HomeVH(ItemHomeworkBinding.inflate(LayoutInflater.from(context)), context)
    }

    override fun onBindViewHolder(holder: HomeVH, position: Int) {
        holder.bind(listHome[position])
    }

    override fun getItemCount() = listHome.size

    fun setList(listData: ArrayList<HomeWork>) {
        listHome = listData
        notifyDataSetChanged()
    }
}