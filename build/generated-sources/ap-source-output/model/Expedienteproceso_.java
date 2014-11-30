package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Adenda;
import model.Detalleficharetirobases;
import model.Oferente;
import model.Oferta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-22T09:04:49")
@StaticMetamodel(Expedienteproceso.class)
public class Expedienteproceso_ { 

    public static volatile SingularAttribute<Expedienteproceso, String> denominacionproceso;
    public static volatile SingularAttribute<Expedienteproceso, String> responsableproceso;
    public static volatile CollectionAttribute<Expedienteproceso, Detalleficharetirobases> detalleficharetirobasesCollection;
    public static volatile SingularAttribute<Expedienteproceso, String> tipoproceso;
    public static volatile SingularAttribute<Expedienteproceso, String> estadoproceso;
    public static volatile SingularAttribute<Expedienteproceso, Oferente> nombreadjudicatario;
    public static volatile CollectionAttribute<Expedienteproceso, Oferta> ofertaCollection;
    public static volatile CollectionAttribute<Expedienteproceso, Adenda> adendaCollection;
    public static volatile SingularAttribute<Expedienteproceso, String> codigoproceso;

}