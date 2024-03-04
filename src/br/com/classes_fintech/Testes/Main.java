package br.com.classes_fintech.Testes;

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
    public static <T> void apagarElementoDaLista(int index, ArrayList<T> lista) {
        lista.remove(index);
    }
}