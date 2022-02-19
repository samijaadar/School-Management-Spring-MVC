/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.DAO;
import ma.ensat.Model.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Sami
 */
@Repository
public class EtudiantDAO {
    EntityManager em;
    EntityTransaction tx;

     
    public void addEtudiant(Etudiant etu){
         try 
        {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();
            em.persist(etu);
            tx.commit();
        } 
        catch (Exception ex)
        {
            System.out.println("Erreur : " + ex.getMessage());
        }
    }
    
    public List<Etudiant> getAllEtudiants(){  
        Query req ;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        req= em.createNamedQuery("Etudiant.findAll");
        return req.getResultList();

    }
    
    public void deleteEtudiant(String code){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        Etudiant e= selectEtudiant(code);
        em.remove(e);
        tx.commit();
    }
    
    public Etudiant selectEtudiant(String code){
        Etudiant e;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        e = em.find(Etudiant.class, code);
        return e;
    }
    
    public void updateEtudiant(Etudiant etu){ 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionFilieresMVCPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        em.merge(etu);
        tx.commit();
    }
     
}
