package r5a08.tp1;
import java.util.regex.Pattern;

public class UserGreeting3 {
    public String formalGreeting(String nom) throws UserGreetingFailureException {
        String regex = "^[a-zA-Z0-9]*$";
        if (!Pattern.matches(regex, nom)) {
            throw new UserGreetingFailureException("Le paramètre ne doit pas contenir de caractères spéciaux, ni d'espaces");
        }
        return "Bonjour, " + nom;
    }   
}