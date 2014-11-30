package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Detallenecesipaac;
import model.Detallepaac;
import model.Detallesolicitudobra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-22T09:04:49")
@StaticMetamodel(Unspsc.class)
public class Unspsc_ { 

    public static volatile SingularAttribute<Unspsc, String> descripcion;
    public static volatile SingularAttribute<Unspsc, String> codigo;
    public static volatile CollectionAttribute<Unspsc, Detallesolicitudobra> detallesolicitudobraCollection;
    public static volatile CollectionAttribute<Unspsc, Detallepaac> detallepaacCollection;
    public static volatile CollectionAttribute<Unspsc, Detallenecesipaac> detallenecesipaacCollection;

}