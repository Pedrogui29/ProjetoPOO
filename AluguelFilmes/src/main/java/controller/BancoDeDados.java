package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class BancoDeDados {

    public static Connection conectaDB() {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/locadorafilmes", "root", "inatel");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Problema no driver JDBC" + e);
        }

        return conexao;
    }

    public static void main(String[] args) throws Exception {
        Connection con = conectaDB();
        if(con!=null) {
            System.out.println("Foi conectado com sucesso!");
            con.close();
        } else {
            System.out.println("Nao foi possivel estabelecer conexao.");
        }
    }
}

