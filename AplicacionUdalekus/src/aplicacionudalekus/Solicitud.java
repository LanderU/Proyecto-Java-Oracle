/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionudalekus;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lander
 */
public class Solicitud {

    private int numero;
    private Date fecha;
    private int numero_orden;
    private Date fecha_cita;
    private Date hora_cita;

    //Referencia al Sorteo
    private Sorteo sort = null;
    
    //Referencia a las HojasParticipacion
    
    private List <HojaParticipacion> hojasPart = new LinkedList<>();

    /**
     * @return the numero
     */

    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the numero_orden
     */
    public int getNumero_orden() {
        return numero_orden;
    }

    /**
     * @param numero_orden the numero_orden to set
     */
    public void setNumero_orden(int numero_orden) {
        this.numero_orden = numero_orden;
    }

    /**
     * @return the fecha_cita
     */
    public Date getFecha_cita() {
        return fecha_cita;
    }

    /**
     * @param fecha_cita the fecha_cita to set
     */
    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    /**
     * @return the hora_cita
     */
    public Date getHora_cita() {
        return hora_cita;
    }

    /**
     * @param hora_cita the hora_cita to set
     */
    public void setHora_cita(Date hora_cita) {
        this.hora_cita = hora_cita;
    }

    /**
     * @return the hojasPart
     */
    public List <HojaParticipacion> getHojasPart() {
        return hojasPart;
    }

}//main
