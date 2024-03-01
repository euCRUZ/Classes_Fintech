package br.com.classes_fintech.CasoDeUso;

import br.com.classes_fintech.Entidades.Transacao;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GerenciadorDeTransacao {

    public void criarTransacao(String receita_Ou_Despesa, String categoria, Double valor) {
        Transacao transacao = new Transacao(receita_Ou_Despesa, categoria, valor);
    }

}