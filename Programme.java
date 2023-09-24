public class Programme {
    public static void main(String[] args) {
        Client client= new Client("drevet","martin", 23867,1500);
        client.getCompte().depot(1000);
        client.getCompte().retrait(300);
        client.afficherCompte();
    }
}
