package tienda.models;

import tienda.models.interfaces.IMetodoPago;

public class BancoMetodoPago implements IMetodoPago {

    private String bankId;
    private Double comision;

    @Override
    public  void pagarPedido(Pedido order){
        bankPayOrder(order);
    }
    
    @Override
    public void mostrarPago(Pedido order){

        /* Efectivo */
        System.out.println("Pagando con efectivo | total: "+ order.getMontoTotal());
    }

    public void bankPayOrder(Pedido order){
        
        comision = order.getMontoTotal() * 0.15;
        /* Doing Blok Chain Validation */
        System.out.println("Procesando el pago con Banco "+getBankId()+" | total: "+order.getMontoTotal() + " comision: " +comision);
    }

    public String getBankId() {
        if(this.bankId == null){
            setBankId("B90000000001");
        }
        return bankId;
    }

    public void setBankId(String bankId){
        this.bankId = bankId;
    }
}