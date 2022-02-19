package ma.ensat.Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ma.ensat.Model.Filiere;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-01-05T12:12:40")
@StaticMetamodel(Etudiant.class)
public class Etudiant_ { 

    public static volatile SingularAttribute<Etudiant, Filiere> filiere;
    public static volatile SingularAttribute<Etudiant, String> cne;
    public static volatile SingularAttribute<Etudiant, String> nom;
    public static volatile SingularAttribute<Etudiant, String> prenom;

}