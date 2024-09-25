package r5a08.tp1;

public class UserGreeting2 {
    public String formalGreeting(String nom) throws UserGreetingFailureException {
        if (nom.length() > 10) {
            throw new UserGreetingFailureException("Le paramètre ne doit pas dépasser 10 caractères");
        }
        return "Bonjour, " + nom;
    }
}