package nl.han.ica.oose.dea.testedfizzbuzz;


import org.junit.Test;

public class TestKlassePrintNumber {
    @Test
    void executeWithValidIntTest(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }
}
