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
public class clsDAOLogin extends clsLogin{
    pkgControlador.clsConectar objConectar;

    public clsDAOLogin() {
        objConectar = new pkgControlador.clsConectar();
    }
    
    public boolean valide(){
        String SQL ="SELECT * FROM administrador.tbl_login WHERE correoe='"+super.getCorreoe()+"' and clave='"+super.getClave()+"'";
        if(objConectar.validar(SQL) == false){
            return false;
        }else{
            return true;
        }
    }
}
