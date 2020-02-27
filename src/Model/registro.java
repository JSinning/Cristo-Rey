package Model;

/**
 *
 * @author castañosinning
 */
public class registro {
    //attributes
    private int id;
    private String fecha;
    private String nombreCompleta;
    private String cedula;
    private int edad;   
    private String direccion;
    private String telefono;
    private String profesion;
    private String estado;
    
    public registro(){
        
    }
   //builder
    public registro(String fecha, String nombreCompleta, String cedula, int edad, String direccion, String telefono, String profesion, String estado) {
        this.fecha = fecha;
        this.nombreCompleta = nombreCompleta;
        this.cedula = cedula;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
        this.estado = estado;
    }
//methods Set
    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNombreCompleta(String nombreCompleta) {
        this.nombreCompleta = nombreCompleta;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
//methods Get

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreCompleta() {
        return nombreCompleta;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getEstado() {
        return estado;
    }
    
    //method toString 
    @Override
    public String toString(){
      return this.id +","+this.fecha+", "+ this.nombreCompleta+", "+this.cedula+", "+this.edad+", "+ this.direccion+", "+this.telefono+", "+this.profesion+", "+this.estado;
        
    }

   
    
}

