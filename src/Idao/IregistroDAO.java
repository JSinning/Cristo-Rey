/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

import Model.registro;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public interface IregistroDAO {
    public boolean crear(registro registro);
    public List<registro> listar();
    public boolean actualizar(registro registro);
    public boolean eliminar(registro registro);
    //-----quiery para busacar por fecha, cedula y profesion
    public List<registro> Fecha(String fecha);
    public List<registro> Cedula(String cedula);
    public List<registro> profesion(String profesion);
    
}
