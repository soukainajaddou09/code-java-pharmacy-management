public class Utilisateur {
    protected String nom;
    protected String prenom;
    protected int id;

    public void seConnecter() {
        System.out.println("Connexion...");
    }

    public void seDeconnecter() {
        System.out.println("Déconnexion...");
    }
}