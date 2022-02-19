/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sami
 */
@Entity
@Table(name = "filiere")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filiere.findAll", query = "SELECT f FROM Filiere f"),
    @NamedQuery(name = "Filiere.findByCode", query = "SELECT f FROM Filiere f WHERE f.code = :code"),
    @NamedQuery(name = "Filiere.findByLibelle", query = "SELECT f FROM Filiere f WHERE f.libelle = :libelle"),
    @NamedQuery(name = "Filiere.findByIdFiliere", query = "SELECT f FROM Filiere f WHERE f.idFiliere = :idFiliere")})
public class Filiere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFiliere")
    private Integer idFiliere;
     
    @Basic(optional = false)
    @NotNull
    @Column(name = "code")
    private String code;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "libelle")
    private String libelle;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filiere")
    private Collection<Etudiant> etudiantCollection;

    public Filiere() {
    }

    public Filiere(Integer idFiliere) {
        this.idFiliere = idFiliere;
    }

    public Filiere(Integer idFiliere, String code, String libelle) {
        this.idFiliere = idFiliere;
        this.code = code;
        this.libelle = libelle;
    }
    public Filiere(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getIdFiliere() {
        return idFiliere;
    }

    public void setIdFiliere(Integer idFiliere) {
        this.idFiliere = idFiliere;
    }

    @XmlTransient
    public Collection<Etudiant> getEtudiantCollection() {
        return etudiantCollection;
    }

    public void setEtudiantCollection(Collection<Etudiant> etudiantCollection) {
        this.etudiantCollection = etudiantCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFiliere != null ? idFiliere.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filiere)) {
            return false;
        }
        Filiere other = (Filiere) object;
        if ((this.idFiliere == null && other.idFiliere != null) || (this.idFiliere != null && !this.idFiliere.equals(other.idFiliere))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensat.Entities.Filiere[ idFiliere=" + idFiliere + " ]";
    }
    
}
