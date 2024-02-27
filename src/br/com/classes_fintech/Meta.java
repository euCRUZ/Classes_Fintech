package br.com.classes_fintech;

import java.util.ArrayList;

public class Meta {
    private String tipoMeta;
    private String dataInicio;
    private String dataTermino;
    private Double valorMeta;
    private ArrayList<Meta> metas;

    public Meta(String tipoMeta, String dataInicio,  String dataTermino, Double valorMeta){
        this.tipoMeta = tipoMeta;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorMeta = valorMeta;
    }

    public String getTipoMeta() {
        return tipoMeta;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public Double getValorMeta() {
        return valorMeta;
    }

    public void exibirMeta(){
        System.out.println("\nTipo da meta: " + getTipoMeta());
        System.out.println("Data de início: " + getDataInicio());
        System.out.println("Data de término: " + getDataTermino());
        System.out.println("Valor da meta: " + getValorMeta());
    }



    public void adicionarMeta(Meta meta){
        ArrayList<Meta> metas = new ArrayList<>();

        if(meta.getTipoMeta().isEmpty() || meta.getDataInicio().isEmpty() || meta.getDataTermino().isEmpty() || meta.getValorMeta().isNaN()){
            System.out.println("Não foi possível cadastrar a meta, pois um ou mais campos estão vazios.");
        } else {
            metas.add(meta);
            System.out.println("Meta cadastrada com sucesso!");
        }
    }

    public void editarTipoMeta(int indice, String novoTipoMeta){
    if(indice < 0 || indice >= metas.size()){
        System.out.println("Índice inválido. Não foi possível editar o tipo da meta.");
    } else {
        Meta meta = metas.get(indice);
        meta.tipoMeta = novoTipoMeta;
        System.out.println("Tipo da meta editado com sucesso!");
    }
    }

    public void editarDataInicio(int indice, String novaDataInicio){
    if(indice < 0 || indice >= metas.size()){
        System.out.println("Índice inválido. Não foi possível editar a data de início da meta.");
    } else {
        Meta meta = metas.get(indice);
        meta.dataInicio = novaDataInicio;
        System.out.println("Data de início da meta editada com sucesso!");
        }
    }

    public void editarDataTermino(int indice, String novaDataTermino){
    if(indice < 0 || indice >= metas.size()){
        System.out.println("Índice inválido. Não foi possível editar a data de término da meta.");
    } else {
        Meta meta = metas.get(indice);
        meta.dataTermino = novaDataTermino;
        System.out.println("Data de término da meta editada com sucesso!");
        }
    }

    public void editarValorMeta(int indice, Double novoValorMeta){
        if(indice < 0 || indice >= metas.size()){
            System.out.println("Índice inválido. Não foi possível editar o valor da meta.");
        } else {
            Meta meta = metas.get(indice);
            meta.valorMeta = novoValorMeta;
            System.out.println("Valor da meta editado com sucesso!");
        }
    }

}
