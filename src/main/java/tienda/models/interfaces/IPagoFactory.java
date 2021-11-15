package tienda.models.interfaces;

import tienda.models.BancoMetodoPago;
import tienda.models.BlockChainMetodoPago;
import tienda.models.impl.Ticket;

public interface IPagoFactory {
    
    public IDocumento getDocumento();
    
    public IMetodoPago getOperacion();
}
