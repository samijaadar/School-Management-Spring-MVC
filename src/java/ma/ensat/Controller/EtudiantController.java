/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.Controller;

import java.util.List;
import ma.ensat.Model.Etudiant;
import ma.ensat.Model.Filiere;
import ma.ensat.Service.EtudiantService;
import ma.ensat.Service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Sami
 */
@Controller
@RequestMapping("Etudiant")
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService ;
    
    @Autowired
    FiliereService filiereService;
    
    @GetMapping
    public ModelAndView home(Model model){
        List<Filiere> filieres=filiereService.getAllFilieres();
        List<Etudiant> etudiants=etudiantService.getAllEtudiants();
        return new ModelAndView("Etudiant/addEtudiant","etudiants",etudiants).addObject("etudiant",new Etudiant()).addObject("filieres",filieres);
    }
    
    @GetMapping(value="/addEtudiant")
    public String addEtudiant(@RequestParam("idFiliere")int id, @ModelAttribute("etudiant") Etudiant etudiant) {
        Filiere filiere = filiereService.selectFiliere(id);
        etudiant.setFiliere(filiere);
        etudiantService.addEtudiant(etudiant);
        return "redirect:/Etudiant/";
    }
    
    @GetMapping(value="/deleteEtudiant")
    public String deleteEtudiant(@RequestParam("id")String id) {
        etudiantService.deleteEtudiant(id);
        return "redirect:/Etudiant/";
    }
    
    @GetMapping(value="/editEtudiant")
    public String editEtudiant(@RequestParam("id")String id, Model model) {
        List<Filiere> filieres=filiereService.getAllFilieres();
        
        Etudiant e= etudiantService.selectEtudiantById(id);
        model.addAttribute("etudiant",e).addAttribute("filieres",filieres);
        
        return "Etudiant/editEtudiant";
    }
    
    @GetMapping(value="/updateEtudiant")
    public String updateEtudiant(@RequestParam("idFiliere")int id, @ModelAttribute("etudiant") Etudiant etudiant) {
        Filiere filiere = filiereService.selectFiliere(id);
        etudiant.setFiliere(filiere);
        etudiantService.updateEtudiant(etudiant);
        return "redirect:/Etudiant/";
    }
}
