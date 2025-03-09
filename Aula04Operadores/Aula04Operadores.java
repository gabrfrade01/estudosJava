package Aula04Operadores;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        // soma, divisão, multiplicação e subtração = + / * -
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado + " esse é o resultado");
        // o resultado de operação de números inteiros, sempre resultará em número inteiro
        // exemplo;
        System.out.println(numero01 / numero02); //resultado é zero pois são dois números inteiros
        System.out.println(numero01 / (double) numero02); // resultado é 0,5 pois o (double) na frente transformou o numero02

        // % é o resto da divisão (bom para identificar se é um número par ou impar)

        int resto = 20 % 2;
        System.out.println(resto);  //valor par

        int resto02 = 21 % 2;
        System.out.println(resto02); //valor impar

        //< ou > boolean para identificar valores maiores e menores
        //<= ou >= == (comparaçãp de igualdade) != (serve para ver se são desiguais)
        // (SEMPRE RETORNAM VALORES BOOLEANOS, SÃO OPERADORES LÓGICOS)
        // semrpe que for usar esses operadores lógicos, deve colocar booelan na frente
        // exemplo; boolean isDezMaiorqueVinte = 10 > 20;


        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        //operadores lógicos && (AND/E) || (or/OU) ! (logical NOT/negação)

        //As operações lógicas são realizadas usando operadores booleanos. Perdoe a tautologia, mas é exatamente assim que as coisas
        // são. Operações lógicas básicas (em programação e matemática) podem ser aplicadas a argumentos lógicos (operandos) e
        // também podem ser usadas para formar expressões mais complexas, semelhantes às operações aritméticas com números.
        // Por exemplo a expressão:

        //Operador OU (||): O operador ||, também chamado de OU ou OR avaliará o valor de duas expressões e se qualquer
        // uma duas forem verdadeiras ele retornará true, senão, será false

        int idade = 35;
        float salario = 3.500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4300;
        boolean isDentroDaLeiMenorQueTrinta = idade > 30 && salario >= 4300;
        boolean isDentroDaLeiMenorQueTrintaESalarioCorrespondente = idade > 30 && salario <= 3500f;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrintaESalarioCorrespondente " + isDentroDaLeiMenorQueTrintaESalarioCorrespondente);

        // && (AND) || (OR) ! (LOGICAL NOT)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //ATRIBUIÇÃO
        // = += -= *= /= %= (PARA POUPAR UM POUCO DE CÓDIGO, NO COMEÇO É BOM ESCREVER A EXPRESSÃO INTEIRA PARA ACOSTUMAR
        // MAS DEPOIS É BOM PARA POUPAR TEMPO

        double bonus01 = 150f;
        double bonus05 = 150f + 200;
        System.out.println(bonus05); //O que seria escrito assim, fica conforme os exemplos abaixo !!

        double bonus = 1000f;
        bonus = 1800f;
        System.out.println(bonus); //para somar!

        double bonus02 = 1800f;
        bonus02 -= 1000f;
        System.out.println(bonus02); //para diminuir!

        double bonus03 = 1000f;
        bonus03 /= 2;
        System.out.println(bonus03); //para dividir!

        double bonus04 = 500f;
        bonus04 *= 5;
        System.out.println(bonus04); //para multiplicar!

        double bonus06 = 25f;
        bonus06 %= 2;
        System.out.println(bonus06); //para mostrar o resto!
    }
}
