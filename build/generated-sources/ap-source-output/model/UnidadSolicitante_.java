package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Solicitudobra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-22T09:04:49")
@StaticMetamodel(UnidadSolicitante.class)
public class UnidadSolicitante_ { 

    public static volatile SingularAttribute<UnidadSolicitante, Short> idUs;
    public static volatile CollectionAttribute<UnidadSolicitante, Solicitudobra> solicitudobraCollection;
    public static volatile SingularAttribute<UnidadSolicitante, String> nombreUnidad;

}