package br.com.classes_fintech.CasoDeUso;

import br.com.classes_fintech.Entidades.Investimento;
import br.com.classes_fintech.Entidades.Meta;
import br.com.classes_fintech.Entidades.Transacao;

import java.util.ArrayList;

public class GerenciadorDeInvestimento extends Investimento {
    ArrayList<Investimento> listaDeInvestimento = new ArrayList<>();

    public GerenciadorDeInvestimento(ArrayList<Investimento> listaDeTodosInvestimento, String nomeDoInvestimento, Double valor, String data, Double taxaDeAplicacao) {
        super(listaDeTodosInvestimento, nomeDoInvestimento, valor, data, taxaDeAplicacao);
        listaDeInvestimento.add(this);
        listaDeTodosInvestimento.add(this);
    }

    public void exibirInvestimentos() {
        if (listaDeInvestimento.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (Investimento investimento : listaDeInvestimento) {
                System.out.println(investimento.getNomeDoInvestimento());
                System.out.println(investimento.getValor());
                System.out.println(investimento.getData());
                System.out.println(investimento.getTaxaDeAplicacao());
            }
        }
    }

}