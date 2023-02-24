package exercie4;
import java.util.Scanner;
public class CorpsCeleste {
    private String nom;
    private float rayon;
    private float masse;
    //constructeur
    /**
     * 
     * @param nom
     * @param rayon
     * @param masse
    */
    
    public CorpsCeleste(String nom,float rayon,float masse){
        setNom(nom);
        setRayon(rayon);
        setMasse(masse);
    }
    //methode qui calcule la densite
    public float densite(){
        return (float) ((4* Math.PI * Math.pow(rayon, 3))/3 );
    }
    //getters
    public String getNom(){
        return nom;
    }
    public float getRayon(){
        return rayon;
    }
    public float getMasse(){
        return masse;
    }
    //setters
    public void setNom(String NvNom){
        while(NvNom == null){
            System.out.println("le nom que vous avez saisi est null");
            Scanner entree=new Scanner(System.in);
            NvNom=entree.nextLine();
            entree.close();
        }
        nom=NvNom;
    }
    public void setMasse(float NvMasse){
        while(NvMasse<0){
            System.out.println("la masse que vous avez saisi n'est pas valide");
            Scanner entree=new Scanner(System.in);
            NvMasse=entree.nextFloat();
            entree.close();
        }
        masse=NvMasse;
    }
    public void setRayon(float NvRayon){
        while(NvRayon<0){
            System.out.println("le rayon que vous avez saisi n'est pas valide");
            Scanner entree=new Scanner(System.in);
            NvRayon=entree.nextFloat();
            entree.close();
        }
        rayon=NvRayon;
    }
    @Override
    public String toString(){
        return "Nom:"+getNom()+"\n"+"Rayon:"+getRayon()+"\n"+"Masse:"+getMasse()+"\n"+"Densite"+densite();
    }
    
    
}
