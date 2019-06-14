package br.com.digitalhouse.desafioandroid.listacardapio.model;

public class Cardapio {
    private String nomePrato;
    private int fotoPrato;

    public Cardapio() {
    }

    public Cardapio(String nomePrato, int fotoPrato) {
        this.nomePrato = nomePrato;
        this.fotoPrato = fotoPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public int getFotoPrato() {
        return fotoPrato;
    }

    public void setFotoPrato(int fotoPrato) {
        this.fotoPrato = fotoPrato;
    }
}
