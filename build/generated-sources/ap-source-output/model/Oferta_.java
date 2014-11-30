package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Detalleoferta;
import model.Expedienteproceso;
import model.Oferente;
import model.OfertaPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-22T09:04:49")
@StaticMetamodel(Oferta.class)
public class Oferta_ { 

    public static volatile SingularAttribute<Oferta, Oferente> oferente;
    public static volatile SingularAttribute<Oferta, OfertaPK> ofertaPK;
    public static volatile SingularAttribute<Oferta, BigDecimal> montooferta;
    public static volatile SingularAttribute<Oferta, Expedienteproceso> expedienteproceso;
    public static volatile CollectionAttribute<Oferta, Detalleoferta> detalleofertaCollection;
    public static volatile SingularAttribute<Oferta, String> estadooferta;

}