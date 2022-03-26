package ie.dorset.ID24059.ca2_movieBookingApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ie.dorset.ID24059.ca2_movieBookingApp.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), onItemClickListener {

    lateinit var movieList: ArrayList<Movie>

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter:RecyclerView.Adapter<MovieViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieList = ArrayList()
        addMovies()

        layoutManager = LinearLayoutManager(this)

        movies_recycler_view.layoutManager = layoutManager

        adapter = MovieAdapter(movieList, this)
        movies_recycler_view.adapter = adapter


        val exitBtn = findViewById<ImageButton>(R.id.exitIcon)
        exitBtn.setOnClickListener{
            val eBuilder = AlertDialog.Builder(this)
            eBuilder.setTitle("Exit")
            eBuilder.setIcon(R.drawable.ic_baseline_warning_24)
            eBuilder.setMessage("Do you really want to exit ?")
            eBuilder.setPositiveButton("Yes"){
                    Dialog, which->
                finishAffinity()
            }
            eBuilder.setNegativeButton("No"){
                    Dialog, which->
            }
            val createBuild = eBuilder.create()
            createBuild.show()
        }
    }

    fun addMovies(){
        movieList.add(Movie("Into The Wild", R.drawable.intothewildimg, "intoTheWildDescription2", "Emile Hirsch, Vince Vaughn", "2h 28m", 15,0 ) )
        movieList.add(Movie("The Boy in the Striped Pajamas", R.drawable.theboyinthestripedpajamas, "theBoyInTheStripedPajamasDescription", "Asa Butterfield, Jack Scanlon", "1h 34m", 15,0 ) )
        movieList.add(Movie("The Avengers", R.drawable.theavengers, "AvengersDescription", "Robert Downey, Scarlett Johansson", "2h 23m", 15,0 ) )
        movieList.add(Movie("Spider Man 2", R.drawable.spiderman2, "spiderManDescription", "Tobey Maguire, Kirsten Dunst", "2h 7m", 15,0 ) )
    }

    override fun onItemClick(item: Movie, position: Int) {
        val intent = Intent(this, MovieActivity::class.java)
        intent.putExtra("Title", item.name)
        intent.putExtra("Image", item.image.toString())
        intent.putExtra("Desc", item.description)
        intent.putExtra("Starring", item.starring)
        intent.putExtra("Duration", item.running_time_mins)
        intent.putExtra("seatR", item.seatsRemaining)
        intent.putExtra("seatS", item.seatsSelected)
        startActivity(intent)
    }
}