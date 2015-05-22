/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionudalekus;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.internal.OracleTypes;

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

    public void sortear() throws SQLException {
            Connection conn = null;
            CallableStatement consulta = null;
        try {
            //Conexión a la BD
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conn = DriverManager.getConnection("jdbc:oracle:thin:@172.20.224.100:1521:ORCL", "lander", "si2");
            String sql = "{ call paquete_udalekus.mostrarfechasorteo (?)}";

            consulta = conn.prepareCall(sql);

            consulta.registerOutParameter(1, OracleTypes.VARCHAR);
            
            consulta.execute();
            //System.out.println(consulta.getString("fechasorteo"));
            
            //JOptionPane.showMessageDialog(this,consulta.getString("fechasorteo"));
         } catch (SQLException ex) {
            Logger.getLogger(VentanaInicial.class.getName()).log(Level.SEVERE, null, ex);
           // JOptionPane.showMessageDialog(this, "Error: Imposible conectarse a la BD.");
          
        } finally {

            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaInicial.class.getName()).log(Level.SEVERE, null, ex);
               // JOptionPane.showMessageDialog(this, "Error: Imposible cerrar la conexión.");
            }

        }
        
        
        
        
        if (consulta.getString("fechasorteo").equalsIgnoreCase("20/04/2015")) {
            Random numeroInicial = new Random();

            int numero = numeroInicial.nextInt(999) + 1;

       //Cadendia
            Random cadencia = new Random();
            int cad = cadencia.nextInt(6) + 3;

        }

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
