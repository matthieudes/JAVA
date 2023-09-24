
public class Voiture {

    private String couleur;
    private int vitesse;
    private int puissance;
    public Voiture( String couleur, int vitesse, int puissance){
            this.couleur=couleur;
            this.vitesse=vitesse;
            this.puissance=puissance;
    }

    public void rouler(){
        System.out.println("la voiture est en marche ");
    }

    public void afficher(){
        System.out.println("la voiture est "+couleur+", la puissance est de "+puissance+", à une vitesse max de "+vitesse);

    }
}

