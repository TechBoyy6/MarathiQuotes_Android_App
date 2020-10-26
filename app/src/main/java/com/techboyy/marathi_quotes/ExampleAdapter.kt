package com.techboyy.marathi_quotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(
    private val exampleList: List<ExampleItem>,
    var itemClickListner: OnItemClickListner
) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.example_item, parent, false)

        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2

        holder.Bind(currentItem, itemClickListner)

    }

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.user_img
        val textView1: TextView = itemView.quote_txt
        val textView2: TextView = itemView.quoted_by


        fun Bind(currentItem: ExampleItem, clickListner: OnItemClickListner) {

            textView1.text = currentItem.text1

            itemView.setOnClickListener {
                clickListner.onItemClick(currentItem)
            }
        }
    }

    override fun getItemCount() = exampleList.size

    interface OnItemClickListner {
        fun onItemClick(currentItem: ExampleItem)
    }
}