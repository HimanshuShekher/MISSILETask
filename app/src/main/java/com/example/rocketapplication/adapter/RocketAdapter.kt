package com.example.rocketapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rocketapplication.R
import com.example.rocketapplication.model.data_class.RocketListResponse
import com.example.rocketapplication.model.local.FavorateDatabase
import com.example.rocketapplication.model.local.Favorite
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
class RocketAdapter(
    private var rocketList: List<RocketListResponse.RocketListResponseItem>,
    private val database: FavorateDatabase,
    private val favoriteList: List<Favorite>,
    private val onClick: (RocketListResponse.RocketListResponseItem) -> Unit
) : RecyclerView.Adapter<RocketAdapter.ViewHolder>() {

    private var filteredList: List<RocketListResponse.RocketListResponseItem> = rocketList

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val missionName: TextView = itemView.findViewById(R.id.missionName)
        val rocketName: TextView = itemView.findViewById(R.id.rocketName)
        val launchYear: TextView = itemView.findViewById(R.id.launchYear)
        val favoriteImage: ImageView = itemView.findViewById(R.id.favorite)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return filteredList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rocketData = filteredList[position]
        holder.launchYear.text = rocketData.launchYear
        holder.missionName.text = rocketData.missionName
        holder.rocketName.text = rocketData.rocket.rocketName


        val isFavoriteIndex = favoriteList.indexOfFirst { it.flightNumber == rocketData.flightNumber.toString() }


        if (isFavoriteIndex != -1) {
            holder.favoriteImage.setImageResource(R.drawable.baseline_favorite_24)
        } else {
            holder.favoriteImage.setImageResource(R.drawable.baseline_favorite_border_24)
        }

        holder.favoriteImage.setOnClickListener {

            holder.favoriteImage.setImageResource(R.drawable.baseline_favorite_24)


            GlobalScope.launch {
                database.userDao().insertAll(Favorite(0, rocketData.flightNumber.toString(), rocketData.missionName))
            }
        }

        holder.itemView.setOnClickListener {
            onClick(rocketData)
        }
    }


    fun filter(query: String) {
        filteredList = if (query.isEmpty()) {
            rocketList
        } else {
            rocketList.filter { it.missionName.contains(query, ignoreCase = true) }
        }
        notifyDataSetChanged()
    }
}
