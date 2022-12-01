package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import controller.BancoDeDados;
import model.Filmes;


public class FilmesDAO {

    public static void main(String[] args) {
        mostrarFilmes();
    }

    // Conex�o
    static BancoDeDados film = new BancoDeDados();
    static Connection conexao = BancoDeDados.conectaDB();

    public static void AdicionarFilmes(Filmes filme) {

        String sql = "INSERT INTO filme (nomefilme, anofilme, genero) VALUES (?, ?, ?)";
        Connection conexao = null;
        PreparedStatement ps = null;

        try {
            // Criando conex�o com o banco de dados.
            conexao = BancoDeDados.conectaDB();

            ps = conexao.prepareStatement(sql);

            // Adicionando valores para query
            ps.setString(1, filme.getNomeFilme());
            ps.setInt(2, filme.AnoFilme);
            ps.setString(3, filme.getGenero());

            // Executando
            ps.execute();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void mostrarFilmes() {
        ResultSet filmes1;
        try {
            filmes1 = conexao.createStatement().executeQuery("SELECT * FROM filme");
            while (filmes1.next()) {
                System.out.println(filmes1.getInt("idfilme") + " " + filmes1.getString("nomefilme"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void editarFilmes(Filmes filme) {

        String sql = "UPDATE filme SET nomefilme = ?, anofilme = ?, genero = ? WHERE idfilme = ?";
        Connection con = null;
        PreparedStatement ps = null;

        try {
            // Criando conexao com o banco
            con = BancoDeDados.conectaDB();

            // Criando a classe pra executar a linha do mySQL
            ps = con.prepareStatement(sql);

            //Adicionando valores pra editar no banco
            ps.setString(1, filme.getNomeFilme());
            ps.setInt(2, filme.getAnoFilme());
            ps.setString(3, filme.getGenero());

            // Qual  o ID do Filme que sera editado
            ps.setInt(4, (filme.getIdFilme()));

            ps.execute();

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void apagarFilmes(int idFilme) {
        String sql = "DELETE FROM filme WHERE idfilme = ?";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = BancoDeDados.conectaDB();

            ps = con.prepareStatement(sql);

            ps.setInt(1, idFilme);

            ps.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}






