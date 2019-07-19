public class FormularioProxy  implements Formulario {

    private FormularioReal formularioReal;
    private String formulario;

    public FormularioProxy(String Formulario1) {
        this.formulario = Formulario1;
    }
    @Override
    public void obtener() {
        if(formularioReal == null){
            formularioReal = new FormularioReal(formulario);
        }
    }
}