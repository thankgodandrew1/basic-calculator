import kotlin.math.*

// a  calc class that performs basic arithmetic and trigonometric operations.
class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    /**
     * Subtracts two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the result of subtracting b from a
     */
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

//  Multiplies two numbers.
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    /**
     * Divides two numbers.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of dividing a by b
     * @throws IllegalArgumentException if b is zero
     */
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Division by zero is not allowed.")
        }
        return a / b
    }

    /**
     * Raises a number to the power of another number.
     *
     * @param a the base
     * @param b the exponent
     * @return a raised to the power of b
     */
    fun power(a: Double, b: Double): Double {
        return a.pow(b)
    }

//  Calculates the square root of a number.
    fun squareRoot(a: Double): Double {
        if (a < 0) {
            throw IllegalArgumentException("Square root of a negative number is not allowed.")
        }
        return sqrt(a)
    }

    /**
     * Calculates the sine of an angle in degrees.
     *
     * @param angle the angle in degrees
     * @return the sine of the angle
     */
    fun sine(angle: Double): Double {
        return sin(Math.toRadians(angle))
    }

//  calculates the cosine of an angle in degrees.
    fun cosine(angle: Double): Double {
        val angleInRadians = Math.toRadians(angle)
        return cos(angleInRadians)
    }

//  Calculates the tangent of an angle in degrees.
    fun tangent(angle: Double): Double {
        return tan(Math.toRadians(angle))
    }
}
