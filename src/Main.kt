//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
//}

import java.util.Scanner

// Importing the viewHistory function from the History file

fun main() {
//    Initializes instances for class
    val calculator = Calculator()
    val history = mutableListOf<Operation>()
    val scanner = Scanner(System.`in`)

//    This basically keeps the calculator running until user chooses to exit
    while (true) {
        println("Choose an operation:")
        println("1. Add")
        println("2. Subtract")
        println("3. Multiply")
        println("4. Divide")
        println("5. Power")
        println("6. Square Root")
        println("7. Sine")
        println("8. Cosine")
        println("9. Tangent")
        println("10. View History")
        println("11. Exit")

        // reads the users inputs and execute the corresponding operations
        //example input = 2; executes second operation
        when (scanner.nextInt()) {
            1 -> performOperation(calculator, "Add", history, scanner)
            2 -> performOperation(calculator, "Subtract", history, scanner)
            3 -> performOperation(calculator, "Multiply", history, scanner)
            4 -> performOperation(calculator, "Divide", history, scanner)
            5 -> performOperation(calculator, "Power", history, scanner)
            6 -> performOperation(calculator, "Square Root", history, scanner)
            7 -> performOperation(calculator, "Sine", history, scanner)
            8 -> performOperation(calculator, "Cosine", history, scanner)
            9 -> performOperation(calculator, "Tangent", history, scanner)
            10 -> viewHistory(history)
            11 -> {
//                Exception handler:
                // exits the program
                println("Exiting the calculator. Goodbye!")
                break
            }
            else -> println("Invalid option. Please try again.")
        }
    }
}
// main function to perform arithmetic or trigonometric operations.
fun performOperation(calculator: Calculator, operation: String, history: MutableList<Operation>, scanner: Scanner) {
//    declared variables for operands and result
//    PS: val-immutable; var: mutable
    val a: Double
    val b: Double
    var result: Double = 0.0

    when (operation) {
        "Square Root" -> {
            println("Enter the number:")
            a = scanner.nextDouble()
            b = 0.0
            result = calculator.squareRoot(a)
        }
        in listOf("Sine", "Cosine", "Tangent") -> {
            println("Enter the angle in degrees:")
            a = scanner.nextDouble()
            b = 0.0
            result = when (operation) {
                "Sine" -> calculator.sine(a)
                "Cosine" -> calculator.cosine(a)
                "Tangent" -> calculator.tangent(a)
                else -> throw IllegalArgumentException("Invalid operation")
            }
        }
        else -> {
            println("Enter the first number:")
            a = scanner.nextDouble()
            println("Enter the second number:")
            b = scanner.nextDouble()
            result = when (operation) {
                "Add" -> calculator.add(a, b)
                "Subtract" -> calculator.subtract(a, b)
                "Multiply" -> calculator.multiply(a, b)
                "Divide" -> calculator.divide(a, b)
                "Power" -> calculator.power(a, b)
                else -> throw IllegalArgumentException("Invalid operation")
            }
        }
    }

//  Displays the result of the operation to the user in console
    println("The result of $operation is: $result")
    // records the operation result to the history
    history.add(Operation(operation, a, b, result))
}
