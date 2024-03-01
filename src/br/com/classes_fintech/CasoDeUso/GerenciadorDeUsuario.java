package br.com.classes_fintech.CasoDeUso;
import br.com.classes_fintech.Entidades.Usuario;

import java.util.ArrayList;

public class GerenciadorDeUsuario extends Usuario {

    ArrayList<Usuario> listaDeusuariosCadastrados = new ArrayList<>();

    public GerenciadorDeUsuario(String nome, String sobrenome,
                                String email, String senha) {
        super(nome, sobrenome, email, senha);

    }

    public void exibirUsuario(ArrayList<Usuario> lista, String usuario){
        for (Usuario user : lista) {
            if (user.getNome().equals(usuario)) {
                System.out.println("Nome: " + user.getNome());
                System.out.println("Sobrenome: " + user.getSobrenome());
                System.out.println("Email: " + user.getEmail());
                System.out.println("Senha: " + user.getSenha());
            } else {
                System.out.println("Usuário não encontrado");
            }
        }
    }

    public void exibirListaUsuarios(ArrayList<Usuario> lista){
        for (Usuario user : lista) {
            System.out.println("Nome: " + user.getNome());
            System.out.println("Sobrenome: " + user.getSobrenome());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Senha: " + user.getSenha());
        }
    }

}
