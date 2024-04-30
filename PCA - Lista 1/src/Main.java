public class Main {
    public static void main(String[] args) {
//        1. Declare duas variáveis numéricas e atribua qualquer valor a elas. Teste qual é a maior delas e imprima no
//        terminal o resultado.

//        int n1 = 2;
//        int n2 = 5;
//        int maior = n1;
//
//        if (n2 > n1) {
//            maior = n2;
//        }
//        System.out.println(maior + " é maior número");

//--------------------------------------------------------------------------------------------------------------------//

//        2. Declare uma variável numérica e atribua um ano de nascimento a ela. Teste a variável para saber se a
//        pessoa poderá votar ou não neste ano. Escreva uma mensagem com o resultado no terminal.

//        int anoNascimento = 2010;
//        int anoAtual = 2024;
//
//        if ((anoAtual - anoNascimento) > 16) {
//            System.out.println("Pode Votar");
//        } else {
//            System.out.println("Não pode votar");
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        3. Escreva um programa que recebe um inteiro e diga se é par ou ímpar. Use o operador matemático %
//           (resto da divisão ou módulo).

//        int n = 12;
//
//        if (n%2 == 0){
//            System.out.println(n + " é par!");
//        }else{
//            System.out.println(n + " é impar!");
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        4. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o
//           número 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja
//           válida. ACESSO NEGADO caso a senha seja inválida.

//        String senha = "1234";
//
//        if(senha.equals("1234")){
//            System.out.println("ACESSO PERMITIDO!");
//        }else{
//            System.out.println("ACESSO NEGADO!");
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        5. As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem
//           compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e
//           escreva o valor total da compra.

//        int macas = 12;
//        double preco;
//
//        if(macas < 12){
//            preco = macas * 0.30;
//            System.out.println(macas + " Maças custam R$" + preco);
//        }else{
//            preco = macas * 0.25;
//            System.out.println(macas + " Maças custam R$" + preco);
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        6. Faça um programa para a leitura de duas notas parciais de um aluno.
//           • A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
//           • A mensagem “Aprovado com Distinção”, se a média for igual a dez;
//           • A mensagem “Reprovado” se a média for menor de do que sete;

//        double n1 = 10;
//        double n2 = 10;
//        double media = (n1 + n2)/2;
//
//        if(media >= 7){
//            if(media == 10){
//                System.out.println("Aprovado com Distinção");
//                return;
//            }
//            System.out.println("Aprovado");
//        }else{
//            System.out.println("Reprovado");
//        }

//--------------------------------------------------------------------------------------------------------------------//

//        7. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino 2:masculino) de uma
//           pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
//           • para homens: (72.7 * Altura) – 58
//           • para mulheres: (62.1 * Altura) – 44.7

//        double altura = 1.70;
//        int sexo = 2;
//        double pesoIdeal;
//
//        if(sexo == 1){
//            pesoIdeal = (62.1 * altura) - 44.7;
//        }else{
//            pesoIdeal = (72.7 * altura) - 58;
//        }
//        System.out.println("Seu peso ideal é: " + pesoIdeal);

//--------------------------------------------------------------------------------------------------------------------//

//        8. Faça um programa que leia o ano de nascimento de um nadador e classifique-o numa das seguintes
//           categorias abaixo:
//           • Adulto (idade >= 18);
//           • Juvenil (idade >= 14);
//           • Infantil (idade >=9);
//           • Mirim (Idade < 9).

//        int anoNascimento = 2015;
//        int anoAtual = 2024;
//        int idade = anoAtual - anoNascimento;
//        String categoria;
//
//        if(idade >= 18){
//            categoria = "Adulto";
//        }else if(idade >= 14){
//            categoria = "Juvenil";
//        }else if (idade >= 9){
//            categoria = "Infantil";
//        }else{
//            categoria = "Mirim";
//        }
//        System.out.println("A sua categoria é: " + categoria);

//--------------------------------------------------------------------------------------------------------------------//

//        9. Declare três variáveis numéricas e atribua qualquer valor a elas. Escreva um programa que sempre
//           imprima as variáveis na ordem crescente.

//        int n1 = 89;
//        int n2 = 123;
//        int n3 = 64;
//        int n4;
//
//        if(n1 > n2){
//            n4 = n1;
//            n1 = n2;
//            n2 = n4;
//        }
//
//        if(n1 > n3){
//            n4 = n1;
//            n1 = n3;
//            n3 = n4;
//        }
//
//        if(n2 > n3){
//            n4 = n2;
//            n2 = n3;
//            n3 = n4;
//        }
//        System.out.println(n1 + " - " + n2 + " - " + n3);

//--------------------------------------------------------------------------------------------------------------------//

//        10. Escreva um programa um programa com duas variáveis numéricas e um caracter que representará uma
//            das operações aritméticas básica (+, –, *, /). O programa deve realizar a operação indicada pelo caractere
//            sobre as variáveis numéricas lidos. O programa deve imprimir os valores e o resultado da operação
//            realizada sobre eles, como mostra o exemplo a seguir:
//            Primeiro valor: 4.5
//            Segundo valor: 5
//            Operador: +
//            Resultado: 4.5 + 5.0 = 9.5

//        double n1 = 3;
//        double n2 = 5;
//        double resultado = 0;
//        String operador = "+";
//
//        if(operador == "+"){
//            resultado = n1 + n2;
//        }else if(operador == "-"){
//            resultado = n1 - n2;
//        }else if(operador == "*"){
//            resultado = n1 * n2;
//        }else if(operador == "/"){
//            resultado = n1/n2;
//        }
//        System.out.println("Resultado é: " + resultado);

//--------------------------------------------------------------------------------------------------------------------//

//        11. Uma empresa resolveu dar um aumento de salário aos seus colaboradores e lhe contratou para desenvolver
//            o programa que calculará os reajustes. Faça um programa que recebe o salário de um colaborador e o
//            reajuste segundo o seguinte critério, baseado no salário atual;
//            • Salários até R$ 280,00 (incluindo): aumento de 20%;
//            • Salários entre R$ 280,00 e R$700,00: aumento de 15%;
//            • Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
//            • Salários de R$ 1500,00 em diante: aumento de 5%.
//            Após o aumento ser realizado; informe na tela:
//            • O salário antes do reajuste;
//            • O percentual de aumento aplicado;
//            • O valor do aumento;
//            • O novo salário, após o aumento.

//        double salarioInicial = 1412;
//        double percentual;
//        double valorAumento;
//        double salarioFinal;
//
//        if (salarioInicial > 1500) {
//            percentual = 5;
//            valorAumento = salarioInicial * (percentual / 100);
//            salarioFinal = salarioInicial + valorAumento;
//        }else if (salarioInicial > 700) {
//            percentual = 10;
//            valorAumento = salarioInicial * (percentual / 100);
//            salarioFinal = salarioInicial + valorAumento;
//        }else if (salarioInicial > 280) {
//            percentual = 15;
//            valorAumento = salarioInicial * (percentual / 100);
//            salarioFinal = salarioInicial + valorAumento;
//        }else{
//            percentual = 20;
//            valorAumento = salarioInicial * (percentual / 100);
//            salarioFinal = salarioInicial + valorAumento;
//        }
//        System.out.println("Salário antes do ajuste: R$" + salarioInicial +
//                "\n Percentual de aumento: " + percentual +"%" +
//                "\n Valor aumento: R$" + valorAumento +
//                "\n Novo Salário: R$" + salarioFinal);
    }
}