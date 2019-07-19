public class ConexionSQLdemo {
    private Conector conector1;

    public ConexionSQLdemo(final Conector conector2) {
        this.conector1 = conector2;
    }

    public Conexion ingresar() {
        return conector1.setContraseña(12345)
                .setUsuario("Carlos")
                .generar();
    }

    public static void main(final String[] arguments) {
        final Conector generar = new Conectorimplem();

        final ConexionSQLdemo ConexionSQLdemo = new ConexionSQLdemo(generar);

        System.out.println(ConexionSQLdemo.ingresar());
        System.out.println("conexion Exitosa");
    }
}