package r5a08.tp1;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class UserGreetingTest {

    @Test()
    public void should_return_correct_greeting() {
        // Setup
        System.out.println("Starting test");
        UserGreeting userGreeting = new UserGreeting();

        // Test
        String actual = userGreeting.formalGreeting("");
        String expected = "Bonjour, ";
        assertThat(actual).isEqualTo(expected);
    }
}