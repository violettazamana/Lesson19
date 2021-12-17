package com.zamana.myapplication

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.zamana.myapplication.databinding.ItemHomeworkBinding

class HomeVH(val view: ItemHomeworkBinding, val context: Context) :
    RecyclerView.ViewHolder(view.root) {

    fun bind(item: HomeWork) {
        view.imageView.setImageDrawable(context.getDrawable(item.imgeViewSrc))
        view.titleTextView.text = "Homework"
        view.countCommentsTextView.text = item.itemCount.toString()
    }

}