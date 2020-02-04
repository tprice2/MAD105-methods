/* Pseudocode

Variables: shape, area, and the corresponding variables for each shape
Process:

Ask the user to enter a number corresponding to each shape.
Store the input into the variable shape.
When shape is a given value, jump to the corresponding function for that shape.
Inside each shape function, ask the user to enter the variables used to calculate the area of that shape.
Calculate the area using the user inputs, and store that to the area variable.
Return the value in the area variable to the main function.
Inside the main function, print the area variable.
*/

fun rectangle():Float{
    println("Please enter the width: ")
    val width = readLine()!!.toFloat()

    println("Please enter the length: ")
    val length = readLine()!!.toFloat()

    val area = length * width
    return area
}

fun triangle():Double{
    println("Please enter the base: ")
    val base = readLine()!!.toFloat()

    println("Please enter the length: ")
    val height = readLine()!!.toFloat()

    val area = base * .5 * height
    return area
}

fun circle():Double{
    println("Please enter the radius: ")
    val radius = readLine()!!.toFloat()

    val area = 3.14 * radius * radius
    return area
}

fun square():Float{
    println("Please enter the side length: ")
    val side = readLine()!!.toFloat()

    val area = side * side
    return area
}

fun main(args: Array<String>) {
    println("Please choose a shape:")
    println("1: Rectangle")
    println("2: Triangle")
    println("3: Circle")
    println("4: Square")
    val shape = readLine()!!.toInt()
    var area = 0.00
    when(shape)
    {
        1 -> area = rectangle().toDouble()
        2 -> area = triangle().toDouble()
        3 -> area = circle().toDouble()
        4 -> area = square().toDouble()
    }

    println("The area is the following:")
    println(area)
}
