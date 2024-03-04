package co.edu.uniquindio.poo;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String numeroID;
    private String correo;
    private String telefono;
    private int edad;

    public Estudiante(String nombre, String apellido, String numeroID, String correo, String telefono, int edad) {

        assert nombre != null && !nombre.isBlank():"El nombre debe ser diferente de null";
        assert apellido != null && !apellido.isBlank():"El apellido debe ser diferente de null";
        assert numeroID != null && !numeroID.isBlank():"El numero de identificación debe ser diferente de null";
        assert correo != null && correo.contains("@"):"El correo electronico debe contener el simbolo @";
        assert telefono != null : "El telefono no puede ser nulo";
        assert edad > 0 :"La edad debe ser mayor a cero";

        this.nombre = nombre;
        this.numeroID = numeroID;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;

    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return 
                "nombres:" + nombre + 
                ", apellidos: " + apellido +  
                ", numero Identificación: " + numeroID +
                ", correo: " + correo +
                ", telefono: " + telefono +
                ", edad:" + edad ;
    }
}