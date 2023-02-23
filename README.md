# Série 2

## Exercice 1

Soit une interface Java I, et deux classes C1 et C2 qui l'implémentent. Les quelles des déclarations suivantes sont justes ou fausses ? Pourquoi ?

    1.	I  x = new I ( ) ;
    2.	C1 y = new C1( ) ;
    3.	I[ ] z = {new C1( ), new C2( )} ;
    4.	C1 w = new C2( ) ;

## Exercice 2

On veut gérer les guichets d'une banque. Les guichets sont numérotés de 0 à N -1.
Quand un client arrive, on doit lui indiquer quel guichet est libre. On représente les guichets par un tableau de booléens qui indique que le guichet i est libre (true) ou non (false).

1 - Définir une classe GuichetsBanque qui a un champ tabGuichets et un constructeur qui prend comme paramètre un nombre de guichets N et initialise tabGuichets avec une taille N et true partout.

2 - Rajouter une méthode guichetLibre qui renvoie le numéro du premier guichet libre. Si aucun guichet n'est libre, la fonction affiche un message d‘erreur et renvoie -1.

3 - Rajouter Une fonction qui permet de modifier l’état d’un guichet :

    void  modifEtat(int num).

4- Rajouter une fonction qui permet de déterminer le nombre total de guichets libres :

    int nbGuichetLibre( ) ;

## Exercice 3

Qu'affiche le programme suivant ?

    class A {
        public String f(D obj) { return ("A et D");}
        public String f(A obj) { return ("A et A");}
    }
    class B extends A {
        public String f(B obj) { return ("B et B");}
        public String f(A obj) { return ("B et A");}
    }
    class C extends B{ ……}
    class D extends B{…….}
        class test {
            public static void main (String [] args){
            A a1 = new A( );
            A a2 = new B( );
            B b = new B( );
            C c = new C( );
            D d = new D( );
            System.out.println(a1.f(b));
            System.out.println(a1.f(c));
            System.out.println(a1.f(d));
            System.out.println(a2.f(b));
            System.out.println(a2.f(c));
            System.out.println(a2.f(d));
            System.out.println(b.f(b));
            System.out.println(b.f(c));
            System.out.println(b.f(d));
        }
    }

## Exercice 4

Cette partie a pour but la définition d’un ensemble de classes Java avec une hiérarchie d’héritage. Ces classes doivent permettre de simuler de manière très générale l’organisation d’un système planétaire avec ses corps célestes, notamment ceux appartenant au système solaire.
La hiérarchie des classes est la suivante :

    class CorpsCeleste
        class CorpsRevolution
            class Planete
            class Satellite
        class Etoile
    class SystemePlanetaire

La classe CorpsCeleste se trouve au sommet de la hiérarchie. Les classes CorpsRevolution et Etoile sont des sous-classes de CorpsCeleste. Planete et Satellite sont des sous-classes de CorpsRevolution et enfin la classe SystemePlanétaire permet de gérer l’ensemble des corps Celeste qui la composent.

**Définition :** un système planétaire (parfois confondu avec système stellaire) est un système composé de planètes, ainsi que de divers corps célestes inertes tels des astéroïdes et comètes, gravitant autour d'une étoile.

1.  La classe CorpsCeleste
    Déclarer la classe CorpsCeleste avec les attributs suivants :

    - **nom :** une chaîne de caractères représentant le nom du corps céleste.
    - **rayon :** le rayon du corps céleste en kilomètres.
    - **masse :** la masse du corps céleste en tonnes.

    On inclura le constructeur et les méthodes suivantes :

    - **Constructeur de la classe :** reçoit en paramètre des valeurs permettant d’initialiser les attributs nom, rayon et masse.
    - **Méthode densite :** Cette méthode calcule la densité d’un corps céleste à partir du calcul de son volume et de sa masse.
    - Les accesseurs sont aussi à définir.

    _Rappels :_

        densite = masse / volume ; La densité est en Kg/m3
        volume = 4/3 _ Pi _ rayon3
