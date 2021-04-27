//scope function



//with 'run'과 동일한기능 인스턴스를 패러미터로 받음 with(a){...}
//also 'apply' it을통해 인스턴스 사용
//let 'run' it을통해 인스턴스 사용

//apply 초기화 과정 수행,코드가 깔끔해짐
/*fun main(){
val a = Book("디모의 코틀린",10000).apply{
    name = "[초특가]"+name
    discount()
	}
}
class Book()(var name: String, var price: Int)
{
    fun discount(){
        price-=2000
    }
}*/

//run 인스턴스의 함수나 속성을 scope내에서 사용해야할때
/*fun main(){
val a = Book("동현이의 코틀린",10000).apply{
    name = "[초특가]" + name
    discount()
	}
a.run{
    println("상품명: ${name},가격: ${price}원")
	}
}
class Book(var name: String, var price: Int)
{
    fun discount(){
        price -= 2000
    }
}*/



