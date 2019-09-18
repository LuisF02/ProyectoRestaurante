package com.LuisGarcia;

import com.LuisGarcia.Camarero;
import com.LuisGarcia.Cliente;
import com.LuisGarcia.Detallefactura;
import com.LuisGarcia.Mesa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:22:15")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Mesa> idmesa;
    public static volatile SingularAttribute<Factura, Camarero> idcamarero;
    public static volatile ListAttribute<Factura, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Factura, Date> fechaFactura;
    public static volatile SingularAttribute<Factura, Cliente> idcliente;
    public static volatile SingularAttribute<Factura, Integer> idfactura;

}