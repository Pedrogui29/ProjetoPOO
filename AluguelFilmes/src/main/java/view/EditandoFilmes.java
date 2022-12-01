package view;

import model.Filmes;

import java.util.Scanner;


public class EditandoFilmes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FilmesDAO.mostrarFilmes();

        Filmes f1 = new Filmes();

        System.out.println("\nInforme o ID do filme que voce deseja modificar: ");
        int id = sc.nextInt();
        f1.setIdFilme(id);

        System.out.println("Agora informe o nome que voce deseja inserir: ");
        sc.nextLine();
        String novonomefilme = sc.nextLine();
        f1.setNomeFilme(novonomefilme);

        System.out.println("Agora informe o ano que voce deseja modificar: ");
        int novoano = sc.nextInt();
        f1.setAnoFilme(novoano);

        System.out.println("Para finalizarmos, informe o novo genero: ");
        sc.nextLine();
        String novogen = sc.nextLine();
        f1.setGenero(novogen);

        FilmesDAO.editarFilmes(f1);

        System.out.println("Filme " + novonomefilme + " editado com sucesso!\n");
    }
}
