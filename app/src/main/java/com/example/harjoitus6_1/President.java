package com.example.harjoitus6_1;

public class President {

    private String kokonimi;
    private int aloitti;
    private int lopetti;
    private String kuvaus;

    public President(String kokonimi, int aloitti, int lopetti, String kuvaus) {
        this.kokonimi = kokonimi;
        this.aloitti = aloitti;
        this.lopetti = lopetti;
        this.kuvaus = kuvaus;
    }

    public String getKokonimi() {
        return kokonimi;
    }

    public int getAloitti() {
        return aloitti;
    }

    public int getLopetti() {
        return lopetti;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    @Override
    public String toString() {
        return kokonimi;
    }
}
