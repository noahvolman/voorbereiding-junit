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
        // Arrange

        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }

    @Test
    void executeWithFizzValueTest() {
        // Arrange

        // Act
        var testValue = sut.execute(3);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeWithBuzzValueTest() {
        // Arrange

        // Act
        var testValue = sut.execute(5);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeWithFizzBuzzValueTest() {
        // Arrange

        // Act
        var testValue = sut.execute(15);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }
}
