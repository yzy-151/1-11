package com.example.uiteestnew2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapterRecycle(val fruitList: List<Fruit>) :
RecyclerView.Adapter<FruitAdapterRecycle.ViewHolder>(){
    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){//定义一个内部类，继承自recycler.viewHolder
//        这个类用来装缓存，只有两个东西
        val fruitImage:ImageView=view.findViewById(R.id.fruitImage)
        val fruitName:TextView=view.findViewById(R.id.fruitName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.fruit_item,parent,false)//传入布局
    return ViewHolder(view)
    }

    override fun getItemCount()=fruitList.size


    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        val fruit=fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
//        这个holder就是viewHolder，里面有着fruit_item,依据传入的位置，为每个viewHolder设置图像与名称
//        而这个fruit就是fruitList，这是把fruitList里面的图片数据搞进holder
        holder.fruitName.text=fruit.name
    }
}