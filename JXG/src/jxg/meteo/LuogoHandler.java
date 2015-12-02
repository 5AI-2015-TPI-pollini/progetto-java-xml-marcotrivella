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
import org.w3c.dom.NodeList;
/**
 *
 * @author Marco Trivella
*/
public class LuogoHandler {
    private static final XPathFactory xpathFactory = XPathFactory.newInstance();
    private Luogo[] luoghi;
    private String address = "/GeocodeResponse/result/formatted_address/text()";
    private String latitudine = "/GeocodeResponse/result/geometry/location/lat/text()";
    private String longitudine = "/GeocodeResponse/result/geometry/location/lng/text()";
/**
 * Costruttore vuoto
 */
    public LuogoHandler()
    {
    }
    /**
     * 
     * @param xml documento contentente l'xml ottuno dal sito di Geocoding
     * @return luoghi vettore di Luogo contenente tutti i risultati ottenuti dall'utilizzo dell'XPath sul documento xml 
     */
    public Luogo[] Estrai(Document xml) {
        try {
            XPath xpath = xpathFactory.newXPath();
            // Complila le XPATH expression per valutarle piu tardi
            XPathExpression indirizzo = xpath.compile(address);
            XPathExpression lat = xpath.compile(latitudine);
            XPathExpression lon = xpath.compile(longitudine);
            // Valuta l'espressioni XPATH nel contesto specifico e ritorna il risultato del tipo designato (In questo caso NODESET)
            NodeList luoghis = (NodeList) indirizzo.evaluate(xml, XPathConstants.NODESET);
            NodeList latitudine = (NodeList) lat.evaluate(xml, XPathConstants.NODESET);
            NodeList longitudine= (NodeList) lon.evaluate(xml, XPathConstants.NODESET);
            //Luoghi = vettore contentente località
            luoghi = new Luogo[luoghis.getLength()];
            for (int i = 0; i < luoghi.length; i++) 
                 luoghi[i] = new Luogo(luoghis.item(i).getNodeValue(), Double.parseDouble(latitudine.item(i).getNodeValue()), Double.parseDouble(longitudine.item(i).getNodeValue()));
            } catch (XPathExpressionException ex) {
            System.out.println("Non posso estrarre");
    }
        return luoghi;
    }
    /**
     * 
     * @return luoghi.length la lunghezza del vettore luoghi
     */
    public int getNLuoghi()
    {
        return luoghi.length;
    }
}
