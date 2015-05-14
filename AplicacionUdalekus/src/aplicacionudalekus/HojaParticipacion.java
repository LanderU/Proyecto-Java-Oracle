/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionudalekus;

/**
 *
 * @author lander
 */
public class HojaParticipacion {
    
    private String provincia;
    private String municipio;
    private int cp;
    private String calle;
    private int numero;
    private int piso;
    private char letra;
    
    //Necesitamos de la clase Menor y de la clase Tutor
    
    private Menor men = null;
    private Tutor tut = null;
    
    //Referencia simple a la Solicitud
    
    private Solicitud sol =null;

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
     * @return the cp
     */
    public int getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(int cp) {
        this.cp = cp;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

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
     * @return the piso
     */
    public int getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(int piso) {
        this.piso = piso;
    }

    /**
     * @return the letra
     */
    public char getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

    /**
     * @return the men
     */
    public Menor getMen() {
        return men;
    }

    /**
     * @param men the men to set
     */
    public void setMen(Menor men) {
        this.men = men;
    }

    /**
     * @return the tut
     */
    public Tutor getTut() {
        return tut;
    }

    /**
     * @param tut the tut to set
     */
    public void setTut(Tutor tut) {
        this.tut = tut;
    }
    
    
    
    
}//class
