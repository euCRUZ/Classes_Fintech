package br.com.classes_fintech.Entidades;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;

    public Usuario(String nome, String sobrenome, String email, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return PrimeiraLetraMaiuscula(nome);
    }

    public String getSobrenome() {
        return PrimeiraLetraMaiuscula(sobrenome);
    }

    private String PrimeiraLetraMaiuscula(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        } else {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

}