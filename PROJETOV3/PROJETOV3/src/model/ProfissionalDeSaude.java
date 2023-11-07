package model;

import java.io.Serializable;

public class ProfissionalDeSaude implements Serializable {
    private static final long serialVersionUID = 2097579571969948664L;
    private int idProfissional;
    private String nome;
    private String tipo;
    private String contacto;
    private String email;

    public ProfissionalDeSaude() {
    }

    public ProfissionalDeSaude(int idProfissional, String nome, String tipo,String contacto,String email) {
        this.idProfissional = idProfissional;
        this.nome = nome;
        this.tipo= tipo;
        this.contacto = contacto;
        this.email = email;
    }
    // Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getidProfissional() {
        return idProfissional;
    }
    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }
    public String getTipo() {

        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
    public String getContacto() {

        return contacto;
    }
    public void setContacto(String contacto) {

        this.contacto = contacto;
    }


    @Override
    public String toString() {
        return "Profissional de Saude{" +
                "Id Profissional de Saude ='" + idProfissional + '\'' +
                ", Nome='" + nome + '\'' +
                ", Tipo='" + tipo+ '\'' +
                ", Contacto='" + contacto + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
