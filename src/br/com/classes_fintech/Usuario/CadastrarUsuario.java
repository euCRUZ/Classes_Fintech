package br.com.classes_fintech.Usuario;

import java.util.Scanner;

public class CadastrarUsuario {
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;

    public CadastrarUsuario(String nome, String sobrenome, String email, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

}
