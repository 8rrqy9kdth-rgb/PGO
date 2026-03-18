public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Brak miejsca w bibliotece!");
        }
    }

    public void wypiszDostepneKsiazki() {
        System.out.println("Dostepne ksiazki:");
        for (int i = 0; i < liczbaKsiazek; i++) {
            ksiazki[i].wypiszInfo();
        }
    }

    public int policzDostepneKsiazki() {
        return liczbaKsiazek;
    }
}