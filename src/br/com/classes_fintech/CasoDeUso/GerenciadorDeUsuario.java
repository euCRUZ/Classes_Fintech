package br.com.classes_fintech.CasoDeUso;
import br.com.classes_fintech.Entidades.Usuario;

public class GerenciadorDeUsuario {

    public void criarUsuario(String nome, String sobrenome, String email, String senha){
        Usuario usuario = new Usuario(nome, sobrenome, email, senha);
    }

}
