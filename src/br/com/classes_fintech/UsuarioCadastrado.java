package br.com.classes_fintech;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioCadastrado extends CadastrarUsuario {
    private int idUsuario;
    private String telefone;
    private ArrayList<CadastrarUsuario> usuariosCadastrados;

    public UsuarioCadastrado(CadastrarUsuario usuario) {
        super(usuario.getNome(), usuario.getSobrenome(), usuario.getEmail(), usuario.getSenha());
    }

    public void exibirDadosUsuario() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha: " + getSenha());
    }

    public void adicionarNaListaDeUsuario(CadastrarUsuario usuario){
        ArrayList<CadastrarUsuario> usuariosCadastrados = new ArrayList<>();

        if(usuario.getNome().isEmpty() || usuario.getSobrenome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getSenha().isEmpty() ){
            System.out.println("Não foi possível cadastrar o usuário, pois um ou mais campos estão vazios.");
        } else {
            usuariosCadastrados.add(usuario);
            System.out.println("Usuário cadastrado com sucesso!");
        }
    }

    public void criarTransacao(GerenciadorDeTransacao transacao){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da transação: ");

    }

}
