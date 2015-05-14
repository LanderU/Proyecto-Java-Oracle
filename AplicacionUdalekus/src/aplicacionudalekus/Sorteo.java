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
public class Sorteo {

    private Date anyo;
    private int numero_inicial;
    private int cadencia;
    private Date fecha_comienzo_inscripcion;

    // Creamos un linkedList para guardar las solicitudes.
    private List<Solicitud> solicitudes = new LinkedList<>();

    /**
     * @return the anyo
     */
    public Date getAnyo() {
        return anyo;
    }

    /**
     * @param anyo the anyo to set
     */
    public void setAnyo(Date anyo) {
        this.anyo = anyo;
    }

    /**
     * @return the numero_inicial
     */
    public int getNumero_inicial() {
        return numero_inicial;
    }

    /**
     * @param numero_inicial the numero_inicial to set
     */
    public void setNumero_inicial(int numero_inicial) {
        this.numero_inicial = numero_inicial;
    }

    /**
     * @return the cadencia
     */
    public int getCadencia() {
        return cadencia;
    }

    /**
     * @param cadencia the cadencia to set
     */
    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }

    /**
     * @return the fecha_comienzo_inscripcion
     */
    public Date getFecha_comienzo_inscripcion() {
        return fecha_comienzo_inscripcion;
    }

    /**
     * @param fecha_comienzo_inscripcion the fecha_comienzo_inscripcion to set
     */
    public void setFecha_comienzo_inscripcion(Date fecha_comienzo_inscripcion) {
        this.fecha_comienzo_inscripcion = fecha_comienzo_inscripcion;
    }

    //Métodos de calculo
    public void calcular_orden() {

    }//calcular_orden

    public void sortear() {

    }//sortear

    public void listado() {

    }//listado

    /**
     * @return the solicitudes
     */
    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

}//main
