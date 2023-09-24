public class Rectangle {
    private int longueur;
    private int largeur;
    private int surface;
    public Rectangle(int longueur, int largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }
    public void surface(){
        surface=longueur*largeur;
        System.out.println("la surface du rectangle est de : "+surface);
    }
    public void afficher(){
        System.out.println("longueur: "+longueur+"\nlargeur: "+largeur);
    }

}
