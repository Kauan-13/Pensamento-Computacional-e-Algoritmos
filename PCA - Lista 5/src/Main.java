import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       1. Soma dos elementos: Crie um algoritmo que recebe um array de números inteiros e imprime a soma de
//          todos os elementos.

//       int[] numeros = {1,2,3,4,5,6,7,8,9,10};
//       int soma = 0;
//
//       for (int i = 0; i < numeros.length; i++) {
//           soma += numeros[i];
//       }
//
//       System.out.println(soma);

//--------------------------------------------------------------------------------------------------------------------//

//        2. Média dos elementos: Crie um algoritmo que calcula a média dos elementos em um array de números
//           inteiros.

//        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
//        double media = 0;
//
//        for(int i = 0; i < numeros.length; i++){
//            media += numeros[i];
//        }
//
//        System.out.println(media/numeros.length);

//--------------------------------------------------------------------------------------------------------------------//

//        3. Menor elemento: Desenvolva um algoritmo que encontre e exiba o menor elemento em um array de
//           números inteiros.

//        int[] numeros = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int menorNumero = numeros[0];
//
//        for(int i = 0; i < numeros.length; i++){
//            if(numeros[i] < menorNumero){
//                menorNumero = numeros[i];
//            }
//        }
//
//        System.out.println(menorNumero);

//--------------------------------------------------------------------------------------------------------------------//

//        4. Segundo maior elemento: Escreva um algoritmo para encontrar o segundo maior número em um array
//           de inteiros.

//        int[] inteiros = {1,2,3,5,6,10,18};
//        int maior = 0;
//        int indice = 0;
//        int Nmaior = 0;
//
//        for(int i = 0; i < 2; i++) {
//            for(int j = 0; j < inteiros.length; j++) {
//                if(inteiros[j] > maior) {
//                    maior = inteiros[j];
//                    indice = j;
//                }
//            }
//            inteiros[indice] = 0;
//            Nmaior = maior;
//            maior = 0;
//        }
//        System.out.println(Nmaior);

//--------------------------------------------------------------------------------------------------------------------//

//        5. Contagem de elementos ímpares: Implemente um algoritmo que conte e exiba a quantidade de números
//           ímpares em um array de inteiros.

//        int[] inteiros = {0,1,2,3,4,5,6,7,8,9};
//        int qImpares = 0;
//
//        for(int i = 0; i < inteiros.length; i++){
//            if(inteiros[i]%2 == 0){
//                qImpares++;
//            }
//        }
//        System.out.println("O array possui " + qImpares + " impares");

//--------------------------------------------------------------------------------------------------------------------//

//        6. Frequência de um número: Crie um algoritmo que conte e exiba a frequência de um número específico
//           em um array de inteiros.

//        int[] inteiros = {1,2,1,3,1,4,1,5,1};
//        int ocorrencias = 0;
//
//        for(int i = 0; i < inteiros.length; i++){
//            if(inteiros[i] == 1){
//                ocorrencias++;
//            }
//        }
//        System.out.println("O array possui " + ocorrencias + " ocorrências do número 1");

//--------------------------------------------------------------------------------------------------------------------//

//        7. Inversão do array: Escreva um algoritmo que inverta a ordem dos elementos em um array e exiba o array
//           resultante.

//        int[] inteiros = {1,2,3,4,5,6,7,8,9,10};
//        int[] inverso = new int[inteiros.length];
//
//        for (int i = inteiros.length - 1; i >= 0; i--) {
//            inverso[(inteiros.length - i - 1)] = inteiros[i];
//        }
//
//        for (int i = 0; i < inverso.length; i++) {
//            System.out.println(inverso[i]);
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        8. Verificar se um número está presente: Crie um algoritmo que verifica se um determinado número está
//           presente em um array de inteiros e exibe "Sim"ou "Não".

//        int[] inteiros = {1,2,3,4,5,6,7,8,9,10};
//        boolean presente = false;
//        int alvo = 4;
//
//        for(int i = 0; i < inteiros.length; i++){
//            if(inteiros[i] == alvo){
//                presente = true;
//                System.out.println("Sim");
//                break;
//            }
//        }
//        if(!presente){
//            System.out.println("Não");
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        9. Verificar se um aluno está presente: Crie um array de strings contendo nomes de alunos. Em seguida,
//           solicite ao usuário que insira um nome e verifique se ele está presente no array.

//        String[] alunos = {"Kauan","Renata","Andreia"};
//        String aluno = "";
//        boolean presente = false;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite o nome do aluno: ");
//
//        aluno = scanner.next();
//
//        for(int i = 0; i < alunos.length; i++){
//            if(alunos[i].equalsIgnoreCase(aluno)){
//                presente = true;
//                System.out.println(alunos[i] + " está presente");
//                break;
//            }
//        }
//        if(!presente){
//            System.out.println(aluno + " não está presente");
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        10. Encontrar o índice: Escreva um algoritmo para encontrar o índice de um elemento específico em um
//            array de inteiros.

//        int[] inteiros = {1,2,3,4,5,6,7,8,9,10};
//        boolean presente = false;
//        int alvo = 5;
//
//        for(int i = 0; i < inteiros.length; i++){
//            if(inteiros[i] == alvo){
//                presente = true;
//                System.out.println(i);
//                break;
//            }
//        }
//        if(!presente){
//            System.out.println("Não existe esse número no array");
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        11. Comparar arrays: Crie dois arrays de inteiros e verifique se eles são iguais (ou seja, se contêm os mesmos
//            elementos na mesma ordem).

//        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
//        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
//        int contador = 0;
//
//        for(int i = 0; i < array1.length; i++){
//            if(array1[i] == array2[i]){
//                contador++;
//            }
//        }
//
//        if(contador == array1.length){
//            System.out.println("Os arrays são iguais");
//        }else{
//            System.out.println("Os arrays não são iguais");
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        12. Remover elemento: Desenvolva um algoritmo que remova um elemento específico de um array de inteiros
//            e exiba o array resultante.

//--------------------------------------------------------------------------------------------------------------------//

//        13. União de arrays: Escreva um algoritmo que una dois arrays de inteiros em um único array e exiba o array
//            resultante.

//--------------------------------------------------------------------------------------------------------------------//

//        14. Interseção de arrays: Crie um algoritmo que encontre e exiba os elementos comuns em dois arrays de
//            inteiros.

//--------------------------------------------------------------------------------------------------------------------//

//        15. Verificar se um array é palíndromo: Implemente um algoritmo que verifica se um array de caracteres
//            forma um palíndromo.

    }
}