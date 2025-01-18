fun main() {
    val card = BankCard("1234 5678 9123 4568", "123")

    println("Номер карты ${card.getCardNumber()}")

    println(card.getCardCode(" abcdef")) //To get the card code, you need to enter the password; it will output the wrong password - the card code will not be viewed
    println(card.getCardCode("password")) // Displays the card code when you enter the correct password.


    card.setCardCode("NewPassword", "password")//Changing the password with the correct code
    println(card.getCardCode("password"))
    card.setCardCode("678", "abcdifgh")// Changing the password with the wrong code
}