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

        int idade = 35;
        float salario = 3.500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4300;
        boolean isDentroDaLeiMenorQueTrinta = idade > 30 && salario >= 4300;
        boolean isDentroDaLeiMenorQueTrintaESalarioCorrespondente = idade > 30 && salario <= 3500f;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrintaESalarioCorrespondente " + isDentroDaLeiMenorQueTrintaESalarioCorrespondente);

        //Operador OU (||): O operador ||, também chamado de OU ou OR avaliará o valor de duas expressões e se qualquer
        // uma duas forem verdadeiras ele retornará true, senão, será false.


        // && (AND) || (OR) ! (LOGICAL NOT)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //ATRIBUIÇÃO
        // = += -= *= /= %= (PARA POUPAR UM POUCO DE CÓDIGO, NO COMEÇO É BOM ESCREVER A EXPRESSÃO INTEIRA PARA ACOSTUMAR
        // MAS DEPOIS É BOM PARA POUPAR TEMPO.

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

        //OPERADORES UNÁRIOS
        //Operadores unários são operações que atuam em um único operando, ou seja, em uma única variável. São usados em matemática
        // e em linguagens de programação.

        //Exemplos de operadores unários Unário menos (-x), Unário mais (+x), Prefixo decremento (--x), Pós-fixo incremento (x++).

       int contador = 0;
       contador += 1;
        System.out.println(contador); //contador  = contador + 1

        int contador02 = 02;
        contador02 ++;
        System.out.println(contador02); //para somar mais rápido

        int contador03 = 07;
        contador03 --;
        System.out.println(contador03);

        //pode-se usar também da forma contrária, dessa forma:

        int contador04 = 10;
        --contador04;
        System.out.println(contador04); //para diminuir

        int contador05 = 25;
        ++contador05;;
        System.out.println(contador05);

        //usa-se dessa forma quando depende da forma que quer ser usado, quando coloca primeiro ele passa a conta primeiro
        //exemplo, se colocar dessa forma

        int contador06 = 0;
        System.out.println(contador06++); //aqui ele irá fazer primeiro a impressão, pois o ++ vem depois e como não tem nada atribuido a ele
        // só sera somado na próxima declaração! Por exemplo;
        System.out.println(contador06); // aqui ele já soma 1, pois ele pegou o ++ que seria a última atribuição e somou no contador06
        // respondendo 1
    }
}
