/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg;

import java.io.IOException;
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
 * @author 70060463
 */
public class Connessione {
    private String luogo;
    private Document doc;
    private DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
    public Connessione(String s) throws MalformedURLException, IOException, SAXException, ParserConfigurationException
    {
            luogo=s;
            URL url = new URL("http://www.google.com/maps/api/geocode/xml?address=" + luogo);
            URLConnection con = url.openConnection();
            doc = docBuilderFactory.newDocumentBuilder().parse(con.getInputStream());       
    }
    
    public Document prendiDoc()
    {
        return doc;
    }
    
}
