package view;

public class MostrarFilmes {

    public static void main(String[] args) {

        System.out.println("Aqui esta a lista com os filmes disponoveis no momento: \n");

        FilmesDAO.mostrarFilmes();
        System.out.println("\n");

    }

}
