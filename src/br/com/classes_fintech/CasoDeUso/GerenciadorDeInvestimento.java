package br.com.classes_fintech.CasoDeUso;

import br.com.classes_fintech.Entidades.Investimento;
import br.com.classes_fintech.Entidades.Meta;

import java.util.ArrayList;

public class GerenciadorDeInvestimento extends Investimento {



    public GerenciadorDeInvestimento(String nomeDoInvestimento,
                                     Double valor,
                                     String data,
                                     Double taxaDeAplicacao) {
        super(nomeDoInvestimento, valor, data, taxaDeAplicacao);
    }


}