package tienda.models;

import com.fasterxml.uuid.Generators;

import java.util.UUID;
import tienda.models.interfaces.IMetodoPago;

public class BlockChainMetodoPago implements IMetodoPago {

    private String walletId;
    private Double comision;

    @Override
    public  void pagarPedido(Pedido order){
        walletPayOrder(order);
    }

     @Override
    public void mostrarPago(Pedido order){

        /* Efectivo */
        System.out.println("Pagando con efectivo | total: "+ order.getMontoTotal());
    }
    public void walletPayOrder(Pedido order){
        
        comision = order.getMontoTotal() * 0.05;
        /* Doing Blok Chain Validation */
        System.out.println("Procesando el pago con wallet "+getWalletId()+" | total: "+order.getMontoTotal() + " comision: " +comision);
    }

    public String getWalletId() {
        if(this.walletId == null){
            UUID uuid = Generators.timeBasedGenerator().generate();
            setWalletId(uuid.toString());
        }
        return walletId;
    }

    public void setWalletId(String walletId){
        this.walletId = walletId;
    }
}
