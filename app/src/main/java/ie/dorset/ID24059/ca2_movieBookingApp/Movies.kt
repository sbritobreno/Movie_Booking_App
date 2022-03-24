package ie.dorset.iD24059.ca2_movieBookingApp

class Movies {
    var name: String = "No movie name"
    var image: String = "No movie img"
    var description: String = "No movie description"
    var seats_remaining: Int = 15
    var seats_selected: Int = 0

    override fun toString(): String {
        return "$name, $image, $description, $seats_remaining, $seats_selected"
    }
}
