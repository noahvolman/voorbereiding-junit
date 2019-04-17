package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzExecutorTest {

    private FizzBuzzExecutor sut;

    @BeforeEach
    void setup() {
        sut = new FizzBuzzExecutor();
    }

    @Test
    void executeWithValidIntTest() {
        // Setup

        // Test
        var testValue = sut.execute(37);

        // Verify
        Assertions.assertEquals("37", testValue);
    }

    @Test
    void executeWithFizzValueTest() {
        // Setup

        // Test
        var testValue = sut.execute(3);

        // Verify
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeWithBuzzValueTest() {
        // Setup

        // Test
        var testValue = sut.execute(5);

        // Verify
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeWithFizzBuzzValueTest() {
        // Setup

        // Test
        var testValue = sut.execute(15);

        // Verify
        Assertions.assertEquals("FizzBuzz", testValue);
    }
}
