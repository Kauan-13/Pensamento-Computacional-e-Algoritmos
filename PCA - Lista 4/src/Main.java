import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Solicite ao usuário um número entre 1 e 5 e exiba o número por extenso (por exemplo, 1 = "um", 2 = "dois",
//           etc.).

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um número de 1 a 5!");
//        int numero = scanner.nextInt();
//
//        switch (numero) {
//            case 1:
//                System.out.println("um");
//                break;
//            case 2:
//                System.out.println("dois");
//                break;
//            case 3:
//                System.out.println("três");
//                break;
//            case 4:
//                System.out.println("quatro");
//                break;
//            case 5:
//                System.out.println("cinco");
//                break;
//            default:
//                System.out.println("Número Inválido");
//                break;
//        }
//        scanner.close();

//--------------------------------------------------------------------------------------------------------------------//

//        2. Solicite ao usuário um número de 1 a 7 representando o dia da semana e exiba o nome do dia correspondente.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um número de 1 a 7!");
//        int dia = scanner.nextInt();
//
//        switch (dia) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sábado");
//                break;
//            default:
//                System.out.println("Número Inválido");
//                break;
//        }
//        scanner.close();

//--------------------------------------------------------------------------------------------------------------------//

//        3. Crie um menu de opções para uma calculadora simples que permita ao usuário escolher entre adição,
//           subtração, multiplicação e divisão. Também solicite dois números e exiba o resultado da operação
//           escolhida.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Aperte 1 para soma");
//        System.out.println("Aperte 2 para subtração");
//        System.out.println("Aperte 3 para multiplicação");
//        System.out.println("Aperte 4 para divisão");
//
//        int operador = scanner.nextInt();
//
//        System.out.println("Digite o primeiro valor");
//
//        float valor1 = scanner.nextInt();
//
//        System.out.println("Digite o segundo valor");
//
//        float valor2 = scanner.nextInt();
//
//        switch (operador) {
//            case 1:
//                System.out.println("O valor da soma é: " + (valor1 + valor2));
//                break;
//            case 2:
//                System.out.println("O valor da subtração é: " + (valor1 - valor2));
//                break;
//            case 3:
//                System.out.println("O valor da multiplicação é: " + (valor1 * valor2));
//                break;
//            case 4:
//                System.out.println("O valor da divisão é: " + (valor1 / valor2));
//                break;
//            default:
//                break;
//        }
//        scanner.close();

//--------------------------------------------------------------------------------------------------------------------//

//        4. Crie um programa que permita ao usuário escolher entre diferentes gêneros de filmes e exiba uma sugestão
//           de filme.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Aperte 1 para romance \n " +
//                "Aperte 2 para comedia \n " +
//                "Aperte 3 para ação \n " +
//                "Aperte 4 para ficção");
//
//        int genero = scanner.nextInt();
//
//        switch (genero) {
//            case 1:
//                System.out.println("Assista before sunrise!");
//                break;
//            case 2:
//                System.out.println("Assista Gente Grande!");
//                break;
//            case 3:
//                System.out.println("Assista Veloozes e Furiosos 7!");
//                break;
//            case 4:
//                System.out.println("Assista Interestelar!");
//                break;
//        }
//        scanner.close();

//--------------------------------------------------------------------------------------------------------------------//

//        5. Solicite ao usuário sua idade e exiba uma mensagem de acordo com a seguinte classificação: menor de
//           idade (0 a 17 anos), jovem (18 a 25 anos), adulto (26 a 59 anos) ou idoso (60 anos ou mais).
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite sua idade");
//
//        int idade = scanner.nextInt();
//
//        switch (idade) {
//            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17:
//                System.out.println("Menor de idade");
//                break;
//            case 18,19,20,21,22,23,24,25:
//                System.out.printf("Jovem");
//                break;
//            case 26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
//                System.out.println("Adulto");
//                break;
//            default:
//                System.out.println("Idoso");
//                break;
//        }
//        scanner.close();

//--------------------------------------------------------------------------------------------------------------------//

//        6. Crie um programa que permita ao usuário escolher entre diferentes dias da semana e apresente uma
//           sugestão de atividade para o dia escolhido.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("digite 1 para Domingo");
//        System.out.println("digite 2 para Segunda");
//        System.out.println("digite 3 para Terça");
//        System.out.println("digite 4 para Quarta");
//        System.out.println("digite 5 para Quinta");
//        System.out.println("digite 6 para Sexta");
//        System.out.println("digite 7 para Sabado");
//
//        int dia = scanner.nextInt();
//
//        switch (dia) {
//            case 1:
//                System.out.println("Se o dia for domingo fica dormindo");
//                break;
//            case 2:
//                System.out.println("Se o dia for segunda vá trabalhar");
//                break;
//            case 3:
//                System.out.println("Se o dia for terça finja doeça para não ir trabalhar");
//                break;
//            case 4:
//                System.out.println("Se o dia for quarta passer com cachorro");
//                break;
//            case 5:
//                System.out.println("Se o dia for quinta comer pizza");
//                break;
//            case 6:
//                System.out.println("Se o dia for sexta passar a madrugada assistindo e jogando");
//                break;
//            case 7:
//                System.out.println("Se o dia for sábado tomar banho");
//                break;
//        }
//        scanner.close();

//--------------------------------------------------------------------------------------------------------------------//

//        7. Solicite ao usuário duas notas entre 0 e 10, calcule a média IFSC e exiba as seguintes mensagens:
//           • A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
//           • A mensagem “Aprovado com Distinção”, se a média for igual a dez;
//           • A mensagem “Reprovado” se a média for menor de do que sete;

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite a primeira nota");
//
//        float nota1 = scanner.nextFloat();
//
//        System.out.println("Digite a segunda nota");
//
//        float nota2 = scanner.nextFloat();
//
//        int media = (int) (nota1 + nota2) / 2;
//
//        switch (media) {
//            case 1,2,3,4,5,6:
//                System.out.println("Reprovado com média: " + (nota1 + nota2)/2);
//                break;
//            case 7,8,9:
//                System.out.println("Aprovado com média: " + (nota1 + nota2)/2);
//                break;
//            case 10:
//                System.out.println("Aprovado com distinção NOTA 10!!");
//                break;
//        }
//        scanner.close();

//--------------------------------------------------------------------------------------------------------------------//

//        8. Solicite ao usuário uma letra do alfabeto e verifique se é uma vogal ou uma consoante.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite uma letra");
//
//        char letra = scanner.next().charAt(0);
//
//        switch (letra) {
//            case 'a','e','i','o','u','A','E','I','O','U':
//                System.out.println("É vogal");
//                break;
//            default:
//                System.out.println("É consoante");
//                break;
//        }
//        scanner.close();

//--------------------------------------------------------------------------------------------------------------------//

//        9. Solicite ao usuário um número representando um mês do ano e exiba o número de dias nesse mês.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite 1 para Janeiro");
//        System.out.println("Digite 2 para Fevereiro");
    }
}