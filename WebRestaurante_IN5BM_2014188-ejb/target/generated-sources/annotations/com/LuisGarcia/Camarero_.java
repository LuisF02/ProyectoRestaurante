package com.LuisGarcia;

import com.LuisGarcia.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:22:15")
@StaticMetamodel(Camarero.class)
public class Camarero_ { 

    public static volatile SingularAttribute<Camarero, Integer> idcamarero;
    public static volatile SingularAttribute<Camarero, String> apellido;
    public static volatile ListAttribute<Camarero, Factura> facturaList;
    public static volatile SingularAttribute<Camarero, String> nombre;

}