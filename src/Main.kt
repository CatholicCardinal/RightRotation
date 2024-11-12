fun main() {
    // write your code here
    val outputElements : MutableList<Int>
    val inputElements = mutableListOf<Int> ()
    val size = readln().toInt()

    for (i in 0 until size) {
        inputElements.add(readln().toInt())
    }

    var rotate = readln().toInt()
    rotate =  rotate % size

    if (rotate != 0) outputElements = (inputElements.slice(size - rotate..size - 1) + inputElements.slice(0 until size - rotate)).toMutableList()
    else outputElements = inputElements

    println(outputElements.joinToString())


}