package com.vini.screenmatch.models;
import com.vini.screenmatch.interfaces.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme(String nome, int anoLancamento) {
        super(nome,anoLancamento);
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) super.media() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " Ano de lançamento: " + this.getAnoLancamento();
    }
}
