/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg;

/**
 *
 * @author Marco
 */
public class Luogo {
    private String nome;
    private String regione;
    private String paese;

    public Luogo(String nome, String regione, String paese) {
        this.nome = nome;
        this.regione = regione;
        this.paese = paese;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }
    
    
    
}
