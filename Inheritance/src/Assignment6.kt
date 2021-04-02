
open class Vehicle(var make:String, var model:String, var color:String, var capacity:Int){

    fun carry(people:Int){
        if (people<=capacity){
            println("Carrying $people passengers")
        }else{
            var x=people-capacity
            println("Overcapacity by $x people")
        }

    }
    fun identity(){
        println("I am a $color $make $model")
    }
   open fun calculateParkingFees(hours:Int):Int{
        return hours * 20
    }

}

class Car(make:String,model:String,color:String,capacity:Int):Vehicle(make,model,color,capacity){


}

class Bus(make:String, model:String,color:String, capacity:Int):Vehicle(make,model,color,capacity){

    override fun calculateParkingFees(hours: Int): Int {
        return super.calculateParkingFees(hours *capacity)
    }
    fun maxTripFare(fare:Double):Double{
        return fare*capacity

    }
}

fun main (){
    var car=Car("Subaru", "legacy", "white",4)
    car.carry(8)    //overcapacity
    car.carry(3)
    car.identity()
    println(car.calculateParkingFees(4))

    var bus=Bus("Scania","minibus","Black",24)
    bus.carry(14)
    bus.carry(50)     //overcapacity
    bus.identity()
    println(bus.calculateParkingFees(3))
    println(bus.maxTripFare(50.0))


}