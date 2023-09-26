package br.senai.jandira.sp.bancaria.model;

public class Conta {
    private String agencia = "1258-X";
    private int numeroConta = 549687;
    private double saldo = 6943.80;
    private double valor;

    public void realizarDeposito(double valor) {
        this.saldo += valor;
        System.out.println(" O saldo disponivel na conta é: " + this.saldo);


    }

    public void realizarSaque(double valor) {

        boolean validaSaque = avalaliarSaque(valor);

        if (validaSaque){
            this.saldo -= valor;
        }else{
            System.out.println("Impossivel Realizar o Saque - Pobre kkkkk");
        }

    }
    public void consutarSaldo(){
        System.out.println("O saldo disponivel na conta é: " + this.saldo);
    }
    public boolean avalaliarSaque(double valor){
        if (this.saldo >= valor){
            return true;
        }else{
            return false;
        }
    }
}
