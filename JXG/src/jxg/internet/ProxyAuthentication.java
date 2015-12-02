/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Marco Trivella
 */

public class ProxyAuthentication {
    private String nome;
    private String password;
    /**
    * Costruttore vuoto
    */
    ProxyAuthentication() {
    }
    /**
     * 
     * @return nome nome utente
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @param nome nome utente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return password password dell'utente
     */
    public String getPassword() {
        return password;
    }
    /**
     * 
     * @param password password dell'utente
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 
     * @param nome nome utente
     * @param password password inserita dall'utente
     */
    public ProxyAuthentication(final String nome, final String password) {
        this.nome = nome;
        this.password = password;
        System.setProperty("proxySet", "true");
        System.setProperty("http.proxyHost", "192.168.0.1");
        System.setProperty("http.proxyPort", "8080");
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                
                return new PasswordAuthentication(nome,password.toCharArray());
            }
        });
    }

    private static class ProxyAuthenticator extends Authenticator {

        public ProxyAuthenticator(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }



    private String userName, password;
    /**
     * 
     * @return new PasswordAuthentication ritorna oggetto PasswordAuthentication a cui viene passato username e password
     */
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName, password.toCharArray());
    }
    
    }
}
