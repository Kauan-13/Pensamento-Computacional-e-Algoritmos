public class Main {

    static final double PI = 3.14;

    public static void main(String[] args) {

//        System.out.println(calcularArea(calcularPerimetro(3)));
//
//        System.out.println(somaDigitos(3789));

//        int[] numeros = {18, 48};
//
//        System.out.println(calcularMDCArr(numeros));
//
//        System.out.println(converterCParaF(23));
//
//        int[] vetor = {92, 68, 11, 47, 2, 15, 53, 84, 35};
//
//        ordenarIntCrescente(vetor);
//
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.print(vetor[i] + " ");
//        }

        char[] letras = {'j', 'k', 'r', 'b', 'm', 'y', 'x', 'a'};

        ordenarCharCrescente(letras);

        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + " ");
        }
    }

    static double calcularPerimetro(double raio){
        double perimetro = 2 * PI * raio;
        return perimetro;
    }


    static double calcularArea(double perimetro){
        double area = (perimetro * perimetro)/(4 * PI);
        return area;
    }

    static int somaDigitos(int numero){
        int soma = 0;
        while(numero > 0){
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    static int calcularMDC(int a, int b){
        int mdc = 1;
        if(a < b){
            mdc = a;
        }else mdc = b;

        for ( ; mdc > 0; mdc--) {
            if(a % mdc == 0 && b % mdc == 0){
                break;
            }
        }
        return mdc;
    }


    static int calcularMDCFacil(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }


    static int calcularMDCArr(int[] arr){
        int mdc = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mdc = calcularMDC(mdc, arr[i]);
        }
        return mdc;
    }


    static double converterCParaF(double celcius){
        return (celcius * 9/5) + 32;
    }


    static int[] ordenarIntCrescente(int[] vetor){
        for (int j = 0; j < vetor.length; j++) {
            for (int i = 0; i < vetor.length - 1 - j; i++){
                if(vetor[i] > vetor[i+1]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                }
            }
        }
        return vetor;
    }

    static char[] ordenarCharCrescente(char[] vetor){
        for (int j = 0; j < vetor.length; j++) {
            for (int i = 0; i < vetor.length - 1 - j; i++){
                if(vetor[i] > vetor[i+1]){
                    char aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                }
            }
        }
        return vetor;
    }


}