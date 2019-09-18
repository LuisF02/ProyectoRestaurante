package com.LuisGarcia;

import com.LuisGarcia.Cocinero;
import com.LuisGarcia.Factura;
import com.LuisGarcia.Plato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:22:15")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Double> precio;
    public static volatile SingularAttribute<Detallefactura, Plato> idplato;
    public static volatile SingularAttribute<Detallefactura, Double> cantidad;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetalle;
    public static volatile SingularAttribute<Detallefactura, Cocinero> idcocinero;
    public static volatile SingularAttribute<Detallefactura, Double> importe;
    public static volatile SingularAttribute<Detallefactura, Factura> idfactura;

}