package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.AdendaPK;
import model.Expedienteproceso;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-22T09:04:49")
@StaticMetamodel(Adenda.class)
public class Adenda_ { 

    public static volatile SingularAttribute<Adenda, AdendaPK> adendaPK;
    public static volatile SingularAttribute<Adenda, String> textobases;
    public static volatile SingularAttribute<Adenda, Expedienteproceso> expedienteproceso;
    public static volatile SingularAttribute<Adenda, String> operacion;

}