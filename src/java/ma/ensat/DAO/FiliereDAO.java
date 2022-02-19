/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.DAO;
import ma.ensat.Model.Filiere;
import java.util.*; 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import ma.ensat.Model.Etudiant;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Sami
 */
@Repository
public class FiliereDAO {
    EntityManager em;
    EntityTransaction tx;
    
    
    public List<Filiere> getAllFilieres(){ 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        Query req ;
        req= em.createNamedQuery("Filiere.findAll");
        return req.getResultList();
    }  
    public void addFiliere(Filiere f){
        try 
        {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        em.persist(f);
        tx.commit();
        } 
        catch (Exception ex)
        {
            System.out.println("Erreur : " + ex.getMessage());
        }
    }
    
    public void deleteFiliere(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        Filiere fil= selectFiliere(id);
        for (Etudiant etudiant : fil.getEtudiantCollection()){
                etudiant.setFiliere(null);
            }
        fil.setEtudiantCollection(null);
        em.remove(fil);
        tx.commit();
    }
    
    public Filiere selectFiliere(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        Filiere f;
        f = em.find(Filiere.class, id);
        return f;
    }
    public void updateFiliere(Filiere f){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        em.merge(f);
        tx.commit();
    }
    
    public Collection<Etudiant> getEtudiantsByFiliere(int id){
        List<Etudiant> studentsList = null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        Query req ;
        if (id == 0) {
            req= em.createNamedQuery("Etudiant.findNonAttached");
        }
        else{
            req= em.createNamedQuery("Etudiant.findByFiliere").setParameter("filiereId", id);
        }
        return req.getResultList();
    }
}

