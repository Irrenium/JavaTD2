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

2.  0.  **Les classes Etoile et CorpsRevolution**
        Deux sous-classes dérivent de la classe CorpsCeleste : Etoile et CorpsRevolution.
        La classe Etoile est utilisée pour représenter les étoiles (soleils), tandis que la classe CorpsRevolution est utilisée pour représenter l’ensemble des corps qui tournent, soit autour d’un soleil, soit autour d’un autre corps. Cette classe sera donc utilisée pour représenter les planètes, les satellites, les astéroïdes ou encore les comètes.

    1.  **La classe Etoile**
        La classe Etoile représente les étoiles (dont le Soleil, . . .). On pourra inclure les attributs suivants :

        - **temperature :** la température de la surface de l’étoile en degrés Kelvin.
        - **K :** constante de proportionnalité température/énergie (on attribuera arbitrairement à cette constante la valeur réelle 1.414213).
        - **Ajouter les accesseurs**
        - **Constructeur de la classe :** reçoit en paramètre des valeurs permettant d’initialiser les attributs nom, rayon, masse et temperature.
        - **Méthode energieRecue :** Cette méthode permet de calculer, à partir de la distance à l’étoile, l’énergie qu’un corps situé à cette distance, devrait recevoir. Le calcul se fera arbitrairement de la manière suivante :

                energie = K \*temperature / (distance)(distance)

    2.  **La classe CorpsRevolution**
        Cette classe est utilisée pour représenter l’ensemble des corps pouvant tourner, soit autour d’un soleil, soit autour d’autres corps. On pourra, pour faciliter le développement, se limiter aux planètes et à leurs satellites.

        Attributs de la classe CorpsRevolution :

        - **rayon_orbital :** le rayon moyen de l’orbite en millions de kilomètres
        - **centre_revolution :** le corpsCeleste autour duquel ce corps tourne.
        - **Constructeur de la classe :** Définir un constructeur recevant en paramètre des valeurs permettant d’initialiser l’ensemble des attributs des objets de classe CorpsRevolution.
        - **Méthode autourDe :** Cette méthode retourne en résultat le corps céleste autour duquel ce corps tourne.
        - **Ajouter les accesseurs**

3.  0.  **Les classes Planete et Satellite**
        Dans cette section, il s’agit de définir deux sous-classes de la classe CorpsRevolution : Planete et Satellite.

    1.  **La classe Planete**
        La classe Planete représente, bien entendu, l’ensemble des planètes tournant autour d’un soleil. Elle dérive directement de la classe CorpsRevolution et elle n’ajoute aucun nouvel attribut.

        - **Constructeur de la classe :** Définir un constructeur recevant en paramètre des valeurs permettant d’initialiser l’ensemble des attributs des objets de classe Planete.
        - **Méthode memeSoleil :** Cette méthode retourne en résultat un booléen indiquant si la planète indiquée en paramètre tourne autour de la même étoile que ce corps.

    2.  **La classe Satellite**
        La classe Satellite est utilisée pour représenter les lunes des planètes d’un système solaire. Cette classe dérive directement de la classe CorpsRevolution et elle n’ajoute aucun nouvel attribut.

        - **Constructeur et méthodes :** on trouvera un constructeur initialisant l’ensemble des attributs de l’objet.

4.  **La méthode toString**
    Pour chacune des classes, cette méthode devra permettre de renvoyer une chaîne de caractères contenant le type de corps sur lequel elle s’applique, ainsi que les caractéristiques de celui-ci. Les informations à l’écran, si vous construisez puis affichez les objets représentant le soleil, la terre, mars et la lune, devront être exactement les suivantes :

        Etoile :
            de nom : Soleil, de rayon : 695000.0 kilomètres, de masse : 1.989E27 tonnes
            de densité : 1414.4635488940755 kg par m3, de température en surface : 6273.0_K

        Planète :
            de nom : Terre, de rayon : 6318.14 kilomètres, de masse : 5.976E21 tonnes
            de densité : 5656.584050505794 kg par m3
            effectue des révolutions à une distance de : 149.6 millions de kilomètres
            autour du corps céleste : Soleil, qui est un corps de type Etoile

        Planète :
            de nom : Mars, de rayon : 3397.2 kilomètres, de masse : 6.421E20 tonnes
            de densité : 3909.7655389157962 kg par m3
            effectue des révolutions à une distance de : 227.94 millions de kilomètres
            autour du corps céleste : Soleil, qui est un corps de type Etoile

        Satellite :
            de nom : Lune, de rayon : 1737.4 kilomètres, de masse : 7.349E19 tonnes
            de densité : 3345.3394080375965 kg par m3
            effectue des révolutions à une distance de : 0.3844 millions de kilomètres
            autour du corps céleste : Terre, qui est un corps de type Planète

5.  **La classe SystemePlanetaire**
    L’ensemble des champs et méthodes sont à définir sachant que l’ensemble des corps céleste qui appartiennent à la classe courante de type SystemePlanetaire sont ordonnés et sans doublant. Cette classe permet de faire un trie, de l’ensemble des corps célestes du système planétaire courant, soit en fonction de la masse soit en fonction du rayon. Aussi, elle permet d’extraire une liste de l’ensemble des corps célestes en fonction, soit d’une masse donnée, soit d’une valeur d’énergie K et d’une distance données et qui permettent de donner les étoiles dont leur énergie émise à la distance fixée est supérieur à K. D’autre part, cette classe propose la possibilité de faire la réunion des ensembles des corps célestes qui appartiennent à différents système planétaire et autres fonctions qui sont à ajouter.
