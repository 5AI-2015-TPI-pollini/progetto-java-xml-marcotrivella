/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.GUI;

import jxg.GUI.Ricerca;
import jxg.GUI.Descrizione;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;
import jxg.meteo.Luogo;
import jxg.meteo.LuogoHandler;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author Marco Trivella
 */
public class Risultati extends javax.swing.JFrame {

    /**
     * Crea Risultati
     */
    public Risultati(Document doc) {
        initComponents();
        frame.setLocationRelativeTo(null);
        LuogoHandler crea_luoghi = new LuogoHandler();
            final Luogo [] luoghi = crea_luoghi.Estrai(doc);
            bottoni= new JButton [luoghi.length];
            for(int i=0; i < luoghi.length; i++)
            {
                final int j=i;
                bottoni[i] = new JButton("Nome:   "+luoghi[i].getNome());
                bottoni[i].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            new Descrizione(luoghi[j]).setVisible(true);
                        /**
                        * 
                        * @throws SAXException ex Se non riesce a fare il SAX
                        * @throws ParserConfigurationException ex Se non riesce a fare il parse
                        * @throws IOException ex in caso di errore di input
                        */
                        } catch (IOException ex) {
                            Logger.getLogger(Risultati.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SAXException ex) {
                            Logger.getLogger(Risultati.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ParserConfigurationException ex) {
                            Logger.getLogger(Risultati.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                pannello_bottoni.add(bottoni[i]);
                
                
            }
            pack();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pannello_bottoni = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pannello_bottoni.setLayout(new javax.swing.BoxLayout(pannello_bottoni, javax.swing.BoxLayout.Y_AXIS));

        jButton1.setText("Indietro");
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
                .addContainerGap()
                .addComponent(pannello_bottoni, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pannello_bottoni, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       new Ricerca().setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

JButton[] bottoni;
JFrame frame = this;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pannello_bottoni;
    // End of variables declaration//GEN-END:variables
}
