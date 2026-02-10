package edu.temple.simplerecyclerview

import android.view.SurfaceHolder
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomerRecycleViewAdapter : RecyclerView.Adapter<CustomerRecycleViewAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        holder: MyViewHolder,
        position: Int
    ){

    }
    class MyViewHolder(val view: TextView) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = layout.findViewById(id = R.id.imageView)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ERROR {
        TODO("Not yet implemented")


    }

    override fun onBindViewHolder(
        holder: CustomerRecycleViewAdapter.MyViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}