package exercie4;
public class Etoile extends CorpsCeleste {
    public final double K=1.414213;
    private float temperature;
    //getters
    /**
     * get la temperature
     * @return temperature
     */
    public float getTmp(){
        return temperature;
    }
    //setters
    /**
     * set la temperature
     * @param Nvtmp
     */
    public void setTmp( float Nvtmp){
        temperature=Nvtmp;
    }
    //constructeur
    /**
     * 
     * @param nom
     * @param rayon
     * @param masse
     * @param temperature 
     */
    public Etoile(String nom, float rayon, float masse,float temperature) {
        super(nom, rayon, masse);
        setTmp(temperature);
    }
    //methode energie recue
    /**
     * 
     * @param distance
     * @return l'energie = energie = K *temperature /  (distance)2
     */
    public double energieRecue(double distance){
        return K*temperature/Math.pow(distance, 2);
    }
    //redefinition de la methode toString
    @Override 
    public String toString(){
        return super.toString()+"la temperature est "+temperature;    
    }
    
    
    
}
