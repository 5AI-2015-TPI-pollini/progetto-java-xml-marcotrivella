/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.GUI;

import java.awt.Component;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.parsers.ParserConfigurationException;
import jxg.internet.ConnessioneGMaps;
import jxg.meteo.Luogo;
import jxg.meteo.LuogoHandler;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author Marco Trivella
 */
public class Ricerca extends javax.swing.JFrame {

    /**
     * Crea ricerca
     */
    public Ricerca() {
        initComponents();
        frame.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ricerca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inserisci la località");

        ricerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricercaActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ricerca, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(ricerca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ricercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricercaActionPerformed
        ricerca.setText(null);
    }//GEN-LAST:event_ricercaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ConnessioneGMaps connessione = new ConnessioneGMaps (ricerca.getText());
            Document doc = connessione.prendiDoc();
            this.setVisible(false);
            new Risultati(doc).setVisible(true);
        } catch (SAXException ex) {
            JFrame errore = new JFrame();
            JLabel label = new JLabel("Non riesco a fare il SAX");
            errore.add(label);
            errore.setLocation(null);
        } catch (ParserConfigurationException ex) {
            JFrame errore = new JFrame();
            JLabel label = new JLabel("Non riesco a fare il parser");
            errore.add(label);
            errore.setLocation(null);
        } catch (IOException ex) {
            JFrame errore = new JFrame();
            JLabel label = new JLabel("Errore di input");
            errore.add(label);
            errore.setLocation(null);
        } catch (NullPointerException ex){
            JFrame errore = new JFrame();
            JLabel label = new JLabel("Puntatore vuoto");
            errore.add(label);
            errore.setLocation(null);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed


    JFrame frame = this;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField ricerca;
    // End of variables declaration//GEN-END:variables
}
