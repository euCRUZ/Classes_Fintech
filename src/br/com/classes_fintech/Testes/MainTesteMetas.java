package br.com.classes_fintech.Testes;

import br.com.classes_fintech.Meta;

import java.util.Scanner;

public class MainTesteMetas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tipo da meta: ");
        String tipoMeta = entrada.nextLine();

        System.out.println("Digite a data de início da meta: ");
        String dataInicio = entrada.nextLine();

        System.out.println("Digite a data de término da meta: ");
        String dataTermino = entrada.nextLine();

        System.out.println("Digite o valor da meta: ");
        Double valorMeta = entrada.nextDouble();

//      Criação da meta
        Meta meta = new Meta(tipoMeta, dataInicio, dataTermino, valorMeta);
        meta.exibirMeta();

        meta.adicionarMeta(meta);

        meta.editarDataInicio(0, "01/01/2021");
        meta.exibirMeta();

    }
}
