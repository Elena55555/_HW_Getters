fun main() {

    println("TASK 1")
    val card = BankCard("1234 5678 9123 4568", "123")
    println("Card number: ${card.getCardNumber()}")

    println(card.getCardCode(" abcdef")) //To get the card code, you need to enter the password; it will output the wrong password - the card code will not be viewed
    println(card.getCardCode("password")) // Displays the card code when you enter the correct password.

    card.setCardCode("NewPassword", "password")//Changing the password with the correct code
    println(card.getCardCode("password"))
    card.setCardCode("678", "abcdifgh")// Changing the password with the wrong code

    println(" ")
    println("TASK 2")
    var a = 1
    a += 7
    a -= 4
    a *= 2
    a %= 3
    println(a)

    println(" ")
    println("TASK 3")
    val number = 753
    val reversNumber = revers(number)
    println("If a three-digit number is given: $reversNumber")

    val number2 = 73 // if given a two-digit
    val reversNumber2 = reversSecond(number2)
    println("If given a two-digit: $reversNumber2")
}

fun revers   (number : Int):Int {
    val hundreds = number  / 100
    val dozens = (number  / 10) % 10
    val units = number  % 10
    return units * 100 + dozens * 10 + hundreds

}
fun reversSecond(number2: Int):Int {

    val dozens = (number2 / 10) % 10
    val units = number2 % 10
    return units  * 10 + dozens

}

