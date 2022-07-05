package com.example.submissiondicodingjdmcars

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JdmCarsAdapter(private val carList: ArrayList<JdmCarsModel>) :
    RecyclerView.Adapter<JdmCarsAdapter.MyViewHolder>() {

    private lateinit var onItemClickCallback: IOnClickCallback

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var carImage: ImageView = itemView.findViewById(R.id.img_car_list)
        var carName: TextView = itemView.findViewById(R.id.tv_list_car_name)
        var carIndex: TextView = itemView.findViewById(R.id.tv_list_car_num)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.car_item_list, parent, false)
        )
    }

    fun setOnItemClickCallback(action: IOnClickCallback) {
        this.onItemClickCallback = action
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val (image, carName, carBrand) = carList[position]

        holder.carImage.setImageResource(image)
        holder.carName.text = "$carBrand $carName"
        holder.carIndex.text = (position + 1).toString()

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClick(carList[holder.adapterPosition])
        }

    }

    override fun getItemCount(): Int {
        return carList.size
    }

    interface IOnClickCallback {
        fun onItemClick(value: JdmCarsModel)
    }
}