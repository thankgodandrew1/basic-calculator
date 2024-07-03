//import Operation

fun viewHistory(history: List<Operation>) {
    // checks if history is empty
    if (history.isEmpty()) {
        println("No history available.")
    } else {
        println("Operation History:")
        // iterates through each object in the history list
        for (op in history) {
            // prints the details of each operation: operation type, operands, and result
            println("${op.operation}: ${op.a} and ${op.b} = ${op.result}")
        }
    }
}
