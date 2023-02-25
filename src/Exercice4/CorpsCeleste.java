

package Exercice4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CorpsCeleste {

    private String nom;
    private double rayon;
    private double masse;

    public CorpsCeleste(String nom, double rayon, double masse) {
        setNom(nom);
        setRayon(rayon);
        setMasse(masse);
    }

    /**
     * Fonction permettant de modifier le nom du corps celeste courant, en
     * gérant les problèmes si le paramètre newNom est nul ou s'il est une
     * chaine de charactères vide
     *
     * @param newNom String
     */
    public void setNom(String newNom) {
        while ((newNom == null) || (newNom.trim().equals(""))) {
            System.out.println(
                    "le nom du corps celeste est null ou vide");
            System.out.println(
                    "Donnez un nouveau nom du corps celeste non vide");
            Scanner sc = new Scanner(System.in);
            newNom = sc.nextLine();
        }
        nom = newNom;
    }

    /**
     * Fonction permettant de modifier le rayon du corps celeste courant, en
     * gérant les problèmes si le paramètre newRayon est négatif ou nul
     *
     * @param newRayon double
     */
    public void setRayon(double newRayon) {
        Scanner sc = new Scanner(System.in);
        while (newRayon <= 0) {
            System.out.println(
                    "le rayon du corps celeste est invalide");
            System.out.println(
                    "Donnez un nouveau rayon du corps celeste qui doit etre strictement positif");
            newRayon = sc.nextDouble();
        }
        rayon = newRayon;
        sc.close();

    }

    /**
     * Fonction permettant de modifier la valeur de la masse du corps celeste
     * courant, en gérant les problèmes si le paramètre newMasse est négatif ou nul
     *
     * @param newMasse double
     */
    public void setMasse(double newMasse) {

        while (newMasse <= 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("la masse du corps celeste est invalide");
            System.out.println("Donnez un nouvelle valeur de la masse du corps celeste "
                    + "qui doit etre strictement positif");
            newMasse = sc.nextDouble();
            sc.close();
        }
        masse = newMasse;
    }

    /**
     * Fonction permettant de donner la valeur de la densité, en Kg/m^3, d'un
     * corps celeste
     *
     * @return double
     */
    public double densite() {
        return (3 * masse / (4 * Math.PI * Math.pow(rayon, 3) * Math.pow(10, 6)));
    }

    /**
     * Fonction retournant le nom du corps celeste courant
     *
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Fonction retournant la masse du corps celeste courant
     *
     * @return double
     */
    public double getMasse() {
        return masse;
    }

    /**
     * Fonction retournant le rayon du corps celeste courant
     *
     * @return double
     */
    public double getRayon() {
        return rayon;
    }

    /**
     * Méthode permettantde de vérifier l'égalité du corps celeste courant avec
     * le corps celeste donné comme paramètre à la fonction
     *
     * @param autreCorps CorpsCeleste
     * @return boolean
     */
    @Override
    public boolean equals(Object autreCorps) {
        if (this == autreCorps) {
            return true;
        }
        if (autreCorps instanceof CorpsCeleste) {
            return nom.equals(((CorpsCeleste) autreCorps).nom);
        }
        return false;
    }

    /**
     * Fonction permettant d'afficher les caractéristiques d'un corps celeste
     *
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder((getClass().getSimpleName() + "\n"));
        sb.append(("\t de nom :" + nom + ", de rayon :" + rayon));
        sb.append((" kilometre" + ", de masse : " + masse + " tonnes \n"));
        sb.append(("\t de densite :" + densite() + " kg par m^3"));
        return sb.toString();
    }
}
