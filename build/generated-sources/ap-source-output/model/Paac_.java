package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Datosinstitucionales;
import model.Detallepaac;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-22T09:04:49")
@StaticMetamodel(Paac.class)
public class Paac_ { 

    public static volatile SingularAttribute<Paac, String> nombreinstitucion;
    public static volatile CollectionAttribute<Paac, Detallepaac> detallepaacCollection;
    public static volatile SingularAttribute<Paac, Date> fechaelaboracion;
    public static volatile SingularAttribute<Paac, String> ejerciciofiscal;
    public static volatile SingularAttribute<Paac, Character> version;
    public static volatile SingularAttribute<Paac, Datosinstitucionales> codigoinstitucion;
    public static volatile SingularAttribute<Paac, Integer> correlativomodificacion;

}