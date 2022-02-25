package com.b12game.viewpager2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.b12game.viewpager2.R
import com.b12game.viewpager2.model.ProductModel

class ViewPagerAdapter(var context: Context, var items: ArrayList<ProductModel>):RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHoder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.Pager2ViewHoder {
        return Pager2ViewHoder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager2,parent,false))
    }


    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHoder, position: Int) {
        var feed = items[position]

        if (holder is Pager2ViewHoder){
            var image = holder.image
            var title = holder.title

            image.setImageResource(feed.image)
            title.text = feed.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class Pager2ViewHoder(v : View): RecyclerView.ViewHolder(v) {
        val image: ImageView
        val title: TextView

        init {
            image = v.findViewById(R.id.image)
            title = v.findViewById(R.id.tv_feedback)
        }
    }


}