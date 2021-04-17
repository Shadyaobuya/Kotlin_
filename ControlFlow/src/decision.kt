import java.util.*

fun main(){
    oddEven()
    println(Arrays.toString(arrayString(arrayOf("Shadya", "Gard", "Obuya",""))))
    ageDrinks(14)
    ageDrinks(5)
    
    fizzBuzz()

}

fun oddEven() {
    for (numb in 1..100) {
        if (numb % 2 == 1) {
            println(numb)
        }
    }
}

fun arrayString(names:Array<String>):Int{
    var allnames=arrayOf(names)

    for (name in allnames){
        if (name.size>5){
            var num=0
            num+=1

        }


        }

    return num
    }

fun ageDrinks(age:Int){
    if (age<6){
        println("Serve Milk")
    }
    else if((age>=6) && (age<15)){
        println("Served fanta Orange")
    }
    else{
        println("Served CocaCola")
    }
}

fun fizzBuzz(){
    for (number in 1..100){
        if ((number%3==0)&&(number%5==0)){
            println("FizzBuzz")
        }
        else if(number%3==0){
            println("Fizz")
        }
        else if(number%5==0){
            println("Buzz")
        }
        else{
            println(number)
        }
    }
}
