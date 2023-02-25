/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavatd2_2022_2023.Exo_4;

/**
 *
 * @author PC
 */
public class Satellite extends CorpsRevolution {

    public Satellite(String nom, double rayon, double masse, double rayonOrbitaleo , 
            CorpsCeleste centreRevolution) {
        super(nom, rayon, masse, rayonOrbitaleo, centreRevolution);
    }
}
