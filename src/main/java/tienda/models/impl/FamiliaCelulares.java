package tienda.models.impl;

import tienda.models.Familia;
import tienda.models.interfaces.ICategoria;

public class FamiliaCelulares extends Familia{

    public FamiliaCelulares(ICategoria categoria) {
        super(categoria);
    }

    @Override
    public String getNombre() {

        String nombre = "CELULARES";
        if (categoria != null)  
            nombre = nombre + " PARA " + categoria.getNombre();
        return nombre;
    }

    @Override
    public String getEspecificaciones() {

        String lista = new String();
        lista = "\nEspecificaciones:";
        lista = lista +"\n* memoria";
        lista = lista +"\n* procesador";
        lista = lista +"\n* redes";
        lista = lista +"\n* GPS";
        lista = lista +"\n* sensores";
    
        if (categoria != null)  
            lista = lista + categoria.getFunciones();

        return lista;
    }
    
}
