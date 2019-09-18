package com.LuisGarcia;

import com.LuisGarcia.Areas;
import com.LuisGarcia.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:22:15")
@StaticMetamodel(Mesa.class)
public class Mesa_ { 

    public static volatile SingularAttribute<Mesa, Integer> idmesa;
    public static volatile SingularAttribute<Mesa, String> ubicacion;
    public static volatile SingularAttribute<Mesa, String> numeromaximodeconmensales;
    public static volatile SingularAttribute<Mesa, Areas> idAreas;
    public static volatile ListAttribute<Mesa, Factura> facturaList;

}