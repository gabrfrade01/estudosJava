package Aula04Operadores;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade > 15  && idade <18 categoria juvenil
        //idade >= 18 categoria adulto

        int idade = 20;
        if (idade < 15) {
            System.out.println("Categoria Infantil");

        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");

        } else {
            System.out.println("Categoria adulto");
        }
        // OUU DESSA FORMA:

        int idade02 = 10;
        String categoria;
        if (idade02 < 15) {
            categoria = "Infantil";
        } else if (idade02 >= 15) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria); //nunca esquecer o sout KKKK
    }
}
