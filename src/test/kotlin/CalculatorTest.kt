import calculator.Calculator
import io.mockk.impl.annotations.SpyK
import io.mockk.spyk
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class CalculatorTest {

    @SpyK
    lateinit var calculatorMock: Calculator

    @BeforeTest
    fun setupMocks() {
        calculatorMock = spyk(Calculator())
    }

    @Test
    fun sumWithSomeIntValues() {
        assertEquals(10, calculatorMock.sum(4, 4, 2), "Wrong <INT> sum value")
        assertNotEquals(20, calculatorMock.sum(19, 1, 2, 5), "Correct <INT> sum value (expecting false)")
    }
    @Test
    fun sumWithSomeDoubleValues() {
        assertEquals(15.7, calculatorMock.sum(2.5, 4.3, 8.9), "Wrong <DOUBLE> sum value")
        assertNotEquals(1.1, calculatorMock.sum(0.5, 0.5, 0.2), "Correct <DOUBLE> sum value (expecting false)")
    }
    @Test
    fun sumWithSomeFloatValues() {
        assertEquals(15.7F, calculatorMock.sum(2.5F, 4.3F, 8.9F), "Wrong <FLOAT> sum value")
        assertNotEquals(20.0F, calculatorMock.sum(19.0F, 2.3F, 5.7F), "Correct <FLOAT> sum value (expecting false)")
    }
    /*---*/
    @Test
    fun subtractWithSomeIntValues() {
        assertEquals(15, calculatorMock.subtract(40, 20, 5), "Wrong <INT> subtract value")
        assertNotEquals(1, calculatorMock.subtract(20, 10, 5, 3), "Correct <INT> subtract value (expecting false)")
    }
    @Test
    fun subtractWithSomeDoubleValues() {
        assertEquals(15.0, calculatorMock.subtract(40.0, 20.0, 5.0), "Wrong <DOUBLE> subtract value")
        assertNotEquals(-50.5, calculatorMock.subtract(10.0, 15.5, 5.0, 37.8), "Correct <DOUBLE> subtract value (expecting false)")
    }
    @Test
    fun subtractWithSomeFloatValues() {
        assertEquals(15.0F, calculatorMock.subtract(40.0F, 20.0F, 5.0F), "Wrong <FLOAT> subtract value")
        assertNotEquals(0.0F, calculatorMock.subtract(90.0F, 89.9F), "Correct <FLOAT> subtract value (expecting false)")
    }
    /*---*/
    @Test
    fun multiplyWithSomeIntValues() {
        assertEquals(25, calculatorMock.multiply(5, 5), "Wrong <INT> multiply value")
        assertNotEquals(0, calculatorMock.multiply(1, 3, 8), "Correct <INT> multiply value (expecting false)")
    }
    @Test
    fun multiplyWithSomeDoubleValues() {
        assertEquals(70.0, calculatorMock.multiply(7.0, 10.0), "Wrong <DOUBLE> multiply value")
        assertNotEquals(30.4, calculatorMock.multiply(14.7, 2.9), "Correct <DOUBLE> multiply value (expecting false)")
    }
    @Test
    fun multiplyWithSomeFloatValues() {
        assertEquals(102.0F, calculatorMock.multiply(2.5F, 6.0F, 6.8F), "Wrong <FLOAT> multiply value")
        assertNotEquals(2.4F, calculatorMock.multiply(2.0F), "Correct <FLOAT> multiply value (expecting false)")
    }
    /*---*/
    @Test
    fun divideWithSomeIntValues() {
        assertEquals(2, calculatorMock.divide(4, 2), "Wrong <INT> division value")
        assertNotEquals(3, calculatorMock.divide(2, 1), "Correct <INT> division value (expecting false)")
    }
    @Test
    fun divideWithSomeDoubleValues() {
        assertEquals(4.0, calculatorMock.divide(8.0, 2.0), "Wrong <DOUBLE> division value")
        assertNotEquals(6.4, calculatorMock.divide(3.9, 1.2, 19.0), "Correct <DOUBLE> division value (expecting false)")
    }
    @Test
    fun divideWithSomeFloatValues() {
        assertEquals(0.78828824F, calculatorMock.divide(17.5F, 22.2F), "Wrong <FLOAT> division value")
        assertNotEquals(0.0F, calculatorMock.divide(1.0F, 0.0F), "Correct <FLOAT> division value (expecting false)")
    }
}
