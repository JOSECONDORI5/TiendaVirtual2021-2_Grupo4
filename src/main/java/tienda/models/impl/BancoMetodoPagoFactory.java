
package tienda.models.impl;

import tienda.models.BancoMetodoPago;
import tienda.models.BlockChainMetodoPago;
import tienda.models.interfaces.IDocumento;
import tienda.models.interfaces.IPagoFactory;
import tienda.models.interfaces.IMetodoPago;

public class BancoMetodoPagoFactory implements IPagoFactory {

    @Override
    public IDocumento getDocumento() {
        return new Ticket();
    }

    @Override
    public IMetodoPago getOperacion() {
        return new BancoMetodoPago();
    }
    
}
