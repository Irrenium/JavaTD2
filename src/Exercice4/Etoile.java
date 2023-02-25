/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavatd2_2022_2023.Exo_4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Etoile extends CorpsCeleste {

    private double temperature;
    public final static double K = 1.414213;

    /**
     * Constructeur de la classe Etoile
     *
     * @param nom String
     * @param rayon double
     * @param masse double
     * @param temperature double
     */
    public Etoile(String nom, double rayon, double masse, double temperature) {
        super(nom, rayon, masse);
        this.temperature = temperature;
    }

    /**
     * Fonction permettant de calculer, à partir de la distance à l’étoile,
     * l’énergie qu’un corps situé à cette distance, devrait recevoir
     *
     * @param distance double
     * @return double
     */
    public double energyRecue(double distance) {

        while (distance <= 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("la distance à l'étoile courante est négative");
            System.out.println(
                    "Donnez une nouvelle distance, à l'étoile courante, qui doit etre strictement positif");
            distance = sc.nextDouble();
            sc.close();
        } 
        return ((K * temperature) / Math.pow(distance, 2));
    }

    /**
     * Fonction permettantde retourner la temperature de l'étoile courante
     *
     * @return double
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Fonction permettant de modifier la temperature de l'étoile courante
     *
     * @param newTemperature double
     */
    public void setTemperature(double newTemperature) {
        temperature = newTemperature;
    }

    /**
     * Fonction permettant de retourner les caractéristiques d'une étoile.
     *
     * @return String
     */
    @Override
    public String toString() {
        String s = super.toString();
        s += (", de temperature en surface : " + temperature + "°K");
        return s;
    }

}
