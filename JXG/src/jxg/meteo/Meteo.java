/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.meteo;

/**
 *
 * @author Marco
 */
public class Meteo {
    private double temperatura;
    private double tmin;
    private double tmax;
    private String cloud;

    public Meteo(double temperatura, double tmin, double tmax, String cloud) {
        this.temperatura = temperatura;
        this.tmin = tmin;
        this.tmax = tmax;
        this.cloud = cloud;
    }

    public Meteo() {
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTmin() {
        return tmin;
    }

    public void setTmin(double tmin) {
        this.tmin = tmin;
    }

    public double getTmax() {
        return tmax;
    }

    public void setTmax(double tmax) {
        this.tmax = tmax;
    }

    

    public void setTmax(float tmax) {
        this.tmax = tmax;
    }

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }
    
}
