package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Datosinstitucionales;
import model.Detallenecesipaac;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-07T16:56:43")
@StaticMetamodel(Listadonecesipaac.class)
public class Listadonecesipaac_ { 

    public static volatile SingularAttribute<Listadonecesipaac, String> nombresolicitante;
    public static volatile SingularAttribute<Listadonecesipaac, String> ejerciciofiscal;
    public static volatile SingularAttribute<Listadonecesipaac, Datosinstitucionales> codigoinstitucion;
    public static volatile SingularAttribute<Listadonecesipaac, Date> fechaelaboracion;
    public static volatile CollectionAttribute<Listadonecesipaac, Detallenecesipaac> detallenecesipaacCollection;
    public static volatile SingularAttribute<Listadonecesipaac, String> nombreinstitucion;

}