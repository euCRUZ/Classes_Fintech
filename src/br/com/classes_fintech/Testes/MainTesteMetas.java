package br.com.classes_fintech.Testes;

import br.com.classes_fintech.Entidades.Meta;
import br.com.classes_fintech.Repositorio.RepositorioMeta;
import java.util.ArrayList;

public class MainTesteMetas {
        static RepositorioMeta repMeta = new RepositorioMeta();
        public static void main(String[] args) {

        preencherArray();
        repMeta.deletarMetaPorID(1);
        listarMetas();
        alterar();
        listarMetas();

    }

    public static void alterar(){
        Meta meta = new Meta();
        meta.setId(1);
        meta.setTipoMeta("POLICIAAAAA");
        meta.setDataInicio("01/01/2021");
        meta.setDataTermino("01/01/2022");
        meta.setValorMeta(10000.00);
        repMeta.atualizarMeta(meta);
    }

    public static void preencherArray(){

        Meta meta = new Meta();
        meta.setId(1);
        meta.setTipoMeta("Carro");
        meta.setDataInicio("01/01/2021");
        meta.setDataTermino("01/01/2022");
        meta.setValorMeta(10000.00);
        repMeta.salvarMeta(meta);

        Meta meta2 = new Meta();
        meta2.setId(2);
        meta2.setTipoMeta("Casa");
        meta2.setDataInicio("01/01/2021");
        meta2.setDataTermino("01/01/2022");
        meta2.setValorMeta(100000.00);
        repMeta.salvarMeta(meta2);
    }


    public static void listarMetas(){
        ArrayList<Meta> lista = new ArrayList<Meta>();

        lista = repMeta.buscarMeta();

        for (Meta meta : lista) {
            System.out.println("Metas cadastradas: ");
            System.out.println("Tipo da meta: " + meta.getTipoMeta());
            System.out.println("Data de início: " + meta.getDataInicio());
            System.out.println("Data de término: " + meta.getDataTermino());
            System.out.println("Valor da meta: " + meta.getValorMeta() + "\n");
        }
    }
}
