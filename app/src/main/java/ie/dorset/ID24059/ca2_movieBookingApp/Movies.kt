package ie.dorset.iD24059.ca2_movieBookingApp

class Movies {
    var name: String = "No movie name"
    var image: String = "No movie img"
    var description: String = "No movie description"
    var starring: Array<String?> = emptyArray()
    var running_time_mins: Int = 0
    var seatsRemaining: Int = 15
    var seatsSelected: Int = 0

    override fun toString(): String {
        return "$name, $image, $description, $starring, $running_time_mins $seatsRemaining, $seatsSelected"
    }
}
