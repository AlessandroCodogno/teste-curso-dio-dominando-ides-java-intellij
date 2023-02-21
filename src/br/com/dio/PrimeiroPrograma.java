package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.setCor("verde");
        gato.setIdade(7);
        gato.setNome("Joaquim");
         System.out.println(gato);

        /*int a = 2;
        int b = 3;


        System.out.println("Hello World "+ ( a+b ));*/
    }
}
