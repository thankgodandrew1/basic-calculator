/**
 * Data class representing an arithmetic or trigonometric operation.
 *
 * @property operation The type of operation performed (e.g., "Add", "Subtract", "Sine").
 * ,, a The first operand of the operation.
 * ,, b The second operand of the operation (default value is 0.0 if not
 *      used, especially when performing trigonometric op.).
 * @property operation result The result of the operation.
 */

data class Operation(
    val operation: String,
    val a: Double,
    val b: Double,
    val result: Double
)