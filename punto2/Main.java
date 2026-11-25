public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Juan Pérez", "1234");
        BilleteraVirtual billetera = new BilleteraVirtual("Ana Gómez", "Mercado Pago");

    
        
        pagar(tarjeta, 15000.50);
        pagar(billetera, 8200);
        pagar(billetera, 0); 
    }
}
