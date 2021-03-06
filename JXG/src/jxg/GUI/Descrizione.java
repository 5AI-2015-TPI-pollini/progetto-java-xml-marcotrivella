/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.GUI;

import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;
import jxg.internet.ConnessioneMeteo;
import jxg.meteo.Luogo;
import jxg.meteo.Meteo;
import jxg.meteo.MeteoHandler;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author Marco Trivella
 */
public class Descrizione extends javax.swing.JFrame {

    /**
     * 
     * @param l oggetto Luogo su cui si ottengono informazioni
     * @throws IOException Errore input
     * @throws MalformedURLException Errore URL non trovato
     * @throws SAXException Errore SAX
     * @throws ParserConfigurationException Errore parser 
     */
    public Descrizione(Luogo l) throws IOException, MalformedURLException, SAXException, ParserConfigurationException {
        initComponents();
        frame.setLocationRelativeTo(null);
        ConnessioneMeteo connessionem = new ConnessioneMeteo(l.getLatitudine(), l.getLongitudine());
        Document doc = connessionem.prendiDoc();
        MeteoHandler meteohandler = new MeteoHandler();
        Meteo meteo = new Meteo();
        meteo = meteohandler.Estrai(doc);
        nome.setText("Nome:  " + l.getNome());
        lat.setText("Latitudine:  " + l.getLatitudine());
        longi.setText("Longitudine:  " + l.getLongitudine());
        temp.setText("Temperatura attuale:  " + meteo.getTemperatura());
        mintemp.setText("Temperatura minima:  " + meteo.getTmin());
        maxtemp.setText("Temperatura massima:  " + meteo.getTmax());
        cloud.setText("Cielo:  " + meteo.getCloud());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JLabel();
        lat = new javax.swing.JLabel();
        longi = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        mintemp = new javax.swing.JLabel();
        maxtemp = new javax.swing.JLabel();
        cloud = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        nome.setText("jLabel8");
        nome.setMaximumSize(new java.awt.Dimension(200, 60));
        getContentPane().add(nome);

        lat.setText("jLabel9");
        lat.setMaximumSize(new java.awt.Dimension(200, 60));
        getContentPane().add(lat);

        longi.setText("jLabel1");
        longi.setMaximumSize(new java.awt.Dimension(200, 60));
        getContentPane().add(longi);

        temp.setText("jLabel2");
        temp.setMaximumSize(new java.awt.Dimension(200, 60));
        getContentPane().add(temp);

        mintemp.setText("jLabel3");
        mintemp.setMaximumSize(new java.awt.Dimension(200, 60));
        getContentPane().add(mintemp);

        maxtemp.setText("jLabel4");
        maxtemp.setMaximumSize(new java.awt.Dimension(200, 60));
        getContentPane().add(maxtemp);

        cloud.setText("jLabel5");
        cloud.setMaximumSize(new java.awt.Dimension(200, 60));
        getContentPane().add(cloud);

        pack();
    }// </editor-fold>//GEN-END:initComponents


JFrame frame = this;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cloud;
    private javax.swing.JLabel lat;
    private javax.swing.JLabel longi;
    private javax.swing.JLabel maxtemp;
    private javax.swing.JLabel mintemp;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel temp;
    // End of variables declaration//GEN-END:variables
}
