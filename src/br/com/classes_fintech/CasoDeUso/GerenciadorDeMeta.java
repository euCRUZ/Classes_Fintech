package br.com.classes_fintech.CasoDeUso;

import br.com.classes_fintech.Entidades.Meta;

public class GerenciadorDeMeta {

    public void criarMeta(String nome, String dataInicio, String dataTermino, int valor) {
        Meta meta = new Meta (nome, dataInicio, dataTermino, valor);
    }


}
