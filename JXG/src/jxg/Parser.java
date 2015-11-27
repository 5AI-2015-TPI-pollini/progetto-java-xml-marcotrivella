/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg;

import java.io.FileInputStream;
import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Marco
 */
public class Parser {

    public Parser() {
        try {
            // Ricarvo riferimento al parser
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            // input stream XML
            InputStream localitaXml = new FileInputStream("Localita.xml");
            
            //DefaultHandler handler = new PersoneHandler();
            //parser.parse(localitaXml,handler);
            
        } catch (Throwable err) {
            err.printStackTrace();
        }
    }
    
}
