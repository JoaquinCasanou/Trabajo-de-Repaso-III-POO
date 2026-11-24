public class Tarjeta extends MedioPago {
    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    public String getUltimosCuatroDigitos() {
        return ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta");
        System.out.println("Titular: " + getTitular());
        System.out.println("Tarjeta terminada en: " + ultimosCuatroDigitos);
        System.out.println("Monto: $" + monto);
    }
}
