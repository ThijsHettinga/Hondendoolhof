package model;

public class Beweging {
    private String richting;
    private int afstand;

    public Beweging(String richting, int afstand) {
        this.richting = richting;
        this.afstand = afstand;
    }

    @Override
    public String toString() {
        return String.format("richting: %s, afstand: %s meter", this.richting, this.afstand);
    }
}
