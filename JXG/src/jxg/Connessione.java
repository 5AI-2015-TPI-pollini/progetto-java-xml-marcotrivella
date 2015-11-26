/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 70060463
 */
public class Connessione {
    private String luogo;
    public Connessione(String s) throws MalformedURLException, IOException
    {
            luogo=s;
            URL url = new URL("http://www.google.com/maps/api/geocode/xml?address=" + luogo);
            URLConnection con = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            PrintWriter out = new PrintWriter(new FileWriter("Localita.xml"));
            String output;
            while ((output = in.readLine()) != null)
                out.println(output);
            in.close();
            out.close();
    }
    
}
