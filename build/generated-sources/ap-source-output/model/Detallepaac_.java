package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.DetallepaacPK;
import model.Paac;
import model.Unspsc;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-07T16:56:43")
@StaticMetamodel(Detallepaac.class)
public class Detallepaac_ { 

    public static volatile SingularAttribute<Detallepaac, String> fuenterecurso;
    public static volatile SingularAttribute<Detallepaac, String> mesestimado;
    public static volatile SingularAttribute<Detallepaac, String> descripcionunspsc;
    public static volatile SingularAttribute<Detallepaac, String> codigoobjetopres;
    public static volatile SingularAttribute<Detallepaac, Unspsc> codigounspsc;
    public static volatile SingularAttribute<Detallepaac, String> formacontratacion;
    public static volatile SingularAttribute<Detallepaac, Paac> paac;
    public static volatile SingularAttribute<Detallepaac, String> nombreprelimproceso;
    public static volatile SingularAttribute<Detallepaac, DetallepaacPK> detallepaacPK;
    public static volatile SingularAttribute<Detallepaac, BigDecimal> montopresupuestado;

}