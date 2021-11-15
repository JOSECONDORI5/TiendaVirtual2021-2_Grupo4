package tienda.models.impl;

import tienda.models.*;
import tienda.models.interfaces.IBateria;
import tienda.models.interfaces.ICamara;
import tienda.models.interfaces.IProductoFactory;

public class GamaAltaFactory implements IProductoFactory {

    @Override
    public LineaProducto getLineaProducto() {
        
        return new LineaGamaAlta();
    }

    @Override
    public MantenimientoProducto getMantenimiento() {
        
        return new MantenimientoPremium();
    }

    @Override
    public ICamara getCamara() {
        
        return new Camara108mpx();
    
    }

    @Override
    public IBateria getBateria() {
        
        return new Bateria4000mah();
        
    }

    
}