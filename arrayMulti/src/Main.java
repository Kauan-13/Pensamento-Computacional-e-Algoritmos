public class Main {
    public static void main(String[] args) {
//        int[][] multiplica = new int[10][10];
//
//        for(int i = 0; i < multiplica.length; i++) {
//            for(int j = 0; j < multiplica[0].length; j++) {
//                multiplica[i][j] = i * j;
//            }
//        }
//
//        System.out.println(multiplica[3][9]);

//        int[][] array1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int[][] array2 = {
//                {10, 11, 12},
//                {13, 14, 15},
//                {16, 17, 18}
//        };
//        int[][] resultado = new int[array1.length][array1[0].length];
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                resultado[i][j] = array1[i][j] + array2[i][j];
//            }
//        }
//
//        for (int i = 0; i < resultado.length; i++) {
//            for (int j = 0; j < resultado[i].length; j++) {
//                System.out.print(resultado[i][j] + " ");
//            }
//        }

        String[] nomes = {"Carlos", "Bruna", "Pedro", "José"};

        int[][] notas ={
                {7, 8, 9},
                {4, 5, 6},
                {3, 4, 5},
                {10, 8, 7}
        };

        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.println(nomes[i] + ": " + media);
        }
    }
}