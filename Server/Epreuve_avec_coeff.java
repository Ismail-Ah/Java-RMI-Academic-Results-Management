public class Epreuve_avec_coeff {
    public String nom;
    public double coef;
    public double note;
    public Epreuve_avec_coeff(String nom,double coef,double note){
        this.nom = nom;
        this.coef = coef;
        this.note = note;
    }

    public String toString(String nomEtu){
        return "Epreuve de "+nom+" de coef "+coef+" : "+nomEtu+" a une note "+note;
    }
}
