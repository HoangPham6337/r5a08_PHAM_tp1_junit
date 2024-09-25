package r5a08.tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class UserGreeting1Test {
    @Test()
    public void testNullInput() {
        UserGreeting1 userGreeting1 = new UserGreeting1();
        UserGreetingFailureException exception = assertThrows(UserGreetingFailureException.class, () -> userGreeting1.formalGreeting(""));
        Assertions.assertEquals("Le paramètre ne doit pas être vide", exception.getMessage());
    }
}