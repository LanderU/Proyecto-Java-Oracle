/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionudalekus;

import java.util.Date;

/**
 *
 * @author lander
 */
public class Menor extends Persona {
   //Clase Menor hereda de Persona
    
    private String centro;
    private char modelo;
    private Date fecha_nac;
    private boolean discapacidad;
    private String provincia;
    private String municipio;
    private String Calle;
    /**
     * @return the centro
     */
    public String getCentro() {
        return centro;
    }

    /**
     * @param centro the centro to set
     */
    public void setCentro(String centro) {
        this.centro = centro;
    }

    /**
     * @return the modelo
     */
    public char getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(char modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the fecha_nac
     */
    public Date getFecha_nac() {
        return fecha_nac;
    }

    /**
     * @param fecha_nac the fecha_nac to set
     */
    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    /**
     * @return the discapacidad
     */
    public boolean isDiscapacidad() {
        return discapacidad;
    }

    /**
     * @param discapacidad the discapacidad to set
     */
    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the Calle
     */
    public String getCalle() {
        return Calle;
    }

    /**
     * @param Calle the Calle to set
     */
    public void setCalle(String Calle) {
        this.Calle = Calle;
    }
    
    
}//class
