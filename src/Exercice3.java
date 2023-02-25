public class Exercice3 {
    // A et A

    // a1.f(b)
    // A la compilation, la signature est déterminée dans A puisque a1 est de type
    // statique A : cette signature ou profil existant dans A est void f(A b).
    // A l’exécution, vu que a1 est de même type dynamique que statique, on appelle
    // f(A b) de A. Donc on aura l’affichage "A et A".

    // a1.f(c)
    // A la compilation, la signature est déterminée dans A puisque a1 est de type
    // statique A : cette signature ou profil existant dans A est void f(A c).
    // A l’exécution, vu que a1 est de même type dynamique que statique, on
    // appelle f(A c) de A. Donc on aura l’affichage "A et A".

    // a1.f(d)
    // A la compilation, la signature est déterminée dans A puisque a1 est de type
    // statique A : cette signature ou profil existant dans A est void f(D d).
    // A l’exécution, vu que a1 est de même type dynamique que statique, on
    // appelle f(D d) de A. Donc on aura l’affichage "A et D"

    // a2.f(b)
    //  A la compilation, la signature est déterminée dans A puisque a2 est de type
    // statique A : cette signature ou profil existant dans A est void f(A b).
    //  A l’exécution, vu que a2 est de type dynamique B, on regarde dans B si on
    // trouve une méthode de profil void f(A b). Oui. C’est donc ” f(A b) de B”’ qui
    // sera affichée, on aura alors l’affichage "B et A"
    // a2.f(c)
    //  A la compilation, la signature est déterminée dans A puisque a2 est de type
    // statique A : cette signature ou profil existant dans A est void f(A c).
    //  A l’exécution, vu que a2 est de type dynamique B, on regarde dans B si on
    // trouve une méthode de profil void f(A c). Oui. C’est donc ” f(A c) de B”’ qui
    // sera affichée, on aura alors l’affichage "B et A"
    // a2.f(d)
    //  A la compilation, la signature est déterminée dans A puisque a2 est de type
    // statique A : cette signature ou profil existant dans A est void f(D d).
    //  A l’exécution, vu que a2 est de type dynamique B, on regarde dans B si on
    // trouve une méthode de profil void f(D d). non. C’est donc ” f(D d) de A”’ qui
    // sera affichée, on aura alors l’affichage "A et D"
    // b.f(b)
    //  A la compilation, la signature est déterminée dans B puisque b est de type
    // statique B : cette signature ou profil existant dans B est void f(B b).
    //  A l’exécution, vu que b est de même type dynamique que statique, on appelle
    // f(B b) de B. Donc on aura l’affichage "B et B".
    // b.f(c)
    //  A la compilation, la signature est déterminée dans B puisque b est de type
    // statique B : cette signature ou profil existant dans B est void f(B c)
    // sachant que C extends B.
    //  A l’exécution, vu que b est de même type dynamique que statique, on appelle
    // f(B c) de B. Donc on aura l’affichage "B et B".
    // b.f(d)
    //  A la compilation, la signature est déterminée dans B puisque b est de type
    // statique B : cette signature ou profil existant dans B est void f(D d).
    //  A l’exécution, vu que b est de même type dynamique que statique, on appelle
    // f(D d) de A. Donc on aura l’affichage "A et D".

    // Autres explications

    // *) Les premiers trois appels se comportent d'une façon polymorphe comme on
    // s'y attend.
    // Les trois appels suivants semblent un peu « bizarres » cela dépend du fait
    // que la signature de la méthode est choisie à la compilation, tandis que le
    // code à exécuter est choisi à l'exécution.

    // *) À la compilation, l'objet a2 est supposé être de type A. Dans la classe A,
    // la méthode f n'est pas définie pour un objet de type B. Ainsi, l'appel
    // a2.f(b) utilise le polymorphisme et considère b comme un objet de type A.
    // Donc, la signature pour cet appel exige un argument de type A.

    // *)À l'exécution, a2 est un objet de type B. Le code utilisé est celui de la
    // méthode de B qui a la même signature, même si B pourrait avoir une méthode
    // plus « précise » . L'appel a2.f(d) choisit la signature de f qui exige objets
    // de type D.

    // *) À l'exécution, a2 est de type B. La classe B n'a pas une méthode f avec la
    // bonne signature. Donc le code de la superclasse est utilisé.

    // *) Parmi les trois derniers appels, le plus intéressant est le dernier : B
    // n'a pas une méthode pour D.

}
