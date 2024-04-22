import com.faangx.ktp.basics.MaxOfThreeNumsMiniApp
import kotlin.math.max

fun maxOf(x: Int, y: Int, z: Int): Int {
    return  max(max(x,y),z)
}

fun main() {
    MaxOfThreeNumsMiniApp(::maxOf)
}