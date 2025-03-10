package Aula04Operadores;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        if (true) { //só executa se o boolean dentro do IF for true, false ele não executa!
            System.out.println("Dentro do IF"); //sempre que for utilizar IF, tem que ser dessa forma, não
            // pode esquecer de colocar {} e sempre é utilizado em forma de boolean (true or false)
            //pode-se omitir as {} (chaves) quando se vai colocar apenas um bloco de instrução dentro do if
            // mas não é recomendado pois pode causar confusão!!! Se não é recomendado, não utilizar!!!

            int idade = 23;
            boolean isAutorizadoComprarBebida = idade >= 18;

            if (isAutorizadoComprarBebida) {
                System.out.println("Você pode comprar bebida alcólica, você tem " + idade); //exemplo 01

            }

            int idade02 = 15;

            if (idade >= 18) {
                System.out.println("Você não pode comprar bebida alcólica, você tem " + idade02); //exemplo 02
            }

            int idade04 = 14;
            boolean isNaoAutorizadoAComprar = idade04 >= 18;
            if (isNaoAutorizadoAComprar == false) {
                System.out.println("Você não pode comprar bebida alcólica. ");

            }
            // Usar == false  ou ! na frente é a mesma coisa...  (

            int idade05 = 14;
            boolean isAutorizado = idade05 >= 18;
            if(!isAutorizado){ //se lê "Se não autorizado..."
                System.out.println("Não autorizado, você tem "+ idade05);
            }
        }

    }
}
