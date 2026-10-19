package pa2_u1_cc_ka_deber1.negocio;

public class Entrada {
    private String cliente;
    private String pelicula;
    private double total;
    private String correo;

    public Entrada() {
    }

    public Entrada(String cliente, String pelicula, double total, String correo) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.total = total;
        this.correo = correo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}