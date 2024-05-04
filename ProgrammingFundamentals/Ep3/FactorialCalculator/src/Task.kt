import com.faangx.ktp.basics.FactorialCalculatorMiniApp

fun factorialOf(x: Long): Long {
    var fact = 1L
    for (i in 2L..x) {
        fact *= i
    }
    return fact
}

fun permutationsOf(n: Long, r: Long): Long {
    var p = 1L
    for (i in (n - r + 1)..n) {
        p *= i
    }
    return p
}

fun combinationsOf(n: Long, r: Long): Long {
    return permutationsOf(n,r)/ factorialOf(r)
}

fun main() {
    FactorialCalculatorMiniApp(
        ::factorialOf,
        ::permutationsOf,
        ::combinationsOf
    )
}