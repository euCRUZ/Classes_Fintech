package br.com.classes_fintech.Investimentos;

import br.com.classes_fintech.Investimentos.Investimento;

import java.util.ArrayList;

public class GerenciadorDeInvestimento {
    private ArrayList<Investimento> listaDeRendaFixa ;

    public GerenciadorDeInvestimento() {
        this.listaDeRendaFixa = new ArrayList<>();
    }

    public void adicionarInvestimento(String nomeDoInvestimento, Double valor, String data, Double taxaDeAplicacao){
        Investimento investimento = new Investimento(nomeDoInvestimento, valor, data, taxaDeAplicacao);

        listaDeRendaFixa.add(investimento);

    }

    public void editarInvestimento(Investimento investimento){
    }
}