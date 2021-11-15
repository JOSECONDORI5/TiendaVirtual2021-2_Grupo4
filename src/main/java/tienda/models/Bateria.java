
package tienda.models;

public class Bateria {
    private String capacidad;
    private String tipoCarga;
    private String potencia;

    public Bateria() {
    }

    public Bateria(String capacidad, String tipoCarga, String potencia) {
        this.capacidad = capacidad;
        this.tipoCarga = tipoCarga;
        this.potencia = potencia;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Bateria{" + "capacidad=" + capacidad + ", tipoCarga=" + tipoCarga + ", potencia=" + potencia + '}';
    }
    
    
}
