package r5a08.tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class UserGreeting2Test {
    @Test()
    public void testNullInput() {
        UserGreeting2 userGreeting2 = new UserGreeting2();
        System.out.println("Input: qwertyuiopasd" + "Input length: 13");
        UserGreetingFailureException exception = assertThrows(UserGreetingFailureException.class, () -> userGreeting2.formalGreeting("qwertyuiopasd"));
        Assertions.assertEquals("Le paramètre ne doit pas dépasser 10 caractères", exception.getMessage());
    }
}