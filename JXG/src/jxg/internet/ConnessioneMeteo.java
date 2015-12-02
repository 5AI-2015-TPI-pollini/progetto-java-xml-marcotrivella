/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.internet;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author Marco
 */
public class ConnessioneMeteo {
    private double latitudine;
    private double longitudine;
    private Document doc;
    private DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
    public ConnessioneMeteo(double latitudine, double longitudine) throws MalformedURLException, IOException, SAXException, ParserConfigurationException
    {
            this.latitudine=latitudine;
            this.longitudine=longitudine;
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?lat=" + latitudine + "&lon=" + longitudine + "&units=metric&appid=2de143494c0b295cca9337e1e96b00e0&mode=xml");
            URLConnection con = url.openConnection();
            //Fa il parse del documento preso dal sito
            doc = docBuilderFactory.newDocumentBuilder().parse(con.getInputStream());       
    }
    
    public Document prendiDoc()
    {
        return doc;
    }
}
