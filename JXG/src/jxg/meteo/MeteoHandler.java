/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.meteo;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;

/**
 *
 * @author Marco Trivella
 */
public class MeteoHandler {
    
    private static final XPathFactory xpathFactory = XPathFactory.newInstance();
    private Meteo forecast;
    private static final String temperatura = "/current/temperature/@value";
    private static final String mintemp = "/current/temperature/@min";
    private static final String maxtemp = "/current/temperature/@max";
    private static final String cloud = "/current/clouds/@name";
    
    /**
     * Costruttore vuoto
     */
    public MeteoHandler() 
    {
        
    }
    /**
     * 
     * @param xml documento contenente l'xml ottenuto dal sito di providing del meteo
     * @return forecast oggetto di tipo Meteo
     */
    public Meteo Estrai(Document xml) {
        try {
            XPath xpath = xpathFactory.newXPath();
            // Complila le XPATH expression per valutarle piu tardi
            XPathExpression temperaturax = xpath.compile(temperatura);
            XPathExpression mintempx = xpath.compile(mintemp);
            XPathExpression maxtempx = xpath.compile(maxtemp);
            XPathExpression cloudx = xpath.compile(cloud);
            // Valuta l'espressioni XPATH nel contesto specifico e ritorna il risultato del tipo designato (In questo caso NUMBER E STRING)
            double tempora = (Double) temperaturax.evaluate(xml, XPathConstants.NUMBER);
            double mintempora = (Double) mintempx.evaluate(xml, XPathConstants.NUMBER);
            double maxtempora = (Double) maxtempx.evaluate(xml, XPathConstants.NUMBER);
            String cloudora = (String) cloudx.evaluate(xml, XPathConstants.STRING);
            forecast = new Meteo(tempora, mintempora, maxtempora, cloudora);
            
        } catch (XPathExpressionException ex) {
            System.out.println("extractFromDoc has reported an error");
        }
        return forecast;
    }
}
