package br.com.digitalhouse.desafioandroid.listarestaurantes.model;

public class Restaurantes {
    private int fotoResturante;
    private String nomeRestaurante;
    private String enderecoRestaurante;
    private String horarioRestaurante;

    public Restaurantes() {
    }

    public Restaurantes(int fotoResturante, String nomeRestaurante, String enderecoRestaurante, String horarioRestaurante) {
        this.fotoResturante = fotoResturante;
        this.nomeRestaurante = nomeRestaurante;
        this.enderecoRestaurante = enderecoRestaurante;
        this.horarioRestaurante = horarioRestaurante;
    }

    public int getFotoResturante() {
        return fotoResturante;
    }

    public void setFotoResturante(int fotoResturante) {
        this.fotoResturante = fotoResturante;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getEnderecoRestaurante() {
        return enderecoRestaurante;
    }

    public void setEnderecoRestaurante(String enderecoRestaurante) {
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public String getHorarioRestaurante() {
        return horarioRestaurante;
    }

    public void setHorarioRestaurante(String horarioRestaurante) {
        this.horarioRestaurante = horarioRestaurante;
    }
}
