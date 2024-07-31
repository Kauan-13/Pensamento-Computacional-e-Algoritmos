import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. Contar Caracteres: Escreva um programa que leia uma string fornecida pelo usuário e conte o número de
        //caracteres (incluindo espaços)

//        Scanner leitor = new Scanner(System.in);
//
//        System.out.println("Digite um texto: ");
//        String texto = leitor.nextLine();
//
//        System.out.println(texto.length());

        //2. Palíndromo: Escreva um programa que verifique se uma string fornecida pelo usuário é um palíndromo
        //(lê-se da mesma forma de trás para frente).

//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Digite um texto");
//        String texto = leitor.nextLine();
//        String novoTexto = texto.toLowerCase();
//        novoTexto = novoTexto.replaceAll(" ", "");
//        String textoInvertido = "";
//
//        for (int i = novoTexto.length() - 1; i >= 0; i--) {
//            textoInvertido += novoTexto.charAt(i);
//        }
//
//        if (novoTexto.equals(textoInvertido)) {
//            System.out.println(texto + " é um palíndromo");
//        }else{
//            System.out.println(texto + " não é um palíndromo");
//        }

        // Resolução Professor

//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Digite um texto");
//        String texto = leitor.nextLine();
//        texto = texto.toLowerCase();
//        texto = texto.replace(" ", "");
//        boolean palindromo = true;
//
//        for (int i = 0; i < texto.length()/2; i++) {
//            if (texto.charAt(i) != texto.charAt(texto.length()-i-1)) {
//                palindromo = false;
//                break;
//            }
//        }
//
//        if (palindromo) {
//            System.out.println("É palíndromo");
//        }else{
//            System.out.println("Não é palíndromo");
//        }


        // 3. Contar Vogais: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.

//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Digite um texto");
//        String texto = leitor.nextLine();
//        String textoMinusculo = texto.toLowerCase();
//        char[] vogais = {'a', 'e', 'i', 'o', 'u'
//                        , 'á', 'é', 'í', 'ó', 'ú'
//                        , 'à', 'ã', 'õ'};
//        int contador = 0;
//
//        for (int i = 0; i < texto.length(); i++) {
//            char letra = textoMinusculo.charAt(i);
//            for (int j = 0; j < vogais.length; j++) {
//                if (letra == vogais[j]) {
//                    contador++;
//                }
//            }
//        }
//
//        System.out.println("A palavra " + texto + " possui " + contador + " vogais");

//        4. Remover Espaços: Escreva um programa que remova todos os espaços de uma string fornecida pelo
//        usuário.

//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Digite um texto");
//        String texto = leitor.nextLine();
//        String novoTexto = texto.replace(" ","");
//
//        System.out.println(novoTexto);

//        //5. Substituir Caracteres: Escreva um programa que substitua todos os espaços em uma string por um
//        //caractere específico (por exemplo, ’-’). A string e o caractere devem ser fornecidos pelo usuário.
//
//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Digite um texto");
//        String texto = leitor.nextLine();
//        System.out.println("Digite um caracter para substituir espaços");
//        char caracter = leitor.next().charAt(0);
//        String novoTexto = texto.replace(' ',caracter);
//
//        System.out.println(novoTexto);
    }
}