import com.faangx.ktp.basics.MaxOfTwoNumsMiniApp

import kotlin.math.max

fun maxOf(x: Int, y: Int): Int {

  return max(x, y)
}

fun main() {
    MaxOfTwoNumsMiniApp(::maxOf)
}