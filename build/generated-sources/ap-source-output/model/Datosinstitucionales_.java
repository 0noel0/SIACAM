package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Listadonecesipaac;
import model.Ordencompra;
import model.Paac;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-07T16:56:43")
@StaticMetamodel(Datosinstitucionales.class)
public class Datosinstitucionales_ { 

    public static volatile CollectionAttribute<Datosinstitucionales, Listadonecesipaac> listadonecesipaacCollection;
    public static volatile SingularAttribute<Datosinstitucionales, String> codigoinstitucion;
    public static volatile SingularAttribute<Datosinstitucionales, String> direccioninstitucion;
    public static volatile CollectionAttribute<Datosinstitucionales, Paac> paacCollection;
    public static volatile CollectionAttribute<Datosinstitucionales, Ordencompra> ordencompraCollection;
    public static volatile SingularAttribute<Datosinstitucionales, String> nombreinstitucion;

}