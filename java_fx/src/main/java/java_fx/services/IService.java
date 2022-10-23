package java_fx.services;
import java.util.List;

import java_fx.entities.Classe;
import java_fx.entities.Etudiant;
import java_fx.entities.Inscription;
import java_fx.entities.UsersAdmin;
import java_fx.entities.Utilisateurs;
public interface IService {
    public Classe insertClasse(Classe classe);



//    
    public List<Classe> selectAllClasses();
    public Classe selectClasseByID(int id); 
//
    public Utilisateurs insertProfesseur(Utilisateurs utilisateurs );
    public List<Utilisateurs > selectAllProfesseur();
    public Utilisateurs  selectProfesseurByID(int id);
//

    public Utilisateurs insertEtudiant(Etudiant etudiant );
    public List<Utilisateurs > selectAllEtudiant();
    public Utilisateurs  selectEtudiantByID(int id);
    
    public UsersAdmin seConnecter(String login,String password);

    public void affectation(Utilisateurs professeur,Classe classe);

    public List<Classe> filtrerProfesseurClasse(int id);



    public Utilisateurs selectEtudiantByNom(String nometud);



    public List filtreAn(String recupan);



    public Utilisateurs insertEtudiant(Inscription inscriptions);



    public List filtreAnClasse(String recup2, int idclasse);
}
