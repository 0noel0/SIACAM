package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.DetalleofertaPK;
import model.Oferta;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-07T16:56:43")
@StaticMetamodel(Detalleoferta.class)
public class Detalleoferta_ { 

    public static volatile SingularAttribute<Detalleoferta, BigDecimal> total;
    public static volatile SingularAttribute<Detalleoferta, BigDecimal> preciounitario;
    public static volatile SingularAttribute<Detalleoferta, BigDecimal> montogarantia;
    public static volatile SingularAttribute<Detalleoferta, Oferta> oferta;
    public static volatile SingularAttribute<Detalleoferta, String> marcaofertada;
    public static volatile SingularAttribute<Detalleoferta, DetalleofertaPK> detalleofertaPK;

}