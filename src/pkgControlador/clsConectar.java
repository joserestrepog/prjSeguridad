/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgControlador;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jose Restrepo G
 */
public class clsConectar {
    java.sql.Connection con;
    java.sql.Statement st;
    java.sql.ResultSet res;

    public clsConectar() {
        try{
            try{
                Class.forName("org.postgresql.Driver");
                System.out.println("Se cargó el Driver.");
            }catch(ClassNotFoundException ex){
                System.out.println("No se cargó el Driver.");
            }
            
            con = DriverManager.getConnection("jdbc:postgresql://192.168.1.71:5432/seguridad","postgres","postgres");
        }catch(SQLException ex){
            System.out.println("No se pudo conectar con el Motor."+ex.toString());
        }
    }
    
    public boolean validar(String sql){
        java.sql.ResultSet hoja_resultado = null;
        try{
            st = con.createStatement();
            hoja_resultado = st.executeQuery(sql);
            if(hoja_resultado.next()){
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println("Error consultando: "+ex.toString());
            return false;
        }
    }
    
    public boolean procesarSQL(String SQL){
        try { 
            st=con.createStatement();
            return st.execute(SQL);            
        } catch (SQLException ex) {
            System.out.println("Problema con el SQL "+ex.toString());
            return false;
        }
    }
    
    public java.sql.ResultSet consultarSQL(String SQL){
        try { 
            st=con.createStatement();
            return st.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println("Problema con el SQL "+ex.toString());
            return null;
        }
    }
}
