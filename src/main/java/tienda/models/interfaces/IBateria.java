package tienda.models.interfaces;

public interface IBateria {
    
    public String getCapacidad();

    public void setCapacidad(String capacidad);

    public String getTipoCarga();

    public void setTipoCarga(String tipoCarga);

    public String getPotencia();

    public void setPotencia(String potencia);
    
    public String toString();
}
