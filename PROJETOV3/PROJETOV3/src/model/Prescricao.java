package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Prescricao implements Serializable {
    private static final long serialVersionUID = 509757957344943977L;
    private LocalDate dataInicioToma;
    private String duracao;
    private String tomas;


    public Prescricao() {

    }

    public Prescricao( LocalDate dataInicioToma, String duracao, String tomas) {

        this.dataInicioToma = dataInicioToma;
        this.duracao = duracao;
        this.tomas = tomas;
    }

    public LocalDate getDataInicioToma() {
        return dataInicioToma;
    }

    public void setDataInicioToma(LocalDate dataInicioToma) {
        this.dataInicioToma = dataInicioToma;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTomas() {
        return tomas;
    }

    public void setTomas(String tomas) {
        this.tomas = tomas;
    }

    @Override
    public String toString() {
        return "Prescricoes{" +
                ", dataInicioToma=" + dataInicioToma +
                ", duracao='" + duracao + '\'' +
                ", tomas='" + tomas + '\'' +
                '}';
    }
}
