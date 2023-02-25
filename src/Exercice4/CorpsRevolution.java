
package Exercice4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CorpsRevolution extends CorpsCeleste {

    private double rayonOrbitale;
    private CorpsCeleste centreRevolution;

    public CorpsRevolution(String nom, double rayon, double masse, double rayonOrbitale,
            CorpsCeleste centreRevolution) {
        super(nom, rayon, masse);
        setRayonOrbitale(rayonOrbitale);
        this.centreRevolution = centreRevolution;
    }

    /**
     * Fonction permettant de modifier le rayon du corps celeste courant, en
     * gérant les problèmes si le paramètre newRayon est négatif ou nul
     *
     * @param newRayon double
     */
    public void setRayonOrbitale(double newRayonOrbitale) {
        Scanner sc = new Scanner(System.in);
        while (newRayonOrbitale < 0) {
            System.out.println(
                    "le rayon orbitale du corps de révolution est "
                    + "strictement négatif");
            System.out.println(
                    "Donnez un nouveau rayon orbitale du corps de r
                            + "qui doit etre positif");
            newRayonOrbitale = sc.nextDouble();
        }
                            e = newRayonOrbitale;
        sc.close();
    }

    /**
     * Fonct permettant de retourner le rayon orbitale d'un corps de revolution
     *
     * @return double
     */
    public double getRayonOrbital() {
        return rayonOrbitale;
    }

    /**
     * méthode retourne en résultat le corps celeste autour duquel ce
     * corpsRevolution courant tourne.
     *
     * @return
     */
    public CorpsCeleste autourDe() {
        return centreRevolution;
    }

    /**
     * Fonction permettant d'afficher les caractéristiques d'un corps de
     * révolution
     *
     * @return String
     */
    @Override
    public String toString() {
        String s = super.toString();
        s += ("\n \t effectue des révolutions à une distance de :" + rayonOrbitale + " millions de kilomètres \n");
        s += ("\t autour du corps céleste : " + centreRevolution.getNom()
                + ", qui est un corps de type " + centreRevolution.getClass().getSimpleName() + "\n");
        return s;
    }
}
