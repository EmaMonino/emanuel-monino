class Conexion {
    private int Contraseña;
    private String Usuario;

    public Conexion() {
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(final String Usuario) {
        this.Usuario = Usuario;
    }

    public int getContraseña() {
        return Contraseña;
    }

    public void setContraseña(final int Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        return "ConexionSQL [Contraseña = " + Contraseña + ", Usuario = " + Usuario + "]";
    }
}