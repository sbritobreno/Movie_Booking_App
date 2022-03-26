package ie.dorset.ID24059.ca2_movieBookingApp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_movie.view.*
import kotlinx.android.synthetic.main.movie_recycler_template.view.*
import kotlinx.android.synthetic.main.movie_recycler_template.view.NumberOfRemainingSeats


class MovieAdapter(var items: ArrayList<Movie>, var clickListner: onItemClickListener): RecyclerView.Adapter<MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.movie_recycler_template,parent,false)
        return MovieViewHolder(v)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.initialize(items.get(position),clickListner)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class MovieViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

    var name = itemView.MovieTitle
    var image = itemView.MovieImage
    var starring = itemView.MovieStarring
    var running_time_mins = itemView.MovieDuration
    var seatsRemaining = itemView.NumberOfRemainingSeats

    fun initialize(item: Movie, action: onItemClickListener){
        name.text = item.name
        image.setImageResource(item.image)
        starring.text = item.starring
        running_time_mins.text = item.running_time_mins
        seatsRemaining.text = item.seatsRemaining.toString()

        itemView.setOnClickListener{
            action.onItemClick(item,adapterPosition)
        }

    }
}

interface onItemClickListener{
    fun onItemClick(item: Movie, position: Int)
}