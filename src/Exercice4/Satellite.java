/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice4;

/**
 *
 * @author MAD SOMBO2023
 */
public class Satellite extends CorpsRevolution {
    // constructeur
    public Satellite(String nom, float rayon, float masse, float rayon_orbital, CorpsCeleste centre_revolution) {
        super(nom, rayon, masse, rayon_orbital, centre_revolution);
    }

    // methode toString
    @Override
    public String toString() {
        return "Corps de type Satellite" + "\n" + super.toString();
    }
}
