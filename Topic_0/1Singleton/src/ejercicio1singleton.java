import java.util.Scanner;

public class ejercicio1singleton {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usuario, contraseña;

        System.out.print("Ingrese su Usuario: ");
        usuario = input.nextLine();

        System.out.print("Ingrese su contraseña: ");
        contraseña = input.nextLine();

        if (usuario.equals("emanuel") && (contraseña.equals("12345"))){
            singleton object = singleton.getInstance();
            object.mensaje();
             } else  {
                    System.out.println("Conexion la Database Fallida");
        }
    }
}