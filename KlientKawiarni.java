public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " (ID: " + idKlienta + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KlientKawiarni)) return false;
        KlientKawiarni k = (KlientKawiarni) o;
        return this.idKlienta == k.idKlienta || this.email.equals(k.email);
    }
}
