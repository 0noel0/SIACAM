package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.AdendaPK;
import model.Expedienteproceso;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-11-11T05:43:15")
@StaticMetamodel(Adenda.class)
public class Adenda_ { 

    public static volatile SingularAttribute<Adenda, String> operacion;
    public static volatile SingularAttribute<Adenda, String> textobases;
    public static volatile SingularAttribute<Adenda, Expedienteproceso> expedienteproceso;
    public static volatile SingularAttribute<Adenda, AdendaPK> adendaPK;

}