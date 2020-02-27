/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Vista.Principal;
import DAO.registroDAO;
import Idao.IregistroDAO;
import Model.registro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author castañosinning
 */
public class controller {

    registroDAO CruD = new registroDAO();

    public controller() {
    }
//metodo add

    public void crear(registro registro) {
        IregistroDAO registrar = new registroDAO();
        registrar.crear(registro);
    }
//metodo list

    public void listarRegistro(JTable Datos) {
        List<registro> registro = new ArrayList<registro>();
        IregistroDAO Listar = new registroDAO();
        registro = Listar.listar();
        VerRegistros(registro, Datos);
    }
//metodo update    

    public void actualizar(registro registro) {
        IregistroDAO registrar = new registroDAO();
        registrar.actualizar(registro);
    }

//metodo delete
    public void eliminar(registro registro) {
        IregistroDAO registrar = new registroDAO();
        registrar.eliminar(registro);
    }

    //listar por fecha-----------
    public void listarFechas(JTable Datos, String fecha) {
        List<registro> registroF = new ArrayList<registro>();
        IregistroDAO ListarF = new registroDAO();
        registroF = ListarF.Fecha(fecha);
        fecha(registroF, Datos, fecha);
    }
   //listar por cc
     public void listarCedula(JTable Datos, String cedula) {
        List<registro> registroC = new ArrayList<registro>();
        IregistroDAO ListarC = new registroDAO();
        registroC = ListarC.Cedula(cedula);
         cedula(registroC, Datos, cedula);
    }
   //listar por porfesion
     public void listarprofesion(JTable Datos, String profesion) {
        List<registro> registroC = new ArrayList<registro>();
        IregistroDAO ListarC = new registroDAO();
        registroC = ListarC.Cedula(profesion);
         profesion(registroC, Datos, profesion);
    }

    //methods of the list 
    //list for Date
    public void fecha(List<registro> registros, JTable Datos, String fecha) {
        DefaultTableModel modelo = new DefaultTableModel();
        Datos.setModel(modelo);
        modelo.addColumn("id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre Completo");
        modelo.addColumn("Cedula");
        modelo.addColumn("Edad");
        modelo.addColumn("direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Profesion");
        modelo.addColumn("Estado");
        int num = CruD.Fecha(fecha).size();
        Object[] fila = new Object[9];

        for (int i = 0; i < num; i++) {
            fila[0] = CruD.Fecha(fecha).get(i).getId();
            fila[1] = CruD.Fecha(fecha).get(i).getFecha();
            fila[2] = CruD.Fecha(fecha).get(i).getNombreCompleta();
            fila[3] = CruD.Fecha(fecha).get(i).getCedula();
            fila[4] = CruD.Fecha(fecha).get(i).getEdad();
            fila[5] = CruD.Fecha(fecha).get(i).getDireccion();
            fila[6] = CruD.Fecha(fecha).get(i).getTelefono();
            fila[7] = CruD.Fecha(fecha).get(i).getProfesion();
            fila[8] = CruD.Fecha(fecha).get(i).getEstado();
            modelo.addRow(fila);
        }
            Datos.getColumnModel().getColumn(0).setPreferredWidth(10);
            Datos.getColumnModel().getColumn(1).setPreferredWidth(40);
            Datos.getColumnModel().getColumn(2).setPreferredWidth(160);
            Datos.getColumnModel().getColumn(3).setPreferredWidth(50);
            Datos.getColumnModel().getColumn(4).setPreferredWidth(10);
            Datos.getColumnModel().getColumn(5).setPreferredWidth(80);
            Datos.getColumnModel().getColumn(6).setPreferredWidth(50);
            Datos.getColumnModel().getColumn(7).setPreferredWidth(120);
            Datos.getColumnModel().getColumn(8).setPreferredWidth(60);
    }
    //list for cc
    public void cedula(List<registro> registros, JTable Datos, String cedula) {
        DefaultTableModel modelo = new DefaultTableModel();
        Datos.setModel(modelo);
        modelo.addColumn("id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre Completo");
        modelo.addColumn("Cedula");
        modelo.addColumn("Edad");
        modelo.addColumn("direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Profesion");
        modelo.addColumn("Estado");
        int num = CruD.Cedula(cedula).size();
        Object[] fila = new Object[9];

        for (int i = 0; i < 
                num; i++) {
            fila[0] = CruD.Cedula(cedula).get(i).getId();
            fila[1] = CruD.Cedula(cedula).get(i).getFecha();
            fila[2] = CruD.Cedula(cedula).get(i).getNombreCompleta();
            fila[3] = CruD.Cedula(cedula).get(i).getCedula();
            fila[4] = CruD.Cedula(cedula).get(i).getEdad();
            fila[5] = CruD.Cedula(cedula).get(i).getDireccion();
            fila[6] = CruD.Cedula(cedula).get(i).getTelefono();
            fila[7] = CruD.Cedula(cedula).get(i).getProfesion();
            fila[8] = CruD.Cedula(cedula).get(i).getEstado();
            modelo.addRow(fila);
        }
            Datos.getColumnModel().getColumn(0).setPreferredWidth(10);
            Datos.getColumnModel().getColumn(1).setPreferredWidth(40);
            Datos.getColumnModel().getColumn(2).setPreferredWidth(160);
            Datos.getColumnModel().getColumn(3).setPreferredWidth(50);
            Datos.getColumnModel().getColumn(4).setPreferredWidth(10);
            Datos.getColumnModel().getColumn(5).setPreferredWidth(80);
            Datos.getColumnModel().getColumn(6).setPreferredWidth(50);
            Datos.getColumnModel().getColumn(7).setPreferredWidth(120);
            Datos.getColumnModel().getColumn(8).setPreferredWidth(60);
    }
   //List
    public void profesion(List<registro> registros, JTable Datos, String profesion) {
        DefaultTableModel modelo = new DefaultTableModel();
        Datos.setModel(modelo);
        modelo.addColumn("id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre Completo");
        modelo.addColumn("Cedula");
        modelo.addColumn("Edad");
        modelo.addColumn("direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Profesion");
        modelo.addColumn("Estado");
        int num = CruD.profesion(profesion).size();
        Object[] fila = new Object[9];

        for (int i = 0; i < 
                num; i++) {
            fila[0] = CruD.profesion(profesion).get(i).getId();
            fila[1] = CruD.profesion(profesion).get(i).getFecha();
            fila[2] = CruD.profesion(profesion).get(i).getNombreCompleta();
            fila[3] = CruD.profesion(profesion).get(i).getCedula();
            fila[4] = CruD.profesion(profesion).get(i).getEdad();
            fila[5] = CruD.profesion(profesion).get(i).getDireccion();
            fila[6] = CruD.profesion(profesion).get(i).getTelefono();
            fila[7] = CruD.profesion(profesion).get(i).getProfesion();
            fila[8] = CruD.profesion(profesion).get(i).getEstado();
            modelo.addRow(fila);
        }
            Datos.getColumnModel().getColumn(0).setPreferredWidth(10);
            Datos.getColumnModel().getColumn(1).setPreferredWidth(40);
            Datos.getColumnModel().getColumn(2).setPreferredWidth(160);
            Datos.getColumnModel().getColumn(3).setPreferredWidth(50);
            Datos.getColumnModel().getColumn(4).setPreferredWidth(10);
            Datos.getColumnModel().getColumn(5).setPreferredWidth(80);
            Datos.getColumnModel().getColumn(6).setPreferredWidth(50);
            Datos.getColumnModel().getColumn(7).setPreferredWidth(120);
            Datos.getColumnModel().getColumn(8).setPreferredWidth(60);
    }
    
//todos los regitros
    public void VerRegistros(List<registro> registros, JTable Datos) {
        DefaultTableModel modelo = new DefaultTableModel();
        Datos.setModel(modelo);
        modelo.addColumn("id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre Completo");
        modelo.addColumn("Cedula");
        modelo.addColumn("Edad");
        modelo.addColumn("direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Profesion");
        modelo.addColumn("Estado");
        int num = CruD.listar().size();
        Object[] fila = new Object[9];

        for (int i = 0; i < num; i++) {
            fila[0] = CruD.listar().get(i).getId();
            fila[1] = CruD.listar().get(i).getFecha();
            fila[2] = CruD.listar().get(i).getNombreCompleta();
            fila[3] = CruD.listar().get(i).getCedula();
            fila[4] = CruD.listar().get(i).getEdad();
            fila[5] = CruD.listar().get(i).getDireccion();
            fila[6] = CruD.listar().get(i).getTelefono();
            fila[7] = CruD.listar().get(i).getProfesion();
            fila[8] = CruD.listar().get(i).getEstado();
            modelo.addRow(fila);
        }
            Datos.getColumnModel().getColumn(0).setPreferredWidth(10);
            Datos.getColumnModel().getColumn(1).setPreferredWidth(40);
            Datos.getColumnModel().getColumn(2).setPreferredWidth(160);
            Datos.getColumnModel().getColumn(3).setPreferredWidth(50);
            Datos.getColumnModel().getColumn(4).setPreferredWidth(10);
            Datos.getColumnModel().getColumn(5).setPreferredWidth(80);
            Datos.getColumnModel().getColumn(6).setPreferredWidth(50);
            Datos.getColumnModel().getColumn(7).setPreferredWidth(120);
            Datos.getColumnModel().getColumn(8).setPreferredWidth(60);
    }
}
