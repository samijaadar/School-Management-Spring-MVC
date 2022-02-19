/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.Service;

import java.util.Collection;
import java.util.List;
import ma.ensat.DAO.FiliereDAO;
import ma.ensat.Model.Etudiant;
import ma.ensat.Model.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sami
 */
@Service
public class FiliereService {
    @Autowired
    FiliereDAO  filiereDao;
    
    public List<Filiere> getAllFilieres(){
        List<Filiere> list=filiereDao.getAllFilieres();
        return list;
    }
    
    public void addFiliere(Filiere filiere) {
        filiereDao.addFiliere(filiere);
    }
    
    public void deleteFiliere(int id) {
        filiereDao.deleteFiliere(id);
    }
    
    public Filiere selectFiliere(int id) {
        Filiere f= filiereDao.selectFiliere(id);
        return f;
    }
    
    public void updateFiliere(Filiere filiere) {
        filiereDao.updateFiliere(filiere);
    }
    
    public Collection<Etudiant> getEtudiantsByFiliere(int id){
       return filiereDao.getEtudiantsByFiliere(id);
    }
}
