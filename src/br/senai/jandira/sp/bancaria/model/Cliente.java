package br.senai.jandira.sp.bancaria.model;

import java.util.Scanner;

public class Cliente {

    Scanner scanner = new Scanner(System.in);
    public  void cadastrarCliente(){
        System.out.println("/***//**/**/**/*/* Cadastro cliente */*/*/*/*/*/");
        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe se CPF:    ");
        cpf = scanner.nextLong();
        System.out.println("Informe seu RG:  ");
        rg = scanner.nextLong();
        System.out.println("Informe seu Telefone:    ");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("/*/*/*/**/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*/*/*/*/");

    }

    private String nome;
    private  long cpf, rg, telefone;

    public String getNome(){
        return nome;
    }
   public void setNome(String nome){
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}
