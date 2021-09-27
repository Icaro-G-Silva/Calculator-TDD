package calculator

interface ArithmeticOperations {
    /**
     * ## Sum function that sums all Integers
     * @author icaro silva
     *
     * @param numbers Integer varargs
     * @return [Int] - Sum of all *numbers*' elements
     */
    fun sum(vararg numbers: Int): Int
    /**
     * ## Sum function that sums all Doubles
     * @author icaro silva
     *
     * @param numbers Double varargs
     * @return [Double] - Sum of all *numbers*' elements
     */
    fun sum(vararg numbers: Double): Double
    /**
     * ## Sum function that sums all Floats
     * @author icaro silva
     *
     * @param numbers Float varargs
     * @return [Float] - Sum of all *numbers*' elements
     */
    fun sum(vararg numbers: Float): Float
    /*---*/
    /**
     * ## Subtract function that subtracts all Ints
     * @author icaro silva
     *
     * @param numbers Int varargs
     * @return [Int] - Subtraction of all *numbers*' elements
     */
    fun subtract(vararg numbers: Int): Int
    /**
     * ## Subtract function that subtracts all Doubles
     * @author icaro silva
     *
     * @param numbers Double varargs
     * @return [Double] - Subtraction of all *numbers*' elements
     */
    fun subtract(vararg numbers: Double): Double
    /**
     * ## Subtract function that subtracts all Floats
     * @author icaro silva
     *
     * @param numbers Float varargs
     * @return [Float] - Subtraction of all *numbers*' elements
     */
    fun subtract(vararg numbers: Float): Float
    /*---*/
    /**
     * ## Multiply function that multiplies all Ints
     * @author icaro silva
     *
     * @param numbers Int varargs
     * @return [Int] - Multiply of all *numbers*' elements
     */
    fun multiply(vararg numbers: Int): Int
    /**
     * ## Multiply function that multiplies all Doubles
     * @author icaro silva
     *
     * @param numbers Double varargs
     * @return [Double] - Multiply of all *numbers*' elements
     */
    fun multiply(vararg numbers: Double): Double
    /**
     * ## Multiply function that multiplies all Floats
     * @author icaro silva
     *
     * @param numbers Float varargs
     * @return [Float] - Multiply of all *numbers*' elements
     */
    fun multiply(vararg numbers: Float): Float
    /*---*/
    /**
     * ## Divide function that divides all Ints
     * @author icaro silva
     *
     * @param numbers Int varargs
     * @return [Int] - Division of all *numbers*' elements
     */
    fun divide(vararg numbers: Int): Int
    /**
     * ## Divide function that divides all Doubles
     * @author icaro silva
     *
     * @param numbers Double varargs
     * @return [Double] - Division of all *numbers*' elements
     */
    fun divide(vararg numbers: Double): Double
    /**
     * ## Divide function that divides all Floats
     * @author icaro silva
     *
     * @param numbers Float varargs
     * @return [Float] - Division of all *numbers*' elements
     */
    fun divide(vararg numbers: Float): Float
    /*---*/
}
