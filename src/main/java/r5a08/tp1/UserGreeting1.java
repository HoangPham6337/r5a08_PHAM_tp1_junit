package r5a08.tp1;

public class UserGreeting1 {
    public String formalGreeting(String nom) throws UserGreetingFailureException {
        if (nom.isEmpty()) {
            throw new UserGreetingFailureException("Le paramètre ne doit pas être vide");
        }
        return "Bonjour, " + nom;
    }
}