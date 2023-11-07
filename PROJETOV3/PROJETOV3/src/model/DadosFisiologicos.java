package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DadosFisiologicos implements Serializable {
    private static final long serialVersionUID = 4585857759493737455L;
    private LocalDateTime dataLeitura;
    private double pressaoArterial;
    private double temperaturaCorporal;
    private double saturacaoO2;
    private double frequenciaCardiaca;
    private double niveisColesterol;
    private double peso;
    private double altura;

    public DadosFisiologicos() {

    }

    public DadosFisiologicos(LocalDateTime dataLeitura, double pressaoArterial, double temperaturaCorporal, double saturacaoO2, double frequenciaCardiaca, double niveisColesterol, double peso, double altura) {
        this.dataLeitura = dataLeitura;
        this.pressaoArterial = pressaoArterial;
        this.temperaturaCorporal = temperaturaCorporal;
        this.saturacaoO2 = saturacaoO2;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.niveisColesterol = niveisColesterol;
        this.peso = peso;
        this.altura = altura;
    }

    public LocalDateTime getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(LocalDateTime dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public double getSaturacaoO2() {
        return saturacaoO2;
    }

    public void setSaturacaoO2(double saturacaoO2) {
        this.saturacaoO2 = saturacaoO2;
    }

    public double getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(double frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public double getNiveisColesterol() {
        return niveisColesterol;
    }

    public void setNiveisColesterol(double niveisColesterol) {
        this.niveisColesterol = niveisColesterol;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "DadosFisiologicos{" +
                "dataLeitura=" + dataLeitura +
                ", pressaoArterial=" + pressaoArterial +
                ", temperaturaCorporal=" + temperaturaCorporal +
                ", saturacaoO2=" + saturacaoO2 +
                ", frequenciaCardiaca=" + frequenciaCardiaca +
                ", niveisColesterol=" + niveisColesterol +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

