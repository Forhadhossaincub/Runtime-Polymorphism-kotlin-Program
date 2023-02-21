import kotlin.math.ln

fun main(args: Array<String>) {

    val bse = BaseSalariedEmployee(salary = 25000, fName = "Hasib", lName = "Ahmed")
    println(bse.getFullInfo())


    val hse = HourlySalariedEmployee(hourlyRate = 25, totalHour = 100, fName = "Nihal", lName = "Ahmed")
    println(hse.getFullInfo())


    val employees = listOf<Employee>(bse,hse)

    for ( employee in employees){
        println(employee.getFullInfo())
    }


}

open class Employee(val firstname:String, val lastName:String){
    open fun getFullInfo() = "$firstname $lastName"
}

class BaseSalariedEmployee(var salary:Int, fName:String, lName:String) :Employee(fName,lName){
    // fun getFullInformation() ="$firstname $lastName draw $salary taka per month "
// override fun getFullInfo(): String {
//   return super.getFullInfo()
// }
    override fun getFullInfo() ="$firstname $lastName draw $salary taka per month "

}

class HourlySalariedEmployee(var hourlyRate:Int, var totalHour:Int, fName: String, lName:String ):Employee(fName,lName){
    override fun getFullInfo() = "$firstname $lastName draw $hourlyRate taka per hour "

}


