public class fabricaheredada extends AbstractFactory {
    @Override
    Conexion conectar(String tipo) {
        if (tipo.equalsIgnoreCase("SQLServer")) {
            return new SqlServerConexion();
        } else if (tipo.equalsIgnoreCase("MySQL")) {
            return new MySqlConexion();
        } else if (tipo.equalsIgnoreCase("oracle")) {
            return new OracleConexion();
        } else  {
            return new PostgreSqlConexion();


        }

    }
}