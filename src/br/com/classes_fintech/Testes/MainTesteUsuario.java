package br.com.classes_fintech.Testes;
import br.com.classes_fintech.Usuario.CadastrarUsuario;
import br.com.classes_fintech.Usuario.UsuarioCadastrado;

import java.util.Scanner;

public class MainTesteUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("Digite o email: ");
        String email = entrada.nextLine();
        System.out.println("Digite o senha: ");
        String senha = entrada.nextLine();

        // Criação do usuário
        CadastrarUsuario user = new CadastrarUsuario(nome, sobrenome, email, senha);
        // Criação do usuário cadastrado
        UsuarioCadastrado userCadastrado = new UsuarioCadastrado(user);
        userCadastrado.exibirDadosUsuario();
        // Adiciona o usuário na lista de usuários
        userCadastrado.adicionarNaListaDeUsuario(user);

    }
}