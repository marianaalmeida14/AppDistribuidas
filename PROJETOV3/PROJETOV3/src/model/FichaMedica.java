package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class FichaMedica implements Serializable {
    private static final long serialVersionUID = 6525243436738261L;
    private Utente utente;
    private Map<LocalDateTime, DadosFisiologicos> dadosFisiologicos;
    private Map<LocalDateTime, Exame> exames;
    private Map<LocalDateTime, Prescricao> prescricoes;
    private Map<LocalDateTime, Consulta> consultas;


    public FichaMedica() {
        this.utente = utente;
        this.dadosFisiologicos = new HashMap<>();
        this.exames = new HashMap<>();
        this.prescricoes = new HashMap<>();
        this.consultas = new HashMap<>();
    }

    public void adicionarExame(LocalDateTime dataExame, Exame exame) {

        exames.put(dataExame, exame);
    }
    public Map<LocalDateTime, Exame> getExames() {

        return exames;
    }

    public void adicionarDadosFisiologicos(LocalDateTime dataLeitura, DadosFisiologicos dados){
        dadosFisiologicos.put(dataLeitura, dados);
    }

    public Map<LocalDateTime, DadosFisiologicos> getDadosFisiologicos() {

        return dadosFisiologicos;
    }

    public void adicionarPrescricao(LocalDateTime dataInicioToma, Prescricao prescricao) {
        prescricoes.put(dataInicioToma, prescricao);
    }

    public Map<LocalDateTime, Prescricao> getPrescricoes() {

        return prescricoes;
    }

    public Utente getUtente() {

        return utente;
    }

    public void adicionarConsulta(LocalDateTime dataConsulta, Consulta consulta) {
        consultas.put(dataConsulta, consulta);
    }
    public Map<LocalDateTime, Consulta> getConsultas() {

        return consultas;
    }
    @Override
    public String toString() {
        return "FichaMedica{" +
                "utente=" + utente +
                ", dadosFisiologicos=" + dadosFisiologicos +
                ", exames=" + exames +
                ", prescricoes=" + prescricoes +
                ", consultas=" + consultas +
                '}';
    }
}
