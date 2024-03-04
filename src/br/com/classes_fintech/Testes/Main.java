package br.com.classes_fintech.Testes;


import br.com.classes_fintech.Entidades.Investimento;
import br.com.classes_fintech.Entidades.Meta;
import br.com.classes_fintech.Entidades.Transacao;
import br.com.classes_fintech.Entidades.Usuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> listaDeusUsuariosCadastrados = new ArrayList<>();
        ArrayList<Transacao> listaDeTodasTransacoes = new ArrayList<>();
        ArrayList<Meta> listaDeMetas = new ArrayList<>();
        ArrayList<Investimento> listaDeInvestimentos = new ArrayList<>();


    }
    public static void exibirTodasTransacoes(ArrayList<Transacao> listaDeTodasTransacoes) {
        if (listaDeTodasTransacoes.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (Transacao transacao : listaDeTodasTransacoes) {
                System.out.println(transacao.getCategoria());
                System.out.println(transacao.getValor());
            }
        }
    }

    public static void exibirTodosInvestimentos(ArrayList<Investimento> listaDeInvestimentos) {
        if (listaDeInvestimentos.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (Investimento investimento : listaDeInvestimentos) {
                System.out.println(investimento.getNomeDoInvestimento());
                System.out.println(investimento.getValor());
                System.out.println(investimento.getData());
                System.out.println(investimento.getTaxaDeAplicacao());
            }
        }
    }

    public void exibirMeta(ArrayList<Meta> listaDeMetas, String nomeMeta) {
        for (Meta meta : listaDeMetas) {
            if (meta.getTipoMeta().equals(nomeMeta)) {
                System.out.println("Nome da meta: " + meta.getTipoMeta());
                System.out.println("Data de início: " + meta.getDataInicio());
                System.out.println("Data de término: " + meta.getDataTermino());
                System.out.println("Valor da meta: " + meta.getValorMeta());
            } else {
                System.out.println("Meta não encontrada");
            }
        }
    }
    public static <T> void apagarElementoDaLista(int index, ArrayList<T> lista) {
        lista.remove(index);
    }
}