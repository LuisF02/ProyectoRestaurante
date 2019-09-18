/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LuisGarcia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "detallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefactura.findAll", query = "SELECT d FROM Detallefactura d")
    , @NamedQuery(name = "Detallefactura.findByIddetalle", query = "SELECT d FROM Detallefactura d WHERE d.iddetalle = :iddetalle")
    , @NamedQuery(name = "Detallefactura.findByCantidad", query = "SELECT d FROM Detallefactura d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallefactura.findByPrecio", query = "SELECT d FROM Detallefactura d WHERE d.precio = :precio")
    , @NamedQuery(name = "Detallefactura.findByImporte", query = "SELECT d FROM Detallefactura d WHERE d.importe = :importe")})
public class Detallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalle")
    private Integer iddetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private double cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "importe")
    private double importe;
    @JoinColumn(name = "idcocinero", referencedColumnName = "idcocinero")
    @ManyToOne
    private Cocinero idcocinero;
    @JoinColumn(name = "idfactura", referencedColumnName = "idfactura")
    @ManyToOne
    private Factura idfactura;
    @JoinColumn(name = "idplato", referencedColumnName = "idplato")
    @ManyToOne
    private Plato idplato;

    public Detallefactura() {
    }

    public Detallefactura(Integer iddetalle) {
        this.iddetalle = iddetalle;
    }

    public Detallefactura(Integer iddetalle, double cantidad, double precio, double importe) {
        this.iddetalle = iddetalle;
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
    }

    public Integer getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(Integer iddetalle) {
        this.iddetalle = iddetalle;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Cocinero getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Cocinero idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Factura getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Factura idfactura) {
        this.idfactura = idfactura;
    }

    public Plato getIdplato() {
        return idplato;
    }

    public void setIdplato(Plato idplato) {
        this.idplato = idplato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalle != null ? iddetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.iddetalle == null && other.iddetalle != null) || (this.iddetalle != null && !this.iddetalle.equals(other.iddetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.LuisGarcia.Detallefactura[ iddetalle=" + iddetalle + " ]";
    }
    
}
