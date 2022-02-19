package ma.ensat.Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ma.ensat.Model.Etudiant;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-01-05T12:12:40")
@StaticMetamodel(Filiere.class)
public class Filiere_ { 

    public static volatile SingularAttribute<Filiere, String> code;
    public static volatile SingularAttribute<Filiere, Integer> idFiliere;
    public static volatile SingularAttribute<Filiere, String> libelle;
    public static volatile CollectionAttribute<Filiere, Etudiant> etudiantCollection;

}