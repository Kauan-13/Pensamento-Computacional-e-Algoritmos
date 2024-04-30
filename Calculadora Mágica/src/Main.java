import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = -1;
        float valor1;
        float valor2;
        float resultado;

        while (operacao != 0) {
            System.out.println("/---- Calculadora Mágica ----/");
            System.out.println("""
                    1 - Soma
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    0 - sair""");
            System.out.println("/----------------------------/");

            operacao = scanner.nextInt();

            switch (operacao) {
                case 0:
                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Saindo...");
                    System.out.println("/----------------------------/");
                    break;
                case 1:
                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Digite o Primeiro valor: ");
                    System.out.println("/----------------------------/");

                    valor1 = scanner.nextFloat();

                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Digite o Segundo valor: ");
                    System.out.println("/----------------------------/");

                    valor2 = scanner.nextFloat();

                    resultado = valor1 + valor2;

                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Resultado da Soma: " + resultado);
                    System.out.println("/----------------------------/");
                    break;
                case 2:
                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Digite o Primeiro valor: ");
                    System.out.println("/----------------------------/");

                    valor1 = scanner.nextFloat();

                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Digite o Segundo valor: ");
                    System.out.println("/----------------------------/");

                    valor2 = scanner.nextFloat();

                    resultado = valor1 - valor2;

                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Resultado da Subtração: " + resultado);
                    System.out.println("/----------------------------/");
                    break;
                case 3:
                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Digite o Primeiro valor: ");
                    System.out.println("/----------------------------/");

                    valor1 = scanner.nextFloat();

                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Digite o Segundo valor: ");
                    System.out.println("/----------------------------/");

                    valor2 = scanner.nextFloat();

                    resultado = valor1 * valor2;

                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Resultado da Multiplicação: " + resultado);
                    System.out.println("/----------------------------/");
                    break;
                case 4:
                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Digite o Primeiro valor: ");
                    System.out.println("/----------------------------/");

                    valor1 = scanner.nextFloat();

                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Digite o Segundo valor: ");
                    System.out.println("/----------------------------/");

                    valor2 = scanner.nextFloat();

                    resultado = valor1 / valor2;

                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Resultado da Divisão: " + resultado);
                    System.out.println("/----------------------------/");
                    break;
                default:
                    System.out.println("/---- Calculadora Mágica ----/");
                    System.out.println("Opção Inválida");
                    System.out.println("/----------------------------/");
                    break;
            }
        }
        scanner.close();
    }
}