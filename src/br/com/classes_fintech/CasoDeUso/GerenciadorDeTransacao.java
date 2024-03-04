package br.com.classes_fintech.CasoDeUso;

import br.com.classes_fintech.Entidades.Transacao;

import java.util.ArrayList;

public class GerenciadorDeTransacao extends Transacao {
    ArrayList<Transacao> listaDeTransacoes = new ArrayList<>();
    public GerenciadorDeTransacao(ArrayList<Transacao> listaDeTodasTransacao, String categoria, double valor) {
        super(listaDeTodasTransacao, categoria, valor);
        listaDeTransacoes.add(this);
        listaDeTodasTransacao.add(this);
    }



    public void adicionarItemNaListaDeTransacao() {
        if (listaDeTransacoes.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (Transacao transacao : listaDeTransacoes) {
                System.out.println(transacao.getCategoria());
                System.out.println(transacao.getValor());
            }
        }
    }
    public void exibirListaDeTransacao() {
        if (listaDeTransacoes.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (Transacao transacao : listaDeTransacoes) {
                System.out.println(transacao.getCategoria());
                System.out.println(transacao.getValor());
            }
        }
    }
}