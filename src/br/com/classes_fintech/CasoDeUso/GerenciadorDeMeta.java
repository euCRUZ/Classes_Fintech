package br.com.classes_fintech.CasoDeUso;

import br.com.classes_fintech.Entidades.Meta;

import java.util.ArrayList;

public class GerenciadorDeMeta extends Meta {
    private ArrayList<Meta> listaDeMetas = new ArrayList<>();

    public GerenciadorDeMeta(ArrayList<Meta> listaDeMetas, String nomeMeta, String dataInicio, String dataTermino, double valorMeta) {
        super(listaDeMetas, nomeMeta, dataInicio, dataTermino, valorMeta);
        listaDeMetas.add(this);
    }

    public void exibirInformacoesMeta(ArrayList<Meta> listaDeMetas, String nomeMeta) {
        for (Meta meta : listaDeMetas) {
            if (meta.getTipoMeta().equals(nomeMeta)) {
                System.out.println("Nome da meta: " + meta.getTipoMeta());
                System.out.println("Data de início: " + meta.getDataInicio());
                System.out.println("Data de término: " + meta.getDataTermino());
                System.out.println("Valor da meta: " + meta.getValorMeta());
            }
        }
    }

    public void exibirListaDeMetas(ArrayList<Meta> listaDeMetas) {
        for (Meta meta : listaDeMetas) {
            System.out.println("\nNome da meta: " + meta.getTipoMeta());
            System.out.println("Data de início: " + meta.getDataInicio());
            System.out.println("Data de término: " + meta.getDataTermino());
            System.out.println("Valor da meta: " + meta.getValorMeta());
        }
    }

}
