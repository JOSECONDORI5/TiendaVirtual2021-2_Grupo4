
package tienda.models.impl;

import tienda.models.BlockChainMetodoPago;
import tienda.models.interfaces.IDocumento;
import tienda.models.interfaces.IPagoFactory;
import tienda.models.interfaces.IMetodoPago;

public class BlockChainMetodoPagoFactory implements IPagoFactory {

    @Override
    public IDocumento getDocumento() {
        return new Factura();
    }

    @Override
    public IMetodoPago getOperacion() {
        return new BlockChainMetodoPago();
    }

}
