import java.util.*

fun main() {
    var friends=arrayOf("Anna", "faith", "joanne", "Diana", "mary")
    println(friends.contentToString())
    println(friends[4])
    println(friends.get(4))
    //replacing an element
    friends.set(2, "maryanna")
    println(friends.contentToString())
    friends[0]="David"
    println(friends.contentToString())
    //adding an element to an existing array
     var friends2023= friends.plus("makena")
    println(friends2023.contentToString())
    var februaryFriends= friends2023.plus(arrayOf("Jacinta", "Emma"))
    println(februaryFriends.contentToString())



}