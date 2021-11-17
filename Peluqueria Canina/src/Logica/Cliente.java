
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idCliente;
    @Basic
    private String celular;
    private String observacion;
    private String alergico;
    private String atencEspe;
    private String raza;
    private String color;
    private String nomPerro;
    private String nomDueño;
    private String numCliente;
   
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }
    
  
    
    public Cliente() {
    }

    public Cliente(String numCliente, String raza, String color, String nomPerro, String nomDueño, String observacion, String alergico, String atencEspe, String celular) {
        this.numCliente = numCliente;
        this.raza = raza;
        this.color = color;
        this.nomPerro = nomPerro;
        this.nomDueño = nomDueño;
        this.observacion = observacion;
        this.alergico = alergico;
        this.atencEspe = atencEspe;
        this.celular = celular;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNomPerro() {
        return nomPerro;
    }

    public void setNomPerro(String nomPerro) {
        this.nomPerro = nomPerro;
    }

    public String getNomDueño() {
        return nomDueño;
    }

    public void setNomDueño(String nomDueño) {
        this.nomDueño = nomDueño;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencEspe() {
        return atencEspe;
    }

    public void setAtencEspe(String atencEspe) {
        this.atencEspe = atencEspe;
    }
    
}
