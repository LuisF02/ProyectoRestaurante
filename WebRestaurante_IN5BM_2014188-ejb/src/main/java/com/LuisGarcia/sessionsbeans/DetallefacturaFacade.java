/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LuisGarcia.sessionsbeans;

import com.LuisGarcia.Detallefactura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class DetallefacturaFacade extends AbstractFacade<Detallefactura> implements DetallefacturaFacadeLocal {

    @PersistenceContext(unitName = "WebRestaurante_IN5BM_2014188")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallefacturaFacade() {
        super(Detallefactura.class);
    }
    
}
