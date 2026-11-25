public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Juan Pérez", "1234");
        BilleteraVirtual billetera = new BilleteraVirtual("Ana Gómez", "Mercado Pago");

        tarjeta.procesarPago(4500.50);
        billetera.procesarPago(1800);
        
        System.out.println("Prueba con montos inválidos");
        tarjeta.procesarPago(0);
        billetera.procesarPago(-250);
    }
}
