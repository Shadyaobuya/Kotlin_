
fun main(){
println(evenNames(listOf("Catherine","Jane","Mike","John","Shadya","Brenda", "Wuanita", "Mary","Adama","Rebecka")))

var heights=listOf(23.45f,43.5f,69.0f,74.7f)
var sumAvgHeight=avgHeight(heights)
println(sumAvgHeight.sum)
println(sumAvgHeight.average)


var human= mutableListOf(
    Person("Catherine",19,78.0f,45.0f),
    Person("Brenda",29,67.0f,68.9f),
    Person("Mercy",23,59.0f,78.0f),
    Person("Jane",16,69.0f,53.0f)
)
var descendingAge= human.sortedByDescending{persons->persons.age}
println(descendingAge)


addPeople()

var gari= listOf(
    Cars("KCB567",100.0),
    Cars("KIA345",789.0),
    Cars("KCD789",674.0)
)
var averageMileage=car(gari)
println(averageMileage)
}


//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc

fun evenNames(names:List<String>):List<String>{
    return names.filterIndexed { index, name ->index%2==0  }
}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

data class ListSumAvg(var sum:Float, var average:Double)
fun avgHeight(height:List<Float>): ListSumAvg{
    var sum =height.sum()
    var average=height.average()
    var sumavgHeight=ListSumAvg(sum, average)
    return sumavgHeight

}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String, var age:Int, var height:Float, var weight:Float)


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go

data class People(var name:String, var age:Int, var height:Float, var weight:Float)
fun addPeople(){
    var person=mutableListOf(
        Person("Catherine",19,78.0f,45.0f),
        Person("Brenda",29,67.0f,68.9f),
        Person("Mercy",23,59.0f,78.0f),
        Person("Jane",16,69.0f,53.0f)
    )
    var addingList= person.addAll(listOf(
        Person("Irene",10,70.0f,35.0f),
        Person("Joseph",70,65.0f,79.0f),
        ))
    println(person)
}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Cars(var registrations:String,var mileages:Double)
fun car(vehicles:List<Cars> ):Double {
    var speed = vehicles.sumOf {cars->cars.mileages}
    var average=speed/vehicles.count()

    return average

}






