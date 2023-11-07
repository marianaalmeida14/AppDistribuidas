package model;


import java.io.Serializable;
import java.time.LocalDateTime;

public class Consulta implements Serializable {
    private static final long serialVersionUID = 209757957344943977L;
    private LocalDateTime dataConsulta;
    private String tipoConsulta;
    private String observacoes;


    public Consulta(){
    }

    public Consulta(LocalDateTime dataConsulta, String tipoConsulta, String observacoes) {

        this.dataConsulta = dataConsulta;
        this.tipoConsulta = tipoConsulta;
        this.observacoes=observacoes;
    }


    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Consultas {" +
                ", Data de Consulta ='" + dataConsulta + '\'' +
                ", tipo de Consulta ='" + tipoConsulta + '\'' +
                ", Observacoes=" + observacoes +
                '}';
    }
}

