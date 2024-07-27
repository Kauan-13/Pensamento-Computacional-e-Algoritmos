import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String palavra;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        palavra = leitor.next();

        // 1

        String outraPalavra = palavra.replace("a","");
        outraPalavra = outraPalavra.replace("e","");
        outraPalavra = outraPalavra.replace("i", "");
        outraPalavra = outraPalavra.replace("o","");
        outraPalavra = outraPalavra.replace("u","");

        System.out.println("1 - " + outraPalavra);

        // 2
        System.out.print("2 - ");
        for (int i = palavra.length() - 1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }
        System.out.println("");

        // 3

        System.out.println("3");

        char[] letrasEncontradas = new char[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            boolean encontrou = false;
            for (int j = 0; j < letrasEncontradas.length; j++) {
                if (letra == letrasEncontradas[j]) {
                    encontrou = true;
                    break;
                }
            }
            if (!encontrou) {
                letrasEncontradas[i] = letra;
                int contador = 0;
                for (int j = 0 ; j < palavra.length(); j++) {
                    if(palavra.charAt(j) == letra){
                        contador++;
                    }
                }
                System.out.println("A letra " + letra + " apareceu " + contador + " vezes");
            }
        }

    }
}