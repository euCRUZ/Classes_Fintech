package br.com.classes_fintech.Entidades;


public class Meta {

    private int id;
    private String tipoMeta;
    private String dataInicio;
    private String dataTermino;
    private Double valorMeta;

    public Meta() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public void setTipoMeta(String tipoMeta) {
        this.tipoMeta = tipoMeta;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setValorMeta(Double valorMeta) {
        this.valorMeta = valorMeta;
    }
}