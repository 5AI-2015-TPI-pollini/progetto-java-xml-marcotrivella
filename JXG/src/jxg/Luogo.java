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
    private String latitudine;
    private String longitudine;

    public Luogo(String nome, String regione, String paese, String latitudine, String longitudine) {
        this.nome = nome;
        this.regione = regione;
        this.paese = paese;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    public Luogo() {
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

    public String getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(String latitudine) {
        this.latitudine = latitudine;
    }

    public String getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }

    
    
    
    
}
