/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.Service;

import java.util.List;
import ma.ensat.DAO.EtudiantDAO;
import ma.ensat.Model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sami
 */
@Service
public class EtudiantService {
    @Autowired
    EtudiantDAO  etudiantDAO;
    
    public void addEtudiant(Etudiant e){
        etudiantDAO.addEtudiant(e);
    }
    
    public List<Etudiant> getAllEtudiants(){
        return etudiantDAO.getAllEtudiants();
    }
    
    public void deleteEtudiant(String code){
        etudiantDAO.deleteEtudiant(code);
    }
    
    public Etudiant selectEtudiantById(String code){
        return etudiantDAO.selectEtudiant(code);
    }
    
    public void updateEtudiant(Etudiant etudiant){
        etudiantDAO.updateEtudiant(etudiant);
    }
    
}
