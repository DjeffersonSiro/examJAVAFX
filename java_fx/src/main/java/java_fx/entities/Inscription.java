package java_fx.entities;

import java.sql.Date;

public class Inscription {

    int id;
    Date dateInscription;

    // Mani to One
    private Classe classe;
    private Etudiant etudiant;
    
    public Inscription(String date, Classe classe2, Utilisateurs etudiant2) {
    }
    public Date getDateInscription() {
        return dateInscription;
    }
    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Utilisateurs getEtudiant() {
        return null;
    }
    public Utilisateurs getClasse() {
        return null;
    }
    public String getDateinscription() {
        return null;
    }

    
}
