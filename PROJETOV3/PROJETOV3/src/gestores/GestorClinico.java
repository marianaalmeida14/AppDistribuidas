package gestores;

import Exceptions.FamiliarJaExisteException;
import Exceptions.ProfissionalSaudeJaExisteException;
import Exceptions.UtenteJaExisteException;
import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorClinico {
    private static final long serialVersionUID = 2271773781997413728L;
    private Map<Integer, Utente> dicTUtentes;
    private Map<Integer, ProfissionalDeSaude> dicTProfSaude;
    private Map<Integer, Familiar> dicTFamiliares;
    private Map<LocalDateTime, Exame> dicTExames;
    private Map<LocalDateTime, DadosFisiologicos> dicTDadosF;
    private Map<LocalDateTime,Prescricao> dicTPrescricoes;
    private Map<LocalDateTime,Consulta> dicTConsultas;
    private Map<Integer, FichaMedica> dicTFichaMedicas;



    public GestorClinico() /*throws UtenteJaExisteException*/ {

        dicTUtentes = new HashMap<>();
        dicTFamiliares = new HashMap<>();
        dicTProfSaude = new HashMap<>();
        dicTExames = new HashMap<>();
        dicTFichaMedicas = new HashMap<>();
        dicTConsultas = new HashMap<>();
        dicTPrescricoes= new HashMap<>();
        dicTDadosF= new HashMap<>();
    }

    /*
     REGISTAR UTILIZADORES
     */

    //Registo de Utentes
    public synchronized void registarUtente(int idUtente, String cc, String nome, String niss, String dataNascimento, String genero, String contacto, String email) throws UtenteJaExisteException {
        if (!this.dicTUtentes.containsKey(idUtente)) {
            Utente u = new Utente(idUtente, cc, nome, niss, dataNascimento, genero, contacto, email);
            this.dicTUtentes.put(idUtente, u);
        }
    }

    public synchronized void AdicionaUtente(Utente t) throws UtenteJaExisteException {
        if (this.fichasUtente.containsKey(t.getNumutente())) {
            throw new UtenteJaExisteException();
        }
        this.fichasUtente.put(t.getNumutente(), new FichaMedica(t));
    }

    public synchronized void AdicionaUtente(String nome, String morada, String nif,
                                            String cc, LocalDate dn, String numutente,
                                            String telefone, String telefone_emergencia,
                                            String email) throws UtenteJaExisteException {
        if (this.fichasUtente.containsKey(numutente)) {
            throw new UtenteJaExisteException();
        }
        Utente u = new Utente(nome, morada, nif, cc, dn, numutente, telefone,
                telefone_emergencia, email);
        AdicionaUtente(u);
    }

    public Utente getUtente(String numutente) throws UtenteNaoExisteException {
        if (!this.fichasUtente.containsKey(numutente)) {
            throw new UtenteNaoExisteException();
        }
        return this.fichasUtente.get(numutente).getUtente();
    }
    //Registo de Prof Saude
    public synchronized void registarProfSaude(int idProfissional, String nome, String tipo, String contacto, String email) throws ProfissionalSaudeJaExisteException {
        if (!this.dicTProfSaude.containsKey(idProfissional)) {
            ProfissionalDeSaude ps = new ProfissionalDeSaude(idProfissional, nome, tipo, contacto, email);
            this.dicTProfSaude.put(idProfissional, ps);
        }
    }

    //Registo de Familiar
    public synchronized void registarFamiliar(int idUtilizador, String nome, String parentesco, Utente utenteAssociado) throws FamiliarJaExisteException {
        if (!this.dicTFamiliares.containsKey(idUtilizador)) {
            Familiar f = new Familiar(idUtilizador,nome,parentesco,utenteAssociado);
            this.dicTFamiliares.put(idUtilizador, f);
        }
    }


    /*
     REGISTAR DADOS CLINICOS
     */



}

