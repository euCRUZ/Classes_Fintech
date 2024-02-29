package br.com.classes_fintech.CasoDeUso;

import br.com.classes_fintech.Entidades.Investimento;

import java.util.ArrayList;

public class GerenciadorDeInvestimento {

    public void adicionarInvestimento(String nomeDoInvestimento, Double valor, String data, Double taxaDeAplicacao){
        Investimento investimento = new Investimento(nomeDoInvestimento, valor, data, taxaDeAplicacao);

        listaDeRendaFixa.add(investimento);

    }

    public void editarInvestimento(Investimento investimento){
    }
}