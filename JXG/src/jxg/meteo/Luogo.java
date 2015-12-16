/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.meteo;

/**
 *
 * @author Marco Trivella
 */
public class Luogo {
    private String nome;
    private double latitudine;
    private double longitudine;
    /**
     * 
     * @param nome nome del luogo
     * @param latitudine latitudine del luogo
     * @param longitudine longitudine del luogo
     * Classe utile per effettuare operazioni sui dati del relativo documento xml
     */
    public Luogo(String nome, double latitudine, double longitudine) {
        this.nome = nome;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }
    /**
     * 
     * @return nome nome del luogo
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @param nome nome del luogo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return latitudine latitudine del luogo
     */
    public double getLatitudine() {
        return latitudine;
    }
    /**
     * 
     * @param latitudine latitudine del luogo 
     */
    public void setLatitudine(double latitudine) {
        this.latitudine = latitudine;
    }
    /**
     * 
     * @return longitudine longitudine del luogo
     */
    public double getLongitudine() {
        return longitudine;
    }
    /**
     * 
     * @param longitudine  longitudine del luogo
     */
    public void setLongitudine(double longitudine) {
        this.longitudine = longitudine;
    }
    
    

   
    
    
    
    
}
