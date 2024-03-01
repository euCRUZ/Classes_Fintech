package br.com.classes_fintech.Entidades;

import br.com.classes_fintech.CasoDeUso.GerenciadorDeTransacao;

public class Transacao extends GerenciadorDeTransacao {
    private String categoria; //despesa ou receita
    private Double valor;

    public Transacao(String categoria, Double valor) {
        this.categoria = categoria;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }


}
