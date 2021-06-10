/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClass;

/**
 *
 * @author Jose Restrepo G
 */
public class clsEquipo {
    private String cedula;
    private String nombrej;
    private String edad;
    private String posicion;
    private String equipo;

    public clsEquipo() {
    }

    public clsEquipo(String cedula, String nombrej, String edad, String posicion, String equipo) {
        this.cedula = cedula;
        this.nombrej = nombrej;
        this.edad = edad;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombrej
     */
    public String getNombrej() {
        return nombrej;
    }

    /**
     * @param nombre the nombrej to set
     */
    public void setNombrej(String nombrej) {
        this.nombrej = nombrej;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
    
}
