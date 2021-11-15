package tienda.models.impl;

import tienda.models.Familia;
import tienda.models.interfaces.ICategoria;

public class FamiliaLaptops extends Familia {

    public FamiliaLaptops(ICategoria categoria) {

        super(categoria);
    }

    @Override
    public String getNombre() {

        String nombre = "LAPTOPS";
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
        lista = lista +"\n* disco duro";
        lista = lista +"\n* puertos";
        lista = lista +"\n* teclado";

        if (categoria != null)  
            lista = lista +categoria.getFunciones();

        return lista;
    }
}
