public class FormularioReal implements Formulario {

    private String formulario;

    public FormularioReal(String Formulario1) {
        this.formulario = Formulario1;
        obtener();
    }
    @Override
    public void obtener() {
        System.out.println("Obteniendo: " + formulario);
    }
}