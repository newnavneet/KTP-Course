import com.faangx.ktp.basics.FactorCalculatorMiniApp

fun printFactorsOf(num: Int) {
    for (i in 1 .. num) {
        if (num % i == 0){
            print("$i, ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    var no = 0
    for (i in 1..num) {
        if (num % i == 0) {
            no++
        }
    }
    return no == 2


}


fun main() {
    FactorCalculatorMiniApp(::printFactorsOf, ::isPrime)
}