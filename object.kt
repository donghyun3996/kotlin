//object

/*fun main() {
   
    println(Counter.count)
    
    Counter.countUP()
    Counter.countUP()
    
    println(Counter.count)
    
    Counter.clear()
    
    println(Counter.count)
    
}

object Counter{
    var count = 0
    
    fun countUP(){
        count++
    }
    fun clear(){
        count = 0
    }
}*/

//Companion Object
/*fun main(){
   var a = FoodPoll("짜장")
   var b = FoodPoll("짬뽕")
   
   a.vote()
   a.vote()
   
   b.vote()
   b.vote()
   b.vote()
   
   println("${a.name} : ${a.count}")
   println("${b.name} : ${b.count}")
   println("총계 : ${FoodPoll.total}")
}

class FoodPoll (val name: String){
    companion object {
        var total = 0
    }
    var count = 0
    
    fun vote(){
        total++
        count++
    }
}*/
