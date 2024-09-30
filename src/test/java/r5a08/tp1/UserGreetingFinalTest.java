package r5a08.tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

public class UserGreetingFinalTest {
    @Test()
    public void test() {
        // Setup
        UserGreetingFinal userGreetingFinal = new UserGreetingFinal();

        // Test
        String actual = userGreetingFinal.formalGreeting("");
        String expected = "Bonjour, ";
        assertThat(actual).isEqualTo(expected);

        // Test input length
        System.out.println("Input: qwertyuiopasd" + "Input length: 13");
        UserGreetingFailureException exception = assertThrows(UserGreetingFailureException.class, () -> userGreetingFinal.formalGreeting("qwertyuiopasd"));
        Assertions.assertEquals("Le paramètre ne doit pas dépasser 10 caractères", exception.getMessage());

        // Test special characters
        String name = "abcdefgh!";
        System.out.println(String.format("Input: %s", name));
        UserGreetingFailureException exception_1 = assertThrows(UserGreetingFailureException.class, () -> userGreetingFinal.formalGreeting("abcdefgh!"));
        Assertions.assertEquals("Le paramètre ne doit pas contenir de caractères spéciaux, ni d'espaces", exception_1.getMessage());

        // Test spaces
        name = "abcd efgh";
        System.out.printf(String.format("Input: %s", name));
        UserGreetingFailureException exception_2 = assertThrows(UserGreetingFailureException.class, () -> userGreetingFinal.formalGreeting("abcd efgh"));
        Assertions.assertEquals("Le paramètre ne doit pas contenir de caractères spéciaux, ni d'espaces", exception_1.getMessage());
    }
}
