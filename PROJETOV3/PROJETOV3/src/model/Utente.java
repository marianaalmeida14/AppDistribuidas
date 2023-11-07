package model;
import java.io.Serializable;
public class Utente implements Serializable  {
    private static final long serialVersionUID = 209757957344943556L;
    private int idUtente;
    private String nome;
    private String niss;
    private String dataNascimento;
    private String genero;
    private String contacto;
    private String email;
    private String cc;

    public Utente(){

    }

    public Utente ( int idUtente, String cc, String nome, String niss, String dataNascimento, String genero, String contacto,String email) {
        this.idUtente = idUtente;
        this.nome = nome;
        this.niss = niss;
        this.dataNascimento=dataNascimento;
        this.genero = genero;
        this.contacto = contacto;
        this.email = email;
        this.cc=cc;

    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {

        this.idUtente = idUtente;
    }

    public String getNiss() {

        return niss;
    }

    public void setNiss(String niss) {

        this.niss = niss;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }


    public String getGenero() {

        return genero;
    }
    public void setGenero(String genero) {

        this.genero = genero;
    }
    public String getContacto() {

        return contacto;
    }
    public void setContacto(String contacto) {

        this.contacto = contacto;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "idUtente=" + idUtente +
                ", nome='" + nome + '\'' +
                ", niss='" + niss + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", genero='" + genero + '\'' +
                ", contacto='" + contacto + '\'' +
                ", email='" + email + '\'' +
                ", cc='" + cc + '\'' +
                '}';
    }
}