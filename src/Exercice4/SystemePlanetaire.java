

package Exercice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author PC
 */
public class SystemePlanetaire {

    private TreeSet<CorpsCeleste> ensembleCorpsCelesteOrdonne;
    private String nom;

    public SystemePlanetaire(String nom) {
        setNom(nom);
        ensembleCorpsCelesteOrdonne = new TreeSet<>();
    }

    /**
     * Fonction permettant de modifier le nom du système planétaire courant, en
     * gérant des exceptions de type NullPointerException si le paramètre newNom
     * est nul ou s'il est une chaine de charactères vide ceci en utilisant la
     * classe ChaineDeCharacteresException
     *
     * @param newNom String
     */
    public void setNom(String newNom) {

        while ((newNom == null) || (newNom.trim().equals(""))) {
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "le nom du système planétaire est null ou vide");
            System.out.println(
                    "Donnez un nouveau nom du système planétaire non vide");
            newNom = sc.nextLine();
            sc.close();
        }
        nom = newNom;
    }

    /**
     * Fonction permettant de modifier la valeur du champ
     * ensembleCorpsCelesteOrdonne du système planétaire courant
     *
     * @param ensembleCorps
     */
    public void setEnsembleCorpsCelesteOrdonne(TreeSet<CorpsCeleste> ensembleCorps) {
        if (ensembleCorps != null) {
            ensembleCorpsCelesteOrdonne = ensembleCorps;
        }
    }

    /**
     * Fonction retournant le nom du système planétaire courant.
     *
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Fonction retournant la valeur du champ ensembleCorpsCelesteOrdonne du
     * système planétaire courant.
     *
     * @return TreeSet<CorpsCeleste>
     */
    public TreeSet<CorpsCeleste> getEnsembleCorpsCelesteOrdonne() {
        return ensembleCorpsCelesteOrdonne;
    }

    /**
     * Fonction retournant une liste triée par masse de l'ensemble des corps
     * celeste appartenant au système planétaire courant
     *
     * @return ArrayList<CorpsCeleste>
     */
    public ArrayList<CorpsCeleste> listeTrieeParMasse() {
        ArrayList<CorpsCeleste> liste
                = new ArrayList<>(ensembleCorpsCelesteOrdonne);
        // comparator or<CorpsCeleste> comparateur = new Comparator<CorpsCeleste>() {
            @Override
            public int compare(CorpsCeleste corps_1, CorpsCeleste corps_2) {
                if (corps_1.getMasse() == corps_2.getMasse()) {
                    return 0;
                } else if (corps_1.getMasse() > corps_2.getMasse()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        //Collections.sort(liste, Comparator.comparing(CorpsCeleste::getMasse));
        //Collections.sort(liste, Comparator.comparingDouble(CorpsCeleste::getMasse));
        Co llections.sort(liste, comparateur);
        re turn liste;
    }

    /**
     * Fonction retournant une liste triée par rayon de l'ensemble des corps
     * celeste appartenant au système planétaire courant
     *
     * @return ArrayList<CorpsCeleste>
     */
    public ArrayList<CorpsCeleste> listeTrieeParRayon() {
        ArrayList<CorpsCeleste> liste = new ArrayList<>(ensembleCorpsCelesteOrdonne);
        Comparator<CorpsCeleste> comparateur = new Comparator<CorpsCeleste>() {
            @Override
            public int compare(CorpsCeleste corps_1, CorpsCeleste corps_2) {
                if (corps_1.getRayon() == corps_2.getRayon()) {
                    return 0;
                } else if (corps_1.getRayon() > corps_2.getRayon()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(liste, Comparator.comparing(CorpsCeleste::getRayon));
        //Collections.sort(liste, comparateur);
        return liste;
    } 

    /**
     * Fonction permettant de retourner l'ensemble des corps celeste dont la
     * valeur de masse est inférieure au paramètre masseMax de la fonction
     *
     * @param masseMax double
     * @return ArrayList<CorpsCeleste>
     */
    public ArrayList<CorpsCeleste> extraitListeCorpsCelesteParMasse(double masseMax) {
        ArrayList<CorpsCeleste> extraitListe = new ArrayList<>();
        ArrayList<CorpsCeleste> temp = listeTrieeParMasse();
        for (CorpsCeleste corpsCel : temp) {
            if (corpsCel.getMasse() >= masseMax) {
                break;
            }
            extraitListe.add(corpsCel);
        }
        if (extraitListe.isEmpty()) {
            return null;
        }
        return extraitListe;
    }

    /**
     * fonction permettant de retourner la liste des étoiles dont l'énergie, à
     * une distance donnée comme paramètre, est supérieure à une valeur minimale
     * donnée comme paramètre à la fonction
     *
     * @param energieMin
     * @param distance
     * @return ArrayList<Etoile>
     */
    public ArrayList<Etoile> listeEtoileParContrainteEnergie(double energieMin,
            double distance) {
        ArrayList<Etoile> extraitListe = new ArrayList<>();
        ArrayList<CorpsCeleste> temp = listeTrieeParMasse();
        for (CorpsCeleste corpsCel : temp) {
            if ((corpsCel instanceof Etoile)
                    && (((Etoile) corpsCel).energyRecue(distance) >= energieMin));
            extraitListe.add((Etoile) corpsCel);
        }
                
        if (extraitListe.isEmpty()) {
            return null;
        }
        return extraitListe;
    }

    /**
     * Fonction permettant de faire la réunion ordonnée entre le système
     * planétaire courant et celui donné comme argument à la fonction
     *
     * @param autreSystem SystemePlanetaire
     * @return SystemePlanetaire
     */
    public SystemePlanetaire reunionDeSystemesPlanetaires(SystemePlanetaire autreSystem) {
        SystemePlanetaire sysReunion = new SystemePlanetaire(nom + autreSystem.nom);
        TreeSet<CorpsCeleste> temp = new TreeSet<>(ensembleCorpsCelesteOrdonne);
        temp.addAll(autreSystem.ensembleCorpsCelesteOrdonne);
        sysReunion.setEnsembleCorpsCelesteOrdonne(temp);
        return sysReunion;
    }

    /**
     * Fonction permettant de lister l'ensemble des corps celeste qui contient
     * le mot contientCeNom, donné comme paramètre à al fonction, dans leur nom.
     *
     * @param contientCeNom String
     * @return ArrayList<CorpsCeleste>
     */
    public ArrayList<CorpsCeleste> extraitListeCorpsCelesteParNom(String contientCeNom) {
        ArrayList<CorpsCeleste> extraitListe = new ArrayList<>();
        ArrayList<CorpsCeleste> temp = new ArrayList<>(ensembleCorpsCelesteOrdonne);
        for (CorpsCeleste corpsCel : temp) {
            if (corpsCel.getNom().contains(contientCeNom) == true);
            extraitListe.add(corpsCel);
        }
                
        if (extraitListe.isEmpty()) {
            return null;
        }
        return extraitListe;
    }
    // avec un nom donnée
    // fonction de trie par masse et autre par rayon en utilisant des comparator
    // des fonction d'extraction des coprs celeste dont la masse est < à une masse donnée
    // la meme chose pour les comps dont le nom contient une chaine donnée
    // afficher les étoiles qui fournissent unne énergie supérieur à une énergie d
    // nnée
    // faire la réunion du système courant avec un autre système
    //
    // 
    // supprimer, ajouter, chercher, modifier, toString
}
