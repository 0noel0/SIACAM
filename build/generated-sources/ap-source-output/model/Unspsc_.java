package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Detallenecesipaac;
import model.Detallepaac;
import model.Detallesolicitudobra;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-11-11T22:20:10")
@StaticMetamodel(Unspsc.class)
public class Unspsc_ { 

    public static volatile SingularAttribute<Unspsc, String> codigo;
    public static volatile CollectionAttribute<Unspsc, Detallepaac> detallepaacCollection;
    public static volatile SingularAttribute<Unspsc, String> descripcion;
    public static volatile CollectionAttribute<Unspsc, Detallesolicitudobra> detallesolicitudobraCollection;
    public static volatile CollectionAttribute<Unspsc, Detallenecesipaac> detallenecesipaacCollection;

}