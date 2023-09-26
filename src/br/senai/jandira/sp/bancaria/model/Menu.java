package br.senai.jandira.sp.bancaria.model;

import java.util.Scanner;

public class Menu {
    Cliente cliente = new Cliente();
    Conta conta = new Conta();
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    public void executarMenu() {

        while (!exit) {

            System.out.println("/////++++++ menu ++++++/////");
            System.out.println("1- Cadastrar Cliente ");
            System.out.println("2- Cadastar Conta");
            System.out.println("3- Consultar Saldo ");
            System.out.println("4- Realizar Deposito ");
            System.out.println("5- Realizar Saque ");
            System.out.println("6- Sair ");
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {

                case 1:
                    cliente.cadastrarCliente();

                    break;

                case 2:
                    System.out.println("Feature in development");

                    break;


                case 3:
                    conta.consutarSaldo();

                    break;


                case 4:
                    System.out.println(" Informe o valor que deseja Depositar :  ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();

                    conta.realizarDeposito(valorDeposito);

                    break;


                case 5:
                    System.out.println(" Informe o valor que deseja Sacar:  ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();
                    conta.realizarSaque(valorSaque);
                    break;


                case 6:
                    exit = true;
                    break;
            }

        }
    }
}
