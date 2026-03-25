public class Main {
    public static void main(String[] args) {
        // 1. Tworzymy produkty
        ProduktMenu p1 = new ProduktMenu("K-01", "Espresso", 9.0, "kawa");
        ProduktMenu p2 = new ProduktMenu("K-02", "Cappuccino", 13.5, "kawa");
        ProduktMenu p3 = new ProduktMenu("D-01", "Sernik", 16.0, "deser");

        // 2. Tworzymy klienta
        KlientKawiarni klient = new KlientKawiarni(100, "Julia", "Mazur", "j.mazur@email.com");

        // 3. Tworzymy zamówienie i dodajemy produkty
        Zamowienie zamowienie = new Zamowienie(klient);
        zamowienie.dodajProdukt(p1);
        zamowienie.dodajProdukt(p2);
        zamowienie.dodajProdukt(p3);

        // 4. Wypisujemy podsumowanie (używa toString)
        System.out.println("Dane klienta: " + klient);
        System.out.println("Dane zamówienia: " + zamowienie);
        System.out.println("Łączna wartość: " + zamowienie.policzWartosc() + " zł");
        System.out.println("Liczba pozycji w tym zamówieniu: " + zamowienie.policzLiczbeProduktow());

        // 5. Sprawdzamy pole statyczne (liczba wszystkich produktów w systemie)
        System.out.println("Liczba wszystkich produktów utworzonych w systemie: " + ProduktMenu.getLiczbaProduktow());

        // 6. Testowanie metody equals
        ProduktMenu kopiaEspresso = new ProduktMenu("K-01", "Espresso duplikat", 10.0, "kawa");
        System.out.println("Czy produkty o tym samym kodzie są równe? " + p1.equals(kopiaEspresso));

        // 7. Opłacenie i ponowny wydruk
        zamowienie.oznaczJakoOplacone();
        System.out.println("Po opłaceniu: " + zamowienie);
    }
}