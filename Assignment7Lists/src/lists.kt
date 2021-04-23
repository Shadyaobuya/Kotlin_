fun main(){
    println(isEven(56))
    println(isEven(39))

    var productHygiene=Products("Soap", 0.25f, 300,"hygiene")
    productHygiene.products("Dettol")
    productHygiene.products("geisha")
    //productHygiene.products("Dove")
    var productGroceries=Products("Vegetable", 0.34f, 150,"groceries")
    productGroceries.products("Onion")
    productGroceries.products("Tomatoes")
    //productGroceries.products("Skuma")
    var productOther=Products("Electronics",43.0f ,5000000,"Other")
    productOther.products("LG TV")
    productOther.products("Radio")

    println(charEven("banana"))

    println(names(arrayOf("Catherine","Brenda","Joy", "Adama", "Mary")))
}
fun isEven(number:Int):Boolean{
    if (number%2==0){
        return true
    }
    else{
        return false
    }
}
data class Products(var name:String, var Weight:Float, var price:Int, var category:String ){

    fun products(names:String){
        var grocerries=mutableListOf<String>()
        var hygiene=mutableListOf<String>()
        var other=mutableListOf<String>()
        when (category){
            "groceries"-> grocerries.add(names)
            "hygiene"-> hygiene.add(names)
            "other"->other.add(names)
        }
        println("${names} :${category}")
    }
}

fun charEven(word:String):String{
    var newWord=""
    for(characters in word){
        if (word.indexOf(characters)%2==0){
            newWord+=characters
        }
    }
    return newWord
}

fun names(name:Array<String>):MutableList<String>{
    var evennames=mutableListOf<String>()

    name.forEach{ element->
        if (element.length%2==0){
            evennames.add(element)
        }
    }
    return evennames
}
