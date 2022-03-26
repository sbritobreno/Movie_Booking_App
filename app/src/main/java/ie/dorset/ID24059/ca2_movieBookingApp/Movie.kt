package ie.dorset.ID24059.ca2_movieBookingApp

class Movie(name: String, img: Int, desc: String, starring: String, duration: String, seatR: Int, seatS: Int) {
    var name: String = name
    var image: Int = img
    var description: String = desc
    var starring: String = starring
    var running_time_mins: String = duration
    var seatsRemaining: Int = seatR
    var seatsSelected: Int = seatS

    override fun toString(): String {
        return "$name, $image, $description, $starring, $running_time_mins $seatsRemaining, $seatsSelected"
    }
}