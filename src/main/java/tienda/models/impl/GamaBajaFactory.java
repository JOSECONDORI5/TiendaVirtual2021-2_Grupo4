package tienda.models.impl;

import tienda.models.*;
import tienda.models.interfaces.IBateria;
import tienda.models.interfaces.ICamara;
import tienda.models.interfaces.IProductoFactory;

public class GamaBajaFactory implements IProductoFactory {

    @Override
    public LineaProducto getLineaProducto() {

        return new LineaGamaBaja();
    }

    @Override
    public MantenimientoProducto getMantenimiento() {

        return new MantenimientoEstandar();
    }

    @Override
    public ICamara getCamara() {
        
        return new Camara8px();
        
    }

    @Override
    public IBateria getBateria() {
        
        return new Bateria2000mah();
        
    }
    
}