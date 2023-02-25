
package Exercice4;

public class Planete extends CorpsRevolution {

    /**
     * 
     * @param nom              String
     * @param rayon            double
     * @param masse            double
     * @param rayonOrbitale    double
     * @param centreRevolution CorpsCeleste
     */
    public Planete(String nom, double rayon, double masse, double rayonOrbitale, CorpsCeleste centreRevolution) {
        super(nom, rayon, masse, rayonOrbitale, centreRevolution);
    }

    /**    
     * Cette méthode retourne en résultat un booléen indiquant si la planete 
     * indiquée en paramètre tourne autour de la même étoile que ce corps
     * @param p Planete
     * @return boolean
     */
    public boolean memeSoleil(Planete p) {
        // (autourDe() == p.autourDe())// autourDe().equals(p.autourDe()) == true
        
        return (autourDe() instanceof Etoile) && (p.autourDe() instanceof Etoile) && (autourDe().equals(p.autourDe()) == true);
    }
}
