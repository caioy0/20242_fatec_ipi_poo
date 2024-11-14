import java.sql.*;

public class ConnectionFactory {
    //String de conexao
    //Ex: https://www.google.com:80/search
    //jdbc:posgresql://127.0.0.1:5432/pessoas
    private static final String HOST = "localhost";
    private static final String PORT = "5432";
    private static final String DB = "20242_fatec_ipi_poo_pessoas_v2";
    private static final String USER = "postgres";
    //pesquisar pela classe propieties dp pacote java.util
    //assim voce resolve a questao da senha chumbada no codigo
    private static final String PASSWORD = "";
    // -- Complicado isso

    public static Connection conectar() {
        try {
            var s = String.format(
                "jdbc:postgresql://%s:%s/%s",
                HOST, PORT, DB
            );
            Connection c = DriverManager.getConnection(
                s, USER, PASSWORD
            );
            return c;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
