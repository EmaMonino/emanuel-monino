public class singleton {

    private static singleton instance = new singleton();

    private singleton(){}

    public static singleton getInstance(){
        return instance;
    }

    public void mensaje(){
        System.out.println("Database Conection Success");
    }
}