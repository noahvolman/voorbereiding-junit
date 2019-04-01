package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i) {
        var returnValue = new StringBuilder();

        if (i % 3 == 0) {
            returnValue.append("Fizz");
        }
        if (i % 5 == 0) {
            returnValue.append("Buzz");
        }
        if (returnValue.length() == 0) {
            returnValue.append(i);
        }

        return returnValue.toString();
    }
}
