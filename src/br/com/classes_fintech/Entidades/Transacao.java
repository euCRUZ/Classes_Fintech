package br.com.classes_fintech.Entidades;

import br.com.classes_fintech.CasoDeUso.GerenciadorDeTransacao;

public class Transacao extends GerenciadorDeTransacao {
    private String categoria; //despesa ou receita
    private Double valor;
    private String tipoDaTransacao;

    public Transacao(String tipoDaTransacao, String categoria, Double valor) {
        this.tipoDaTransacao = tipoDaTransacao;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}
