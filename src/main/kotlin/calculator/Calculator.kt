package calculator

class Calculator: ArithmeticOperations {
    override fun sum(vararg numbers: Int): Int = numbers.sum()
    override fun sum(vararg numbers: Double): Double = numbers.sum()
    override fun sum(vararg numbers: Float): Float = numbers.sum()
    /*---*/
    override fun subtract(vararg numbers: Int): Int {
        var total = numbers.first()
        numbers.forEach { total -= it }
        return total + numbers.first()
    }
    override fun subtract(vararg numbers: Double): Double {
        var total = numbers.first()
        numbers.forEach { total -= it }
        return total + numbers.first()
    }
    override fun subtract(vararg numbers: Float): Float {
        var total = numbers.first()
        numbers.forEach { total -= it }
        return total + numbers.first()
    }
    /*---*/
    override fun multiply(vararg numbers: Int): Int {
        var total = numbers.first()
        for (i in numbers.indices) {
            if (i == numbers.lastIndex) break
            total *= numbers[i+1]
        }
        return total
    }
    override fun multiply(vararg numbers: Double): Double {
        var total = numbers.first()
        for (i in numbers.indices) {
            if (i == numbers.lastIndex) break
            total *= numbers[i+1]
        }
        return total
    }
    override fun multiply(vararg numbers: Float): Float {
        var total = numbers.first()
        for (i in numbers.indices) {
            if (i == numbers.lastIndex) break
            total *= numbers[i+1]
        }
        return total
    }
    /*---*/
    override fun divide(vararg numbers: Int): Int {
        var total = numbers.first()
        for (i in numbers.indices) {
            if (i == numbers.lastIndex) break
            total /= numbers[i+1]
        }
        return total
    }
    override fun divide(vararg numbers: Double): Double {
        var total = numbers.first()
        for (i in numbers.indices) {
            if (i == numbers.lastIndex) break
            total /= numbers[i+1]
        }
        return total
    }
    override fun divide(vararg numbers: Float): Float {
        var total = numbers.first()
        for (i in numbers.indices) {
            if (i == numbers.lastIndex) break
            total /= numbers[i+1]
        }
        return total
    }
}
