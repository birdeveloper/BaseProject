package com.birdeveloper.baseproject.ui.main

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.birdeveloper.baseproject.utils.FavouriteManager


class MainAdapter constructor(
    //private val listener: ClickListener,
    private val favouriteManager: FavouriteManager
) :
    RecyclerView.Adapter<MainAdapter.DataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.DataViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MainAdapter.DataViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    /*
    private var countries: ArrayList<Country> = ArrayList()

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemCountryBinding.bind(itemView)
        fun bind(country: Country) {
            binding.textViewCountryName.text = country.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_country, parent,
                false
            )
        )

    override fun getItemCount(): Int = countries.size

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(countries[position])
        holder.binding.itemCountry.setOnClickListener {
            listener.onClickData(countries[position])
        }

        val isFav = favouriteManager.countryInFav(countries[position])



        holder.binding.imageViewFavouriteState.setOnClickListener {
            val isInFav = favouriteManager.countryInFav(countries[position])

            if (isInFav) {
                favouriteManager.removeCountry(countries[position])
            } else {
                favouriteManager.setCountry(countries[position])
            }

            notifyDataSetChanged()
        }

    }


    fun setData(countries: List<Country>) {
        this.countries.apply {
            clear()
            addAll(countries)
        }
    }
     */
}