public class Patient extends Utilisateur {

    public void envoyerOrdonnance() {
        System.out.println("Ordonnance envoyée");
    }

    public void passerCommande() {
        System.out.println("Commande passée");
    }

    public void recevoirNotification(String message) {
        System.out.println("Notification : " + message);
    }
}