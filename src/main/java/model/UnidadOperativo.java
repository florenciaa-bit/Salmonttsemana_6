package model;

public class UnidadOperativo {
    private String nombre;
    private String comuna;

    public UnidadOperativo(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "UnidadOperativa{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
