public class MainObjet {
    public static void main(String[] args) {
        Voiture voiture=new Voiture( "vert",130,110);
        //voiture.rouler();
        //voiture.afficher();

        Utilisateur utilisateur= new Utilisateur("hugo",15);
        //utilisateur.parler();
        //utilisateur.afficher();

        Rectangle rectangle = new Rectangle(6,6);
        rectangle.surface();
        rectangle.afficher();

        Square carré = new Square(4);
        carré.surface();
    }
}
