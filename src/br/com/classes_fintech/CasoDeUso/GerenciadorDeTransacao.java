package br.com.classes_fintech.CasoDeUso;

import br.com.classes_fintech.Entidades.Transacao;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GerenciadorDeTransacao {

    public void criarTransacao( String categoria, Double valor) {
        Transacao transacao = new Transacao(categoria, valor);
    }

}