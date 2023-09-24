public class Utilisateur {
    private int age;
    private String nom;

    public Utilisateur(String nom, int age){
        this.nom=nom;
        this.age=age;
    }

    public void parler(){
        System.out.println("bla bla bla");
    }

    public void afficher(){
        System.out.println("Bonjour je m'appelle "+nom+", j'ai "+ age+" ans");
    }
}
