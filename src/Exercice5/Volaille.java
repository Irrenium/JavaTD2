package exercice5;
import java.util.Scanner;
//classe Volaille
public class Volaille {
    //les attributs
    //le poids
    private double poids;
    //le numero d'identification
    private int numero_identification;
    //getPoids
    public double getPoids(){
        return poids;
    }
    //getNumeroIdentification
    public int getNumeroIdentification(){
        return numero_identification;
    }
    //setPoids
    public void setPoids(double nvPoids){
        while(nvPoids<0){
            System.out.println("le poids est inacceptable");
            Scanner sc=new Scanner(System.in);
            nvPoids=sc.nextDouble();
        }
        poids=nvPoids;
    }
    //set numero d'identification
    public void setNumero_identification(int nv_numero_identification){
        while(nv_numero_identification<0){
            System.out.println("le poids est inacceptable");
            Scanner sc=new Scanner(System.in);
            nv_numero_identification=sc.nextInt();
        }
        numero_identification=nv_numero_identification;
    }
    //constructeur
    public Volaille(int numero_identification, double poids ){
        setPoids(poids);
        setNumero_identification(numero_identification);
    }
}
