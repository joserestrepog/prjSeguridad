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
public class clsPersona {
    private String ced;
    private String nombre;

    public clsPersona() {
    }

    public clsPersona(String ced, String nombre) {
        this.ced = ced;
        this.nombre = nombre;
    }

    /**
     * @return the ced
     */
    public String getCed() {
        return ced;
    }

    /**
     * @param ced the ced to set
     */
    public void setCed(String ced) {
        this.ced = ced;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
