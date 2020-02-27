package DAO;

import Idao.IregistroDAO;
import Model.registro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public class registroDAO implements IregistroDAO{

    @Override
    public boolean crear(registro registro) {
        boolean add = false;
        Statement sta = null;
        Connection con = null;
        String sql = "INSERT INTO `registro` VALUES (NULL, '"+registro.getFecha()+"', '"+registro.getNombreCompleta()+"', '"+registro.getCedula()+"', '"+registro.getEdad()+"', '"+registro.getDireccion()+"', '"+registro.getTelefono()+"', '"+registro.getProfesion()+"', '"+registro.getEstado()+"')";
        try {
            con = Conexion.Conexion.getConexion();
            sta = con.createStatement();
            sta.execute(sql);
            add = true;
            sta.close();
           
        } catch (SQLException e) {
            System.out.println("Error: Clase registroDAO, método registrar");
            e.printStackTrace();
        }
        return add;
    }

    @Override
    public List<registro> listar() {
        Connection con = null;
        Statement sta = null;
        ResultSet rs=null;
        String sql="SELECT * FROM `registro` ORDER BY ID";
        List<registro> Lista = new ArrayList<registro>();
        try {
            con = Conexion.Conexion.getConexion();
            sta = con.createStatement();
            rs=sta.executeQuery(sql);
            while (rs.next()) {                
                registro r = new registro();
                r.setId(rs.getInt(1));
                r.setFecha(rs.getString(2));
                r.setNombreCompleta(rs.getString(3));
                r.setCedula(rs.getString(4));
                r.setEdad(rs.getInt(5));
                r.setDireccion(rs.getString(6));
                r.setTelefono(rs.getString(7));
                r.setProfesion(rs.getString(8));
                r.setEstado(rs.getString(9));
                Lista.add(r);
            }
            sta.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase registroDAO, método listar");
            e.printStackTrace();
        }
        return Lista;
    }

    @Override
    public boolean actualizar(registro registro) {
        boolean update = false;
        Statement sta = null;
        Connection con = null;
        String sql = "UPDATE `registro` SET nombre_completo='"+registro.getNombreCompleta()+"', cedula='"+registro.getCedula()+"', edad='"+registro.getEdad()+"', direccion='"+registro.getDireccion()+"', telefono='"+registro.getTelefono()+"', profesion='"+registro.getProfesion()+"', estado='"+registro.getEstado()+"'  WHERE id="+registro.getId();
        try {
            con = Conexion.Conexion.getConexion();
            sta = con.createStatement();
            sta.execute(sql);
            update = true;
            sta.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase registroDAO, método actualizar");
            e.printStackTrace();
        }
        return update;
    }

    @Override
    public boolean eliminar(registro registro) {
        boolean del = false;
        Statement sta = null;
        Connection con = null;
        String sql = "DELETE FROM `registro` WHERE id="+registro.getId();
        try {
            con = Conexion.Conexion.getConexion();
            sta = con.createStatement();
            sta.execute(sql);
            del = true;
            sta.close();
            
        } catch (SQLException e) {
            System.out.println("Error: Clase registroDAO, método eliminar");
            e.printStackTrace();
        }
        return del;
    }

    @Override
    public List<registro> Fecha(String fecha) {
         Connection con = null;
        Statement sta = null;
        ResultSet rs=null;
        String sql="SELECT * FROM `registro` WHERE fecha='"+fecha+"'";
        List<registro> ListaFecha = new ArrayList<registro>();
        try {
            con = Conexion.Conexion.getConexion();
            sta = con.createStatement();
            rs=sta.executeQuery(sql);
            while (rs.next()) {                
                registro r = new registro();
                r.setId(rs.getInt(1));
                r.setFecha(rs.getString(2));
                r.setNombreCompleta(rs.getString(3));
                r.setCedula(rs.getString(4));
                r.setEdad(rs.getInt(5));
                r.setDireccion(rs.getString(6));
                r.setTelefono(rs.getString(7));
                r.setProfesion(rs.getString(8));
                r.setEstado(rs.getString(9));
                ListaFecha.add(r);
            }
            sta.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase registroDAO, método listar");
            e.printStackTrace();
        }
        return ListaFecha;
    }

    @Override
    public List<registro> Cedula(String cedula) {
           Connection con = null;
        Statement sta = null;
        ResultSet rs=null;
        String sql="SELECT * FROM `registro` WHERE cedula='"+cedula+"'";
        List<registro> ListaCedula = new ArrayList<registro>();
        try {
            con = Conexion.Conexion.getConexion();
            sta = con.createStatement();
            rs=sta.executeQuery(sql);
            while (rs.next()) {                
                registro r = new registro();
                r.setId(rs.getInt(1));
                r.setFecha(rs.getString(2));
                r.setNombreCompleta(rs.getString(3));
                r.setCedula(rs.getString(4));
                r.setEdad(rs.getInt(5));
                r.setDireccion(rs.getString(6));
                r.setTelefono(rs.getString(7));
                r.setProfesion(rs.getString(8));
                r.setEstado(rs.getString(9));
                ListaCedula.add(r);
            }
            sta.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase registroDAO, método listar");
            e.printStackTrace();
        }
        return ListaCedula;
    }

    @Override
    public List<registro> profesion(String profesion) {
                Connection con = null;
        Statement sta = null;
        ResultSet rs=null;
        String sql="SELECT * FROM `registro` WHERE profesion='"+profesion+"'";
        List<registro> ListaProfesion = new ArrayList<registro>();
        try {
            con = Conexion.Conexion.getConexion();
            sta = con.createStatement();
            rs=sta.executeQuery(sql);
            while (rs.next()) {                
                registro r = new registro();
                r.setId(rs.getInt(1));
                r.setFecha(rs.getString(2));
                r.setNombreCompleta(rs.getString(3));
                r.setCedula(rs.getString(4));
                r.setEdad(rs.getInt(5));
                r.setDireccion(rs.getString(6));
                r.setTelefono(rs.getString(7));
                r.setProfesion(rs.getString(8));
                r.setEstado(rs.getString(9));
                ListaProfesion.add(r);
            }
            sta.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase registroDAO, método listar");
            e.printStackTrace();
        }
        return ListaProfesion;
    }
    
    
}
