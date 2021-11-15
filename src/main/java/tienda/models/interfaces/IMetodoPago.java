package tienda.models.interfaces;

import tienda.models.Pedido;

public interface IMetodoPago {
    public void pagarPedido(Pedido order);
    
    public void mostrarPago(Pedido order);
}
