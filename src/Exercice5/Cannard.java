package exercice5;
import java.util.Scanner;

//classe Cannard heritee de Volaille 
public class Cannard extends Volaille {
    //les attributs
    //le prix
    private double prix;
    //le poids d'abat 
    private double poids_abat;
    //getters 
    //getPrix
    public double getPrix(){
        return prix*getPoids();
    }
    //getPoidsAbat
    public double getPoidsAbat(){
        return poids_abat;
    }
    //setters
    //setPrix
    public void setPrix(double NvPrix){
        while(NvPrix<0){
            System.out.print("le prix n'est pas acceptable");
            Scanner sc=new Scanner(System.in);
            NvPrix=sc.nextDouble();
        }
        prix=NvPrix;
    }
    //setPoidsAbat
    public void setPoidsAbat(double NvPoidsAbat){
        while(NvPoidsAbat<0){
            System.out.print("le poids n'est pas acceptable");
            Scanner sc=new Scanner(System.in);
            NvPoidsAbat=sc.nextDouble();
        }
        prix=NvPoidsAbat;
    }
   
    
    //constructeur 
    public Cannard(int numero_identification, double poids,double poids_abat,double prix) {
        super(numero_identification, poids);
        setPrix(prix);
        setPoidsAbat(poids_abat);
    }
}
