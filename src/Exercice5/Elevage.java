package exercice5;
import java.util.Scanner;
public class Elevage {
    //tableau de volaille
    private Volaille[] Volailles ;
    //le nombre de volaille
    private int nb_volaille;
    //setVolaille
    public void setVolaille(int N){
        while(N<0){
            System.out.println("taille inacceptale");
            Scanner sc=new Scanner(System.in);
            N=sc.nextInt();
        }
        Volailles=new Volaille[N];
        nb_volaille=0;
    }
    //constructeur
    public Elevage(int N){
        setVolaille(N);  
    }
    //ajouter Volaille
    public void ajouterVolaille(Volaille V){
        if(nb_volaille<Volailles.length){
            Volailles[nb_volaille]=V;
        }
        nb_volaille++;
    }
    //methode qui trie les volailles a abattre
    //methode qui trie
    
}
