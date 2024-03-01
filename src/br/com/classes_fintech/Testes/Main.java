package br.com.classes_fintech.Testes;

import br.com.classes_fintech.CasoDeUso.GerenciadorDeInvestimento;
import br.com.classes_fintech.CasoDeUso.GerenciadorDeTransacao;
import br.com.classes_fintech.Entidades.Investimento;
import br.com.classes_fintech.Entidades.Meta;
import br.com.classes_fintech.Entidades.Transacao;
import br.com.classes_fintech.Entidades.Usuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> listaDeusuariosCadastrados = new ArrayList<>();
        ArrayList<Transacao> listaDeTodasTransacoes = new ArrayList<>();
        ArrayList<Meta> listaDeMetas = new ArrayList<>();
        ArrayList<Investimento> listaDeInvestimentos = new ArrayList<>();


        GerenciadorDeTransacao transacao_teste = new GerenciadorDeTransacao(listaDeTodasTransacoes,"Carro", 300.00);
        GerenciadorDeTransacao transacao_teste2 = new GerenciadorDeTransacao(listaDeTodasTransacoes,"Celular", 500.00);
        transacao_teste.exibirListaDeTransacao();
        transacao_teste2.exibirListaDeTransacao();
        exibirTodasTransacoes(listaDeTodasTransacoes);



    }
    public static void exibirTodasTransacoes(ArrayList<Transacao> listaDeTodasTransacoes) {
        if (listaDeTodasTransacoes.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (Transacao transacao : listaDeTodasTransacoes) {
                System.out.println(transacao.getValor());
            }
        }
    }
}
