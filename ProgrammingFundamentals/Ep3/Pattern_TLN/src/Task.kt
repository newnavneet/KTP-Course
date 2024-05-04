import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int) {
    for (i in lines downTo 1 ) {
        for (j in 1 .. i) {
            print(i)
        }
        println()
    }
}

fun main() {
    PatternMiniApp("TLN", ::printPattern)
}