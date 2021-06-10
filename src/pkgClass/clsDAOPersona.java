/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClass;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pkgControlador.clsConectar;

/**
 *
 * @author Jose Restrepo G
 */
public class clsDAOPersona extends clsPersona {
    
   pkgControlador.clsConectar con;
   
   public clsDAOPersona() {
        con = new clsConectar();
    }
   
   public boolean insertar() {
        String SQL = "INSERT INTO administrador.tbl_persona(ced, nombre) VALUES ('" + super.getCed()+ "','" + super.getNombre() + "')";
        return con.procesarSQL(SQL);
    }

    public void borrar() {
        String SQL = "DELETE FROM administrador.tbl_persona WHERE ced='" + super.getCed()+ "'";
        con.procesarSQL(SQL);
    }

    public boolean modificar(){
        String SQL = "UPDATE administrador.tbl_persona SET nombre='" + super.getNombre() + "' WHERE ced='" + super.getCed()+ "'";
        return con.procesarSQL(SQL);
    }

    public String consultar() {
        String SQL = "SELECT ced, nombre FROM administrador.tbl_persona WHERE ced='" + super.getCed()+ "'";
        java.sql.ResultSet hr = null;
        hr = con.consultarSQL(SQL);
        try {
            if (hr.next()) {
                return hr.getString(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsDAOPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "no";
    }

    public javax.swing.table.DefaultTableModel listar(JTable tbl) {
        javax.swing.table.DefaultTableModel modelo;
        modelo = new DefaultTableModel(new Object[]{tbl.getColumnName(0), tbl.getColumnName(1)}, 0);

        String SQL = "SELECT ced, nombre FROM administrador.tbl_persona";
        java.sql.ResultSet res = null;

        res = con.consultarSQL(SQL);

        try {
            while (res.next()) {
                modelo.addRow(new Object[]{res.getString(1), res.getString(2)});
            }
        } catch (SQLException ex) {
            System.out.println("Error consultando para listar.");
        }
        return modelo;
    }
    
    public javax.swing.DefaultComboBoxModel listarCombo() {
        javax.swing.DefaultComboBoxModel modelo;
        modelo = new javax.swing.DefaultComboBoxModel();

        String SQL = "SELECT ced, nombre FROM administrador.tbl_persona";
        java.sql.ResultSet res = null;

        res = con.consultarSQL(SQL);

        try {
            while (res.next()) {
                modelo.addElement(res.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("Error consultando para listar en combo.");
        }
        return modelo;
    }
       
}
