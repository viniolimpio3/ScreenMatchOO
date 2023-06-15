package com.vini.screenmatch.models;

public class Serie extends Titulo {

    public Serie(String nome, int anoLancamento, int temporadas, int episodiosPorTemporasda) {
        super(nome, anoLancamento);
        this.setTemporadas(temporadas);
        this.setEpisodiosPorTemporada(episodiosPorTemporasda);
    }

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporasda;
    private int minutosPorEpisodio;



    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporasda() {
        return episodiosPorTemporasda;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporasda) {
        this.episodiosPorTemporasda = episodiosPorTemporasda;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
