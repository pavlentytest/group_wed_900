import java.util.*

fun main() {
    // комментарии
    println("Hello, world!")
    println("")
    /*
    Многострочные комментарии
     */
    val a = 100 // value - immutable
    var b = 200 // variable - mutable
    //a = 200
    b = 300
    val c = 400
    println(c)

    val a1: Byte = -10
    val b1: Short = 45
    var c1: Int = -250
    val d1: Long = 3000L

    val h: Double = 4.5
    val f: Float = 5.6F

    val flag: Boolean = true
    val ch: Char = 'A'
    val name: String = "Ivan"
    val sname: String = "Ivanov"

    c1 = d1.toInt()
    println("Hello $name $sname")
    println(c1::class)

    val x1 = 11
    val y1 = 5
    val z1 = x1 / y1 // 2

    val x2 = 11
    val y2 = 5.0
    val z2 = x2 / y2 // 2.2

    // остаток от деление - %

    var w1 = 5     // 6
    var w2 = ++w1   // 6

    var w3 = 5      // 6
    var w4 = w3++   // 5

    //val scanner = Scanner(System.`in`)
    //val k = scanner.nextInt() // целое число

    // val v = readLine()?.toInt()
    // println("V=$v")

    // val p = readln().toInt()
    val (p1, p2) = readln().split(" ").map { it.toInt() }
    println("p1=$p1, p2=$p2")

    var str: String = "abc" // non-null
    //str = null

    var str2: String? = "abc"
    str2 = null

    // вместо этой строки
    // val l = str2.length
    //val l = if(str2 != null) str2.length else -1
    val l = str2?.length ?: -1 // elvis выражение
    // ?.- оператор безопасного вызова
    println(str2?.length)
    println("l=$l")

    val g = 10
    if (g == 10) {
        println("10")
    } else if (g == 8) {

    } else {

    }
    val s = 10
    val p = 20
    val result = if(s>p) {
            println("s = $s")
            s
        } else {
            println("p = $p")
            p
        }
    // > < !=
    // тип логической операции in
    val q = 5
    val r1 = q in 1..6 //true

    when(flag) {
        false -> println("False")
        true -> println("True")
        else -> println("Else")
    }

    val m = 10
    when(m) {
        10,20,30 -> println("Or")
        else -> println("Nothing")
    }
    when(m) {
        in 10..19 -> println("")
        in 20..29 -> println("")
        !in 10..20 -> println("")
        else -> println(" ")
    }
    val j = 10
    val i = 5
    val r = 3
    when(j+r) {
        i-r -> println("i-r")
        i+5 -> println("i+5")
    }
    val sum = 1000
    val rate = when(sum) {
        in 100..999 -> 10
        in 1000..10000 -> 15
        else -> 20
    }


}