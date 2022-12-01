package view;

import view.ClientesDAO;

import java.util.Scanner;

public class DeletandoClientes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ClientesDAO.mostrarClientes();

        System.out.println("Selecione o ID do cliente que voce deseja DELETAR do banco de dados (Por numeros): ");
        int idDel = sc.nextInt();

        ClientesDAO.deletarClientes(idDel);

        System.out.println("Cliente apagado com sucesso!\n");
    }

}
