//2
//fun main() {
//    println("Use the val keyword when the value doesn't change.")
//    println("Use the var keyword when the value can change.")
//    println("When you define a function, you define the parameters that can be passed to it.")
//    println("When you call a function, you pass arguments for the parameters.")
//
//}

//3
//fun main() {
//    println("New chat message from a friend")
//}

//4
//fun main() {
//    var discountPercentage: Int = 0
//    var offer: String = ""
//    val item = "Google Chromecast"
//    discountPercentage = 20
//    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
//
//    println(offer)
//}

//5
//fun main() {
//    val numberOfAdults = 20
//    val numberOfKids = 30
//    val total = numberOfAdults + numberOfKids
//    println("The total party size is: $total")
//}

//6
//fun main() {
//    val baseSalary = 5000
//    val bonusAmount = 1000
//    val totalSalary = baseSalary + bonusAmount
//    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
//}

//7
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val result = firstNumber +secondNumber
//
//    println("$firstNumber + $secondNumber = $result")
//}

//8
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val thirdNumber = 8
//
//    println("Addition")
//    var result = add(firstNumber, secondNumber)
//    var anotherResult = add(firstNumber, thirdNumber)
//
//    println("$firstNumber + $secondNumber = $result")
//    println("$firstNumber + $thirdNumber = $anotherResult")
//
//    println("Subtraction:")
//    //SUBTRACT
//    result = sub(firstNumber, secondNumber)
//    anotherResult = sub(firstNumber, thirdNumber)
//
//    println("$firstNumber - $secondNumber = $result")
//    println("$firstNumber - $thirdNumber = $anotherResult")
//}
//
//// Define add() function below this line
//
//fun add(firstNumber: Int, secondNumber: Int): Int {
//    return firstNumber + secondNumber
//}
//fun sub(firstNumber: Int, secondNumber: Int): Int {
//    return firstNumber - secondNumber
//}

//fun main() {
//    val firstUserEmailId = "user_one@gmail.com"
//
//    // The following line of code assumes that you named your parameter as emailId.
//    // If you named it differently, feel free to update the name.
//    println(displayAlertMessage(emailId = firstUserEmailId))
//    println()
//
//    val secondUserOperatingSystem = "Windows"
//    val secondUserEmailId = "user_two@gmail.com"
//
//    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
//    println()
//
//    val thirdUserOperatingSystem = "Mac OS"
//    val thirdUserEmailId = "user_three@gmail.com"
//
//    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
//    println()
//}
//
//fun displayAlertMessage(os: String="Unknown OS", emailId: String): String {
//    return "There's a new sign-in request on $os for your Google Account $emailId."
//}

//fun main() {
//    val steps = 4000
//    val caloriesBurned = pedometerStepsToCalories(steps);
//    println("Walking $steps steps burns $caloriesBurned calories")
//}
//
//fun pedometerStepsToCalories(numberOfSteps: Int): Double {
//    val caloriesBurnedForEachStep = 0.04
//    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
//    return totalCaloriesBurned
//}

//10
//fun main(){
//    var result=comparison(300,250)
//    println(result)
//
//    result=comparison(300,300)
//    println(result)
//
//    result=comparison(200,220)
//    println(result)
//}
//fun comparison(timeSpentToday:Int,timeSpentYesterday:Int):Boolean{
//    if(timeSpentToday>timeSpentYesterday)
//        return true
//return false
//}

fun main() {

    tempDisplay("Ankara",27,31,"82%")

    tempDisplay("Tokyo",32,36,"10%")

    tempDisplay("Cape Town",59,64,"2%")

    tempDisplay("Guatemala City",50,55,"7%")

}

fun tempDisplay(cityName:String,lowTemp:Int,highTemp:Int,chanceRain:String):Unit{
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceRain\n")
}