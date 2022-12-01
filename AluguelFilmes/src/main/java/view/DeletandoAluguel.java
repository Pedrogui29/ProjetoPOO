package view;

import view.AluguelDAO;

import java.util.Scanner;



public class DeletandoAluguel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Aluguuis cadastrados: \n");
        AluguelDAO.mostrarAluguel();

        System.out.println("\nSelecione o ID do aluguel que voce deseja apagar: ");
        int idDelAl = sc.nextInt();

        AluguelDAO.apagarAluguel(idDelAl);

        System.out.println("Aluguel apagado com sucesso!\n");

    }

}
