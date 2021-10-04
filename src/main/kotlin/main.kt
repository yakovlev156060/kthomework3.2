fun main() {
    val typeCard:String = "Visa"
    val lastTransfers:Int=8000000
    val currentTransfer:Int=2000000
    val rezult=transfer(typeCard,lastTransfers,currentTransfer)
    println(""+rezult+" копеек")
}

fun transfer(typeCard:String = "Vk Pay", lastTransfers:Int=0, currentTransfer:Int):Int {

    var rezult:Int=0
    if((typeCard=="Mastercard")||(typeCard=="Maestro")){
        if(currentTransfer+lastTransfers>7500000){
            rezult=(currentTransfer*0.6f+2000).toInt()
        }
    }
    if((typeCard=="Visa")||(typeCard=="Мир")){
        rezult=(currentTransfer*0.0075f).toInt()
        if(rezult<3500){
            rezult=3500
        }
    }

    return rezult
}