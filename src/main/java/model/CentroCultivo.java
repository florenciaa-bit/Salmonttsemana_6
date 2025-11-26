package model;

public class CentroCultivo extends UnidadOperativo{
    private int toneladasProduccion;

    public CentroCultivo(String nombre, String comuna, int toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    public int getToneladasProduccion() {
        return toneladasProduccion;
    }

    public void setToneladasProduccion(int toneladasProduccion) {
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + getNombre() + '\'' +
                ", comuna='" + getComuna() + '\'' +
                ", toneladasProduccion=" + toneladasProduccion +
                '}';
    }
}
