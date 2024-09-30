package r5a08.tp1;

import java.util.regex.Pattern;

public class UserGreetingFinal {
    public String formalGreeting(String nom) {
        // Conditions for name length
        if (nom.length() > 10) {
            throw new UserGreetingFailureException("Le paramètre ne doit pas dépasser 10 caractères");
        }
        // Condition for special characters and spaces
        String regex = "^[a-zA-Z0-9]*$";
        if (!Pattern.matches(regex, nom)) {
            throw new UserGreetingFailureException("Le paramètre ne doit pas contenir de caractères spéciaux, ni d'espaces");
        }
        return "Bonjour, " + nom;
    }

}
