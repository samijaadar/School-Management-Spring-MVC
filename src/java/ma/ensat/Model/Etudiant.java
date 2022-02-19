/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sami
 */
@Entity
@Table(name = "etudiant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etudiant.findAll", query = "SELECT e FROM Etudiant e"),
    @NamedQuery(name = "Etudiant.findByCne", query = "SELECT e FROM Etudiant e WHERE e.cne = :cne"),
    @NamedQuery(name = "Etudiant.findByNom", query = "SELECT e FROM Etudiant e WHERE e.nom = :nom"),
    @NamedQuery(name = "Etudiant.findByPrenom", query = "SELECT e FROM Etudiant e WHERE e.prenom = :prenom"),
    @NamedQuery(name = "Etudiant.findByFiliere", query = "SELECT e FROM Etudiant e WHERE e.filiere.idFiliere = :filiereId"),
    @NamedQuery(name = "Etudiant.findNonAttached", query = "SELECT e FROM Etudiant e WHERE e.filiere IS NULL")})
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cne")
    private String cne;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prenom")
    private String prenom;
    @JoinColumn(name = "filiereId", referencedColumnName = "idFiliere")
    @ManyToOne
    private Filiere filiere;

    public Etudiant() {
    }

    public Etudiant(String cne) {
        this.cne = cne;
    }

    public Etudiant(String cne, String nom, String prenom) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public Etudiant(String cne, String nom, String prenom, Filiere filiere) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.filiere=filiere;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiereId) {
        this.filiere = filiereId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cne != null ? cne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.cne == null && other.cne != null) || (this.cne != null && !this.cne.equals(other.cne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensat.Entities.Etudiant[ cne=" + cne + " ]";
    }
    
}
