package com.vini.screenmatch.models;

// Na herança, essa classe vai representar um título no cartaz
public abstract class Titulo implements Comparable<Titulo> {

    public Titulo(String nome, int anoLancamento){
        this.setNome(nome);
        this.setAnoLancamento(anoLancamento);
    }

    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;

    private double somaDeAvaliacoes;
    private int totalDeAvaliacoes;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getTotalDeAvaliacoes(){
        return this.totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void avalia(int nota){
        this.somaDeAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public double media(){
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo t) {
        return this.getNome().compareTo(t.getNome());
    }
}
