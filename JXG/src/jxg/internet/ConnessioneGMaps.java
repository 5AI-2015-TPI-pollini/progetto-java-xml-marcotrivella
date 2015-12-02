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
 * @author 70060463
 */
public class ConnessioneGMaps {
    private String s;
    private Document doc;
    private DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
    public ConnessioneGMaps(String s) throws MalformedURLException, IOException, SAXException, ParserConfigurationException
    {
                    this.s=s;
                    String luogo;
                    //Toglie gli spazi
                    luogo = s.replace(" ","");
                    System.out.println(luogo);
                    URL url = new URL("http://www.google.com/maps/api/geocode/xml?address=" + luogo);
                    URLConnection con = url.openConnection();
                    //Fa il parse del documento preso dal sito
                    doc = docBuilderFactory.newDocumentBuilder().parse(con.getInputStream());       
                }
    
    public Document prendiDoc()
    {
        return doc;
    }
    
}
