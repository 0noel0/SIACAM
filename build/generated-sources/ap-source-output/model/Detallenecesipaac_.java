package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.DetallenecesipaacPK;
import model.Listadonecesipaac;
import model.Unspsc;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-22T09:04:49")
@StaticMetamodel(Detallenecesipaac.class)
public class Detallenecesipaac_ { 

    public static volatile SingularAttribute<Detallenecesipaac, String> fuenterecurso;
    public static volatile SingularAttribute<Detallenecesipaac, Listadonecesipaac> listadonecesipaac;
    public static volatile SingularAttribute<Detallenecesipaac, String> mesesperado;
    public static volatile SingularAttribute<Detallenecesipaac, String> descripcionunspsc;
    public static volatile SingularAttribute<Detallenecesipaac, DetallenecesipaacPK> detallenecesipaacPK;
    public static volatile SingularAttribute<Detallenecesipaac, Integer> cantidadproyectada;
    public static volatile SingularAttribute<Detallenecesipaac, BigDecimal> preciounitario;
    public static volatile SingularAttribute<Detallenecesipaac, Unspsc> codigounspsc;
    public static volatile SingularAttribute<Detallenecesipaac, BigDecimal> preciototal;
    public static volatile SingularAttribute<Detallenecesipaac, String> unidadmedida;

}