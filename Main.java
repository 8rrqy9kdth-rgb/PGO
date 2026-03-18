public class Main {
    public static void main(String[] args) {
        // 1. Tworzymy bibliotekę na 5 książek
        Biblioteka mojaBiblioteka = new Biblioteka(5);

        // 2. Tworzymy kilka książek
        Ksiazka k1 = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 350, true);
        Ksiazka k2 = new Ksiazka("Harry Potter", "J.K. Rowling", 400, true);
        Ksiazka k3 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 250, true);

        // 3. Dodajemy książki do biblioteki
        mojaBiblioteka.dodajKsiazke(k1);
        mojaBiblioteka.dodajKsiazke(k2);
        mojaBiblioteka.dodajKsiazke(k3);

        // 4. Tworzymy czytelnika
        Czytelnik student = new Czytelnik("Ania", "Kowalska", 12345);

        // 5. Symulujemy wypożyczenie
        System.out.println("--- Stan przed wypożyczeniem ---");
        student.wypiszDane();
        mojaBiblioteka.wypiszDostepneKsiazki();

        // Akcja: Ania wypożycza książkę
        k1.wypozycz();
        student.zwiekszLiczbaWypozyczen();

        System.out.println("\n--- Stan po wypożyczeniu Wiedźmina ---");
        student.wypiszDane();
        k1.wypiszInfo();
    }
}