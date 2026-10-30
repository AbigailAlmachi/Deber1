package uce.edu.ka.taller.PrestamodeLibros;

public class Devolucion {

    private String usuario;
    private String libro;
    private double dias;
    private String correo;
    private String telefono;

    public Devolucion() {

    }

    public Devolucion(String usuario, String libro, double dias, String correo, String telefono) {
        this.usuario = usuario;
        this.libro = libro;
        this.dias = dias;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}