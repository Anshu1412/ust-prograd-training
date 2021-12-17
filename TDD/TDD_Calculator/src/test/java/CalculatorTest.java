import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;


public class CalculatorTest {
    private Calculator calc;

    @Nested
    public class CalculatingAdditionFunction {
        @BeforeEach
        public void setUp() {
            calc = new Calculator();
        }

        @Test
        public void additionOfTwentyAndTenGivesEight() {

            double result = calc.add(20, 10);
            double expected = 30;
            assertEquals(result, expected);
        }

        @Test
        public void additionOfFiveAndTenGivesFifteen() {
            double result = calc.add(5, 10);
            double expected = 15;
            assertEquals(result, expected);
        }
    }

    @Nested
    public class CalculatingSubtractionFunction {
        @BeforeEach
        public void setUp() {
            calc = new Calculator();
        }

        @Test
        public void subtractionOfTwentyAndTenGivesTen() {
            double result = calc.sub(20, 10);
            double expected = 10;
            assertEquals(result, expected);
        }

        @Test
        public void subtractionOfFiveAndTenGivesMinusFive() {
            double result = calc.sub(5, 10);
            double expected = -5;
            assertEquals(result, expected);
        }
    }

    @Nested
    public class CalculatingMultiplicationFunction {
        @BeforeEach
        public void setUp() {
            calc = new Calculator();
        }

        @Test
        public void MultiplicationOfTwentyAndTenGivesTwoHundred() {
            double result = calc.mul(20, 10);
            double expected = 200;
            assertEquals(result, expected);
        }

        @Test
        public void MultiplicationOfFiveAndTenGivesFifty() {
            double result = calc.mul(5, 10);
            double expected = 50;
            assertEquals(result, expected);
        }
    }
     @Nested
    public class CalculatingDivisionFunction {
         @BeforeEach
         public void setUp() {
             calc = new Calculator();
         }

         @Test
         public void DivisionOfTwentyByTenGivesTwo() {
             double result = calc.div(20, 10);
             double expected =   2;
             assertEquals(result, expected);
         }

         @Test
         public void DivisionOfTwentyByZeroGivesException() {
             assertThrows(ArithmeticException.class, () -> calc.div(20, 0));
         }

    }
}