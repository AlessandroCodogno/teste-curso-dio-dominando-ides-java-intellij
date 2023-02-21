package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();


        Livro livro1 = new Livro(" O problema do 3 copos", 300);
        System.out.println(livro1);
        gato.setCor("verde");
        gato.setIdade(7);
        gato.setNome("Joaquim");
         System.out.println(gato);

        /*int a = 2;
        int b = 3;


        System.out.println("Hello World "+ ( a+b ));*/
    }
}

class Livro{
    private String nome;
    private Integer numPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;


    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}
