package model;


import java.io.Serializable;
import java.time.LocalDateTime;

public class Exame implements Serializable {
    private static final long serialVersionUID = 735357957344943977L;

    private LocalDateTime dataExame;
    private String tipoExame;
    private String descricao;


    public Exame() {
    }

    public Exame( LocalDateTime dataExame, String tipoExame, String descricao) {
        this.dataExame = dataExame;
        this.tipoExame = tipoExame;
        this.descricao = descricao;
    }

    public LocalDateTime getDataExame() {
        return dataExame;
    }

    public void setDataExame(LocalDateTime dataExame) {
        this.dataExame = dataExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Exames{" +
                ", dataExame=" + dataExame +
                ", tipoExame='" + tipoExame + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

