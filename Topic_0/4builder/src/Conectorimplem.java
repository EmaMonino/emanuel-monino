class Conectorimplem implements Conector {
    private Conexion Conexiondef;

    public Conectorimplem() {
        Conexiondef = new Conexion();
    }

    @Override
    public Conexion generar() {
        Conexion car = new Conexion();
        car.setUsuario(Conexiondef.getUsuario());
        car.setContraseña(Conexiondef.getContraseña());
        return car;
    }

    @Override
    public Conector setUsuario(final String Usuario) {
        Conexiondef.setUsuario(Usuario);
        return this;
    }

    @Override
    public Conector setContraseña(final int Contraseña) {
        Conexiondef.setContraseña(Contraseña);
        return this;
    }
}