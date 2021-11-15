
package tienda.models.impl;

import tienda.models.LineaGamaMedia;
import tienda.models.LineaProducto;
import tienda.models.MantenimientoEstandar;
import tienda.models.MantenimientoProducto;
import tienda.models.interfaces.IBateria;
import tienda.models.interfaces.ICamara;
import tienda.models.interfaces.IProductoFactory;

public class GamaMediaFactory implements IProductoFactory {

    @Override
    public LineaProducto getLineaProducto() {
        
        return new LineaGamaMedia();
        
    }

    @Override
    public MantenimientoProducto getMantenimiento() {
       
        return new MantenimientoEstandar();
        
    }

    @Override
    public ICamara getCamara() {
        
        return new Camara16mpx();
        
    }

    @Override
    public IBateria getBateria() {
        return new Bateria3500mah();
    }

}
