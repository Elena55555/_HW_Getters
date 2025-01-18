class BankCard   (private val cardNumber: String, private  var cardCode: String ) {
    private val password = "password"

    fun getCardNumber(): String{
        return cardNumber
    }

    /**
     *
     * To get the card code, you must enter the password; incorrect password means that you will not see the card code.
     */
    fun getCardCode(inputPassword: String):String {
        return if (inputPassword == password){
            cardCode
        } else{
            "Invalid password"
        }
    }
    /**
     * To get the card code, you must enter the password; incorrect password means that you will not see the card code.
     */

    fun setCardCode(newCode:String, inputPassword: String) {

        if (inputPassword == password){
            cardCode = newCode
        }else {
            println("Invalid password. Changing the code is prohibited")
        }
    }
}
