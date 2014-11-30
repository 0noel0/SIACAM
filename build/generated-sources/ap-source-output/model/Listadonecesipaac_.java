package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Datosinstitucionales;
import model.Detallenecesipaac;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-22T09:04:49")
@StaticMetamodel(Listadonecesipaac.class)
public class Listadonecesipaac_ { 

    public static volatile SingularAttribute<Listadonecesipaac, String> nombreinstitucion;
    public static volatile CollectionAttribute<Listadonecesipaac, Detallenecesipaac> detallenecesipaacCollection;
    public static volatile SingularAttribute<Listadonecesipaac, String> nombresolicitante;
    public static volatile SingularAttribute<Listadonecesipaac, Date> fechaelaboracion;
    public static volatile SingularAttribute<Listadonecesipaac, String> ejerciciofiscal;
    public static volatile SingularAttribute<Listadonecesipaac, Datosinstitucionales> codigoinstitucion;

}