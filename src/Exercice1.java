
public class Exercice1 {

    // I x = new I();
    // faux,
    // on n’instancie pas une interface

    // C1 y = new C1();
    // faux,
    // on n’instancie pas une interface

    // I[] z = { new C1(), new C2() };
    // idem, même si deux classes différentes. Elles implémentent la même interface

    // C1 w = new C2();
    // faux, on déclare une classe et on instancie avec une autre (types
    // incompatibles)
}
