interface Conector {
    Conexion generar();

    Conector setUsuario(final String Usuario);

    Conector setContraseña(final int Contraseña);
}