import java.util.Scanner;

public class ejercicio1singleton {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user, password;

        System.out.print("User: ");
        user = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        if (user.equals("emanuel") && (password.equals("12345"))){
            singleton object = singleton.getInstance();
            object.mensaje();
             } else  {
                    System.out.println("Fail to conect to database");
        }
    }
}