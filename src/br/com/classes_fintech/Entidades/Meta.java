package br.com.classes_fintech.Entidades;
public class Meta {

    //private int id;
    private String tipoMeta;
    private String dataInicio;
    private String dataTermino;
    private double valorMeta;
    //private static ArrayList<Meta> listaMetas = new ArrayList<Meta>();

    public Meta(String tipoMeta, String dataInicio, String dataTermino, double valorMeta) {
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

    public double getValorMeta() {
        return valorMeta;
    }


}