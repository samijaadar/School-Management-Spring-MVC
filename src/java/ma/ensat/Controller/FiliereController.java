/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.Controller;

import java.util.Collection;
import java.util.List;
import ma.ensat.Model.Etudiant;
import ma.ensat.Model.Filiere;
import ma.ensat.Service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Sami
 */
@Controller
@RequestMapping("Filiere")
public class FiliereController {
    
    @Autowired
    FiliereService filiereService;
    
    @GetMapping()
    public ModelAndView home(Model model){
        List<Filiere> list=filiereService.getAllFilieres();
        return new ModelAndView("Filiere/addFiliere","filieres",list).addObject("filiere",new Filiere());
    }
    
    @RequestMapping(value = "/addFiliere", method = RequestMethod.POST)
    public String addFiliere(@ModelAttribute("filiere") Filiere filiere) {
        filiereService.addFiliere(filiere);
        return  "redirect:/Filiere/";
    }
    
    @GetMapping(value = "/deleteFiliere")
    public String deleteFiliere(@RequestParam("id") int id) {
        filiereService.deleteFiliere(id);
        return  "redirect:/Filiere/";
    }
    
    @GetMapping(value = "/editFiliere")
    public String editFiliere(@RequestParam("id") int id, Model m) {
        Filiere f= filiereService.selectFiliere(id);
        m.addAttribute("filiere",f);
        return "Filiere/editFiliere";
    }
    
    @GetMapping(value = "/updateFiliere")
    public String updateFiliere(@ModelAttribute("filiere") Filiere filiere) {
        filiereService.updateFiliere(filiere);
        return  "redirect:/Filiere/";
    }
    
    @GetMapping(value="/findStudents")
    public ModelAndView findStudents(@RequestParam(name="filiere", required=false, defaultValue = "0")int id,Model model){
        Filiere filiere = filiereService.selectFiliere(id);
        List<Filiere> filieres=filiereService.getAllFilieres();
        Collection<Etudiant> etudiants=filiereService.getEtudiantsByFiliere(id);
        return new ModelAndView("findStudents","etudiants",etudiants).addObject("filieres",filieres).addObject("filiere",filiere);
    }
}
