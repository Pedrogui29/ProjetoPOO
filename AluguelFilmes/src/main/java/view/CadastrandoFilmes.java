package view;

import model.Filmes;

import java.util.Scanner;


public class CadastrandoFilmes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Filmes filme = new Filmes();

        System.out.println("Informe qual filme voce deseja adicionar: ");
        String novofilme = sc.nextLine();
        filme.setNomeFilme(novofilme);

        System.out.println("Agora informe o ano em que o filme foi lancado: ");
        int anolanc = sc.nextInt();
        filme.setAnoFilme(anolanc);

        System.out.println("Para finalizar, informe o genero do filme em questao: ");
        sc.nextLine();
        String genfilm = sc.nextLine();
        filme.setGenero(genfilm);

        FilmesDAO.AdicionarFilmes(filme);

        System.out.println("Filme : " + novofilme + " Adicionado com sucesso!\n");

    }

}
