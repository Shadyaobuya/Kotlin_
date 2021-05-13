//
//2. Write a function that takes in a String and returns its length (2 pts)
//3.

//1. A car is represented by a data class with these attributes: make, model and
////color. Write a function that groups a list of cars by color using a when
////statement. The available color groups are red, blue and other. The function
////should print out each list of cars under each color group (3pts)

fun main(){
    var vehicles= listOf(Cars("Toyota","56","red"),
        Cars("Toyota","56","blue"),
        Cars("Toyota","56","other"),
        )
    //getColor()

    println(findLength("Kenya"))

    var newAcc=CreateAccount(345677788,"Shadya Obuya",500000.0)
    println(newAcc.deposit(20000.0))
    println(newAcc.withdraw(5000.0))
    println(newAcc.details())
    var savingsaccount=SavingsAccount()
    println(savingsaccount.deposit(4000.0))
    println(savingsaccount.withdraw(7000.0))
    println(savingsaccount.withdraw(8000.0))
    println(savingsaccount.withdraw(9000.0))
    println(savingsaccount.withdraw(10000.0))
    println(savingsaccount.withdraw(11000.0))
    println(savingsaccount.details())


}
data class Cars(var make:String, var model:String, var color:String)

fun getColor(car:Cars){
    var red= mutableListOf<Cars>()
    var blue= mutableListOf<Cars>()
    var other= mutableListOf<Cars>()

    when(car.color){
        "red"-> println(red.addAll(listOf(car)))
        "blue"->println(blue.addAll(listOf(car)))
        "other"->println(other.addAll(listOf(car)))

    }
}

fun findLength(word:String):Int{
    return word.length
}


open class CreateAccount(var accountnumber:Int,var accountname:String, var balance:Double){
    open fun deposit(amount:Double){
      var newbalance=amount+balance
        println(newbalance)
    }
  open fun withdraw(amount: Double){
        var newamount2=balance-amount
      println(newamount2)
    }
    open fun details(){
        println("Account Number ${accountnumber} with balance ${balance} is operated by ${accountname}")
    }

}
//4. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (5pts)
class SavingsAccount():CreateAccount(45677,"Gard",60000.0){

    var withdrawals=0


    override fun withdraw(amount: Double) {
        if (withdrawals<4){
            var newamount2=balance-amount
            println(newamount2)
            withdrawals+1
        }

    }
}
