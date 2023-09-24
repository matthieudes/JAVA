public class CompteBanque {
    private double solde;
    public CompteBanque(double solde){
        this.solde=solde;
    }

    public double getSolde() {
        return solde;
    }
    public void retrait(double montant){
        solde -= montant;
    }

    public void depot(double montant){
        solde += montant;
    }
}
