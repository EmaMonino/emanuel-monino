import java.util.Scanner;

public class SelectorBdD {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        fabricaheredada miFabrica;
        Conexion miConexion;

        System.out.print("Escriba el tipo de Base de datos que desea Utilizar: ");
        String tipo = scanner.nextLine();

        miFabrica = new fabricaheredada();
        miConexion = miFabrica.conectar(tipo);

        String output = "Eligio la base de datos tipo: "+
                miConexion.mensaje();
        System.out.println(output);
    }
}
