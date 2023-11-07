package model;
import java.io.Serializable;

public class Familiar implements Serializable {
    private static final long serialVersionUID = 4585857759403837455L;
    private String nome;
    private String parentesco;
    private Utente utenteAssociado;
    private int idUtilizador;
    public Familiar(){

    }
    public Familiar(int idUtilizador, String nome, String parentesco, Utente utenteAssociado) {
        this.nome = nome;
        this.parentesco = parentesco;
        this.utenteAssociado = utenteAssociado;
        this.idUtilizador = idUtilizador;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    public Utente getUtenteAssociado() {
        return utenteAssociado;
    }

    public void setUtenteAssociado(Utente utenteAssociado) {
        this.utenteAssociado= utenteAssociado;
    }

    public int getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(int idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    @Override
    public String toString() {
        return "Familiar{" +
                "nome='" + nome + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", utenteAssociado=" + utenteAssociado +
                ", idUtilizador=" + idUtilizador +
                '}';
    }
}