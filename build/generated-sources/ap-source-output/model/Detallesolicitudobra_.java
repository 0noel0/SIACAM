package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Solicitudobra;
import model.Unspsc;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-11-11T22:20:10")
@StaticMetamodel(Detallesolicitudobra.class)
public class Detallesolicitudobra_ { 

    public static volatile SingularAttribute<Detallesolicitudobra, String> obrasolicitada;
    public static volatile SingularAttribute<Detallesolicitudobra, Solicitudobra> idSolicitud;
    public static volatile SingularAttribute<Detallesolicitudobra, Integer> idDetalle;
    public static volatile SingularAttribute<Detallesolicitudobra, Integer> cantidad;
    public static volatile SingularAttribute<Detallesolicitudobra, String> especifictecnicas;
    public static volatile SingularAttribute<Detallesolicitudobra, Unspsc> codigounspsc;
    public static volatile SingularAttribute<Detallesolicitudobra, String> unidadmedida;

}