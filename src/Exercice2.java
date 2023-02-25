
public class Exercice2 {
    private boolean[] tabGuichets;

    /**
         *Constructeur de la classe GuichetsBanque
         * @param n int
         */
        public GuichetsBanque(int n) {
            tabGuichets = new boolean[n];
            for (int i = 0; i < n; i++) {
                tabGuichets[i] = true;
            }
        }

    /**
     * Méthode qui renvoie le numéro du premier guichet libre.
     * Si aucun guichet n'est libre, la fonction affiche un message d‘erreur
     * et renvoie -1
     * 
     * @return int
     */
    public int guichetLibre() {
        int taille = tabGuichets.length;
        for (int i = 0; i < taille; i++) {
            if (tabGuichets[i] == true) {
                return i;
            }
        }
        System.out.println("tous les guichets sont pris.");
        return -1;
    }

    /**
     * Méthode qui permet de modifier l’état d’un guichet
     * 
     * @param num int
     */
    public void modifEtat(int num) {
        if (num < 0 || num >= tabGuichets.length) {
            System.out.println("le numero du guichet entree n'existe pas.");
            return;
        }
        tabGuichets[num] = !tabGuichets[num];
    }

    /**
     * Méthode qui permet de déterminer le nombre total de guichets libres
     * 
     * @return int
     */
    public int nbGuichetLibre() {
        int nbLibre = 0;
        for (int i = 0; i < tabGuichets.length; i++) {
            if (tabGuichets[i] == true) {
                nbLibre++;
            }
        }
        return nbLibre;
    }
}
