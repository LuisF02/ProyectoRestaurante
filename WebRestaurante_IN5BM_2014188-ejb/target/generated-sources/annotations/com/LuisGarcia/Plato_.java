package com.LuisGarcia;

import com.LuisGarcia.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:22:15")
@StaticMetamodel(Plato.class)
public class Plato_ { 

    public static volatile SingularAttribute<Plato, String> descripcion;
    public static volatile SingularAttribute<Plato, Double> precio;
    public static volatile ListAttribute<Plato, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Plato, Integer> idplato;

}