public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Billetera Virtual");
        System.out.println("Titular: " + getTitular());
        System.out.println("Aplicación: " + nombreAplicacion);
        System.out.println("Monto: $" + monto);
    }
}
