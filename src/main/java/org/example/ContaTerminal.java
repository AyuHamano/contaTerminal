package org.example;

import java.util.Scanner;

public class ContaTerminal{
    public String agencia;
    public String nomeCliente;
    public long numero;
    public double saldo;

    Scanner scanner = new Scanner(System.in);

    public void lerDadosBancarios(){
        System.out.println("Digite seu nome completo:\n");
        this.nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta bancária:");
        this.numero = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Digite a agência da conta:");
        this.agencia = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        this.saldo = scanner.nextDouble();

        scanner.close();
    }

    public void imprimirDadosBancarios(){
        System.out.println("Aqui estão os dados da sua conta:");
        System.out.println(
                "\nNome do cliente: " + nomeCliente +
                        "\nNúmero da conta bancária: " + numero +
                        "\nNúmero da agência: " + agencia +
                        "\nO saldo da conta: " + saldo
        );
    }
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();

        conta.lerDadosBancarios();
        conta.imprimirDadosBancarios();
    }


}
