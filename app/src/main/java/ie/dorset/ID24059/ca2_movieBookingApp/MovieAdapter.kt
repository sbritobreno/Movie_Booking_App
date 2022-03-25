package ie.dorset.ID24059.ca2_movieBookingApp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    private var name = arrayOf("Into The Wild", "The Boy in the Striped Pajamas", "The Avengers", "Spider_Man 2")
    private var starring = arrayOf("Emile Hirsch, Vince Vaughn", "Asa Butterfield, Jack Scanlon", "Robert Downey, Scarlett Johansson", "Tobey Maguire, Kirsten Dunst")
    private var running_time_mins = arrayOf("2h 28m", "1h 34m", "2h 23m", "2h 7m")
    private var seatsRemaining = arrayOf("15", "15", "15", "15")
    private val image = intArrayOf(R.drawable.intothewildimg, R.drawable.theboyinthestripedpajamas, R.drawable.theavengers, R.drawable.spiderman2)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.movie_recycler_template,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        holder.name.text = name[position]
        holder.starring.text = starring[position]
        holder.running_time_mins.text = running_time_mins[position]
        holder.seatsRemaining.text = seatsRemaining[position]
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var name: TextView
        var image: ImageView
        var starring: TextView
        var running_time_mins: TextView
        var seatsRemaining: TextView

        init{
            name = itemView.findViewById(R.id.MovieTitle)
            image = itemView.findViewById(R.id.MovieImage)
            starring = itemView.findViewById(R.id.MovieStarringData)
            running_time_mins = itemView.findViewById(R.id.MovieDurationData)
            seatsRemaining = itemView.findViewById(R.id.NumberOfRemainingSeats)
        }
    }
}