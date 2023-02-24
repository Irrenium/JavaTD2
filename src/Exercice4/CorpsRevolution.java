package Exercice4;

import java.util.Scanner;

public class CorpsRevolution extends CorpsCeleste {
    private double rayon_orbital;
    private CorpsCeleste centre_revolution;

    /**
     * constructeur
     * 
     * @param nom
     * @param rayon
     * @param masse
     * @param rayon_orbital
     * @param centre_revolution
     */
    public CorpsRevolution(String nom, float rayon, float masse, double rayon_orbital, CorpsCeleste centre_revolution) {
        super(nom, rayon, masse);
        setRayonOrbital(rayon_orbital);
        // setCentreRevolution(centre_revolution);
    }
    // getters

    // setters
    public void setRayonOrbital(double NvRayonOrbital) {
        while (NvRayonOrbital < 0) {
            System.out.println("rayon inacceprab le");
            Scanner sc = new Scanner(System.in);
            NvRayonOrbital = sc.nextFloat();
            sc.close();
        }
        rayon_orbital = NvRayonOrbital;
    }

    public void setCentreRevolution(CorpsCeleste NvCentreRevolution) {
        if (!(NvCentreRevolution instanceof CorpsCeleste)) {
            System.out.println("votre objet doit etre de type CorpsCeleste");
        }
        if (NvCentreRevolution == null) {
            NvCentreRevolution = new CorpsCeleste("", 0, 0);
        }
        centre_revolution = NvCentreRevolution;
    }

    public String autourDe() {
        return centre_revolution.getNom();
    }

    // la methode toString
    @Override
    public String toString() {
        return "Corps de type CorpsRevolustion" + "\n" + "tourne autour de " + autourDe() + "de rayon orbital"
                + rayon_orbital + super.toString();
    }

}
