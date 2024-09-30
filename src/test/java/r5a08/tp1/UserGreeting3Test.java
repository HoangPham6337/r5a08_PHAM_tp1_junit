package r5a08.tp1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.*;

public class UserGreeting3Test {
    @Test()
    public void testNoSpecialCharacterOrSpaces() {
        UserGreeting3 userGreeting3 = new UserGreeting3();
        String name = "abcdefgh!";
        System.out.println(String.format("Input: %s", name));
        UserGreetingFailureException exception_1 = assertThrows(UserGreetingFailureException.class, () -> userGreeting3.formalGreeting("abcdefgh!"));
        Assertions.assertEquals("Le paramètre ne doit pas contenir de caractères spéciaux, ni d'espaces", exception_1.getMessage());

        name = "abcd efgh";
        System.out.printf(String.format("Input: %s", name));
        UserGreetingFailureException exception_2 = assertThrows(UserGreetingFailureException.class, () -> userGreeting3.formalGreeting("abcd efgh"));
        Assertions.assertEquals("Le paramètre ne doit pas contenir de caractères spéciaux, ni d'espaces", exception_1.getMessage());
    }

}