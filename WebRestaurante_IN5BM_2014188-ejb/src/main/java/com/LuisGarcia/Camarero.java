/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LuisGarcia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "camarero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camarero.findAll", query = "SELECT c FROM Camarero c")
    , @NamedQuery(name = "Camarero.findByIdcamarero", query = "SELECT c FROM Camarero c WHERE c.idcamarero = :idcamarero")
    , @NamedQuery(name = "Camarero.findByNombre", query = "SELECT c FROM Camarero c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Camarero.findByApellido", query = "SELECT c FROM Camarero c WHERE c.apellido = :apellido")})
public class Camarero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcamarero")
    private Integer idcamarero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellido")
    private String apellido;
    @OneToMany(mappedBy = "idcamarero")
    private List<Factura> facturaList;

    public Camarero() {
    }

    public Camarero(Integer idcamarero) {
        this.idcamarero = idcamarero;
    }

    public Camarero(Integer idcamarero, String nombre, String apellido) {
        this.idcamarero = idcamarero;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getIdcamarero() {
        return idcamarero;
    }

    public void setIdcamarero(Integer idcamarero) {
        this.idcamarero = idcamarero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @XmlTransient
    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcamarero != null ? idcamarero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camarero)) {
            return false;
        }
        Camarero other = (Camarero) object;
        if ((this.idcamarero == null && other.idcamarero != null) || (this.idcamarero != null && !this.idcamarero.equals(other.idcamarero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.LuisGarcia.Camarero[ idcamarero=" + idcamarero + " ]";
    }
    
}
