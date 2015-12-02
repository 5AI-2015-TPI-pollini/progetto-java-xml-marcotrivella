/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxg.meteo;

/**
 *
 * @author Marco Trivella
 */
public class Meteo {
    private double temperatura;
    private double tmin;
    private double tmax;
    private String cloud;
    /**
     * 
     * @param temperatura double che indica  la temperatura attuale
     * @param tmin double che indica la temperatura minima
     * @param tmax double che indica la temperatura massima
     * @param cloud  stringa che indica le condizioni del cielo
     */
    public Meteo(double temperatura, double tmin, double tmax, String cloud) {
        this.temperatura = temperatura;
        this.tmin = tmin;
        this.tmax = tmax;
        this.cloud = cloud;
    }

    public Meteo() {
    }
    /**
     * 
     * @return temperatura attual
     */
    public double getTemperatura() {
        return temperatura;
    }
    /**
     * 
     * @param temperatura attual
     */
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    /**
     * 
     * @return tmin temperatura minima
     */
    public double getTmin() {
        return tmin;
    }
    /**
     * 
     * @param tmin temperatura minima
     */
    public void setTmin(double tmin) {
        this.tmin = tmin;
    }
    /**
     * 
     * @return tmax temperatura massima 
     */
    public double getTmax() {
        return tmax;
    }
    /**
     * 
     * @param tmax temperatura massima 
     */
    public void setTmax(double tmax) {
        this.tmax = tmax;
    }
    /**
     * 
     * @return cloud stato del cielo
     */
    public String getCloud() {
        return cloud;
    }
    /**
     * 
     * @param cloud stato del cielo
     */
    public void setCloud(String cloud) {
        this.cloud = cloud;
    }
    
}
