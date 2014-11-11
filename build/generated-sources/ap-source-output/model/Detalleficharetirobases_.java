package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.DetalleficharetirobasesPK;
import model.Expedienteproceso;
import model.Oferente;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-11-11T05:43:15")
@StaticMetamodel(Detalleficharetirobases.class)
public class Detalleficharetirobases_ { 

    public static volatile SingularAttribute<Detalleficharetirobases, Oferente> nombreoferente;
    public static volatile SingularAttribute<Detalleficharetirobases, Expedienteproceso> expedienteproceso;
    public static volatile SingularAttribute<Detalleficharetirobases, Date> horaretirobases;
    public static volatile SingularAttribute<Detalleficharetirobases, String> nombrecomisionado;
    public static volatile SingularAttribute<Detalleficharetirobases, String> documentoidcomisionado;
    public static volatile SingularAttribute<Detalleficharetirobases, String> lugarparanotificaciones;
    public static volatile SingularAttribute<Detalleficharetirobases, DetalleficharetirobasesPK> detalleficharetirobasesPK;
    public static volatile SingularAttribute<Detalleficharetirobases, Date> fecharetirobases;

}