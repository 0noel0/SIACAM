package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Solicitudobra;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-07T16:56:43")
@StaticMetamodel(UnidadSolicitante.class)
public class UnidadSolicitante_ { 

    public static volatile SingularAttribute<UnidadSolicitante, String> nombreUnidad;
    public static volatile SingularAttribute<UnidadSolicitante, Short> idUs;
    public static volatile CollectionAttribute<UnidadSolicitante, Solicitudobra> solicitudobraCollection;

}