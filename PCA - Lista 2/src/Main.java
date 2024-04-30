public class Main {
    public static void main(String[] args) {
//        1. Escreva um programa que imprima os números de 1 a 10.

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        2. Escreva um programa que imprima os números de 10 a 1 em ordem decrescente

//        for (int i = 10; i >= 1 ; i--) {
//            System.out.println(i);
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        3. Calcule a soma dos números de 1 a 100.

//        int soma = 0;
//        for (int i = 1; i <= 100; i++) {
//            soma += i;
//        }
//        System.out.println(soma);

//--------------------------------------------------------------------------------------------------------------------//

//        4. Calcule a soma dos números pares de 1 a 50.

//        int soma = 0;
//        for (int i = 1; i <= 50; i++) {
//            if(i%2 == 0){
//                soma += i;
//            }
//        }
//        System.out.println(soma);

//--------------------------------------------------------------------------------------------------------------------//

//        5. Imprima os números pares de 0 a 20.

//        for (int i = 0; i <= 20; i++) {
//            if (i%2 == 0) {
//                System.out.println(i);
//            }
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        6. Escolha um número aleatório maior do que 100 e imprima todos os números de 1 até esse número.

//        int n = 102;
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        7. Faça um programa que imprima a tabuada de multiplicação de um número qualquer entre 1 e 10.

//        int n = 9;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " * " + i + " = " + n*i);
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        8. Calcule o fatorial de um número qualquer.

//        double fatorial = 10;
//
//        for (double i = fatorial - 1; i >= 1; i--) {
//            fatorial = fatorial * i;
//        }
//        System.out.println(fatorial);

//--------------------------------------------------------------------------------------------------------------------//

//        9. Escreva um programa que conte de 1 a 20, mas pule os números múltiplos de 3.

//        for (int i = 1; i <= 20; i++) {
//            if (i%3 != 0){
//                System.out.println(i);
//            }
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        10. Selecione um número aleatório maior do que 200 e imprima todos os números pares de 100 até esse
//            número.

//        int n = 235;
//
//        for (int i = 100; i <= n; i++) {
//            if(i%2 == 0){
//                System.out.println(i);
//            }
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        11. Escreva um programa que imprima os primeiros 10 números da sequência de Fibonacci.

//        int nA = 1;
//        int nP = 0;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(nP);
//            nP = nP + nA;
//            nA = nP - nA;
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        12. Escolha um número aleatório maior do que 50 e imprima todos os seus divisores.

//        int n = 54;
//
//        for (int i = 1; i < n; i++) {
//            if (n%i == 0){
//                System.out.println(i);
//            }
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        13. Escreva um programa que verifique se um número qualquer maior do que 100 é primo.

//        int n = 7;
//        int contador = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if(n%i == 0){
//                contador++;
//            }
//        }
//        if(contador == 2){
//            System.out.println(n + " É primo");
//        }else{
//            System.out.println(n + " Não é primo");
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        14. Imprima os primeiros 10 números primos.

//        int contador = 0;
//        int contadorP = 0;
//
//        for (int i = 1; contadorP < 10; i++) {
//            for (int n = 1; n <= i; n++) {
//                if (i % n == 0) {
//                    contador++;
//                }
//            }
//            if (contador == 2) {
//                contadorP++;
//                System.out.println(contadorP + "º Primo: " + i);
//            }
//            contador = 0;
//        }
    }
}