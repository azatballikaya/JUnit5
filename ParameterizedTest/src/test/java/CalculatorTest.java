import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/*
    Name: Azat
    Surname: Ballıkaya
    Student Number: B221202351
    

 */

class CalculatorTest {

    @BeforeEach
    void setUp() {
        
        
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDivision1() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void testDivision2() {
        assertEquals(2.5, Calculator.divide(10, 4));
    }

    @Test
    void testDivision3() {
        assertEquals(2.5, Calculator.divide(12.5, 5));
    }

    @Test
    void testDivision4() {
        assertEquals(4, Calculator.divide(10, 2.5));
    }

    @Test
    void testDivision5() {
        assertEquals(5, Calculator.divide(12.5, 2.5));
    }
    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 5, 2.5",
            "10, 2.5, 4",
            "12.5, 2.5, 5"
    })
    void DivisionControl(double divisor, double dividend, double division){
        assertEquals(division, Calculator.divide(dividend,divisor));
    }
    @Test
    void testDivision6() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );

    }
}