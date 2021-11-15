package tienda.models;

import tienda.models.interfaces.ICategoria;

public abstract class Familia {
    
    protected ICategoria categoria;

    public Familia(ICategoria categoria) {
        this.categoria = categoria;
    }
    
    public abstract String getNombre();
    
    public abstract String getEspecificaciones();
}
