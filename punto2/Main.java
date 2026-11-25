public class Main {

    private static void pagar(MedioPago medio, double monto) {
        if (monto > 0) {
            medio.procesarPago(monto);
            System.out.println("El pago se procesó correctamente.");
        } else {
            System.out.println("Monto inválido: debe ser mayor que cero. No se procesó el pago.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Juan Pérez", "1234");
        BilleteraVirtual billetera = new BilleteraVirtual("Ana Gómez", "Mercado Pago");

        pagar(tarjeta, 15000.50);
        pagar(billetera, 8200);
        pagar(billetera, 0); 
    }
}
