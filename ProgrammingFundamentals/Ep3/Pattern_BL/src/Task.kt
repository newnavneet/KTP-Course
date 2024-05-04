import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char: Char) {
    for(i in 1.. lines){
        for(j in 1 .. i){
            print(char)
        }
        println()
    }
}

fun main() {
    PatternMiniApp("BL", ::printPattern)
}