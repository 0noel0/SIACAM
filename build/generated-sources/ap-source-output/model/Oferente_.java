package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Detalleficharetirobases;
import model.Expedienteproceso;
import model.Oferta;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-07T16:56:43")
@StaticMetamodel(Oferente.class)
public class Oferente_ { 

    public static volatile SingularAttribute<Oferente, String> estadooferente;
    public static volatile SingularAttribute<Oferente, String> nombreoferente;
    public static volatile SingularAttribute<Oferente, String> telefonooferente;
    public static volatile SingularAttribute<Oferente, String> calificacion;
    public static volatile CollectionAttribute<Oferente, Expedienteproceso> expedienteprocesoCollection;
    public static volatile SingularAttribute<Oferente, String> emailoferente;
    public static volatile SingularAttribute<Oferente, String> faxoferente;
    public static volatile SingularAttribute<Oferente, String> tiposervicio;
    public static volatile CollectionAttribute<Oferente, Detalleficharetirobases> detalleficharetirobasesCollection;
    public static volatile CollectionAttribute<Oferente, Oferta> ofertaCollection;

}