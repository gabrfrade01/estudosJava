package Aula04Operadores;

public class Aula06EstruturasCondicionais {
    public static void main(String[] args) {
        //OPERADOR SWITCH
        //CHAR, INT, BYTE, SHORT, ENUM, String só isso que pode utilizar dentro do Switch ()

        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sáb");
                break;
            default:
                System.out.println("Opção Inválida"); //lugar onde coloca default não importa, mas lembrar do break
                break; // e sempre que for criar um case igual no exemplo, sempre lembrar do Default!!! E do break logo
            // depois de cada CASE!

        }
        byte dias01 = 8;
        switch (dias01) {
            case 8:
                System.out.println("DIA DE PAGAMENTO");
                break;
            case 9:
                System.out.println("DIA NORMAL");
                break;
            default:
                System.out.println("Opção Inválida Do dia de Pagamento");
        }
        byte dia02 = 20;
        switch (dia02){
            case 10:
                System.out.println("dia 10");
                break;
            case 20:
                System.out.println("dia 20");
                break;
            default:
                System.out.println("Dia inválido");

        }
    }
}
