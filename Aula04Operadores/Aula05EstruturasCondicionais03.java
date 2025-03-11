package Aula04Operadores;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
// OPERADORES TERNÁRIOS
        // O operador ternário é uma expressão condicional que avalia uma condição e retorna um valor.

        //(condição) ? verdadeiro : falso
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pra caridade";
        String mensagemNaoDoar = "Eu ainda não tenho condições";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; //sempre pega uma String, mensagemDoar o resulta é uma String...

        System.out.println(resultado);
// OU PODERIA FICAR DESSA FORMA:


        double salario02 = 17000;
        String resultado02 = salario02 > 7000 ? "Eu vou dar um presente pra Bela" : "Eu não posso dar o presente ainda";
        System.out.println(resultado02); //mais simplificado ainda!

        //Posso fazer dessa forma também:

        boolean isPossoComprar = salario02 > 27000 ? true : false;
        System.out.println(isPossoComprar);

    }

}
