/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.internet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import static java.lang.System.in;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;





/**
 *
 * @author Marco Trivella
 */


public class ConnessioneGMaps {
    private String s;
    private Document doc;
    private DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
    /**
     * 
     * @param s string contenente il nome del luogo da cercare
     * @throws MalformedURLException URL non trovato
     * @throws IOException Errore input
     * @throws SAXException Errore SAX
     * @throws ParserConfigurationException Errore parser 
     */
    public ConnessioneGMaps(String s) throws MalformedURLException, IOException, SAXException, ParserConfigurationException
    {
                    this.s=s;
                    String luogo;
                    luogo = s.replace(" ","");
                    System.out.println(luogo);
                    URL url = new URL("http://www.google.com/maps/api/geocode/xml?address=" + luogo);
                    URLConnection con = url.openConnection();
                    /**
                     * Il metodo parse analizza il documento XML e genera in memoria la struttura DOM
                     */
                    doc = docBuilderFactory.newDocumentBuilder().parse(con.getInputStream());       
                }
     /**
     * @return doc metodo che ritorna il documento su cui è stato eseguito il parse
     */
    public Document prendiDoc()
    {
        return doc;
    }
    
}
