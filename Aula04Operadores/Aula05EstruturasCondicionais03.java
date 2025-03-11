package Aula04Operadores;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
// OPERADORES TERNÁRIOS
        // O operador ternário é uma expressão condicional que avalia uma condição e retorna um valor.
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pra caridade";
        String mensagemNaoDoar = "Eu ainda não tenho condições";
        String resultado;
        if (salario >= 5000) {
            resultado = mensagemDoar;
        }
        else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
