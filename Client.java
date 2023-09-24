import java.util.ArrayList;
public class Client {
    private String nom;
    private String prenom;
    private int numCompte;
    private CompteBanque compte;
    private ArrayList<CompteBanque> comptes= new ArrayList<>();
    public Client(String nom, String prenom, int numCompte,double soldeIni){
        this.nom=nom;
        this.prenom=prenom;
        this.numCompte=numCompte;
        this.compte= new CompteBanque(soldeIni);
        this.comptes.add(compte);
    }

    public CompteBanque getCompte() {
        return compte;
    }

    public void afficherCompte(){
        System.out.println(nom+" "+prenom);
        System.out.println(comptes.get(0).getSolde());
    }
}
