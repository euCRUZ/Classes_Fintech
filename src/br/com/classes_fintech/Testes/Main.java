package br.com.classes_fintech.Testes;

import br.com.classes_fintech.CasoDeUso.GerenciadorDeInvestimento;
import br.com.classes_fintech.Entidades.Investimento;
import br.com.classes_fintech.Entidades.Meta;
import br.com.classes_fintech.Entidades.Transacao;
import br.com.classes_fintech.Entidades.Usuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> listaDeusuariosCadastrados = new ArrayList<>();
        ArrayList<Transacao> listaDeTransacoes = new ArrayList<>();
        ArrayList<Meta> listaDeMetas = new ArrayList<>();
        ArrayList<Investimento> listaDeInvestimentos = new ArrayList<>();

        Usuario usuario = new Usuario("Carlos", "Silva", "carlossilva@gmail.com", "123456");
        listaDeusuariosCadastrados.add(usuario);

        Transacao transacao = new Transacao("Compra", "Carro", 200.000);
        listaDeTransacoes.add(transacao);

        Meta meta = new Meta("Carro", "01/01/2021", "01/01/2022", 200.000);
        listaDeMetas.add(meta);

        Investimento investimento = new Investimento("Poupança", 1000.00, "01/01/2021", 0.5);
        listaDeInvestimentos.add(investimento);

        GerenciadorDeInvestimento i1 = new GerenciadorDeInvestimento();
        i1.adicionarInvestimento("Poupança", 1000.00, "01/01/2021", 0.5);
    }
}
