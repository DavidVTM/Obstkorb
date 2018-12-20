package com.valtech;

import java.util.ArrayList;
import java.util.Date;

public class Rechnung {
    public Kunde kunde;
    public Firma firma;
    public ArrayList<Position> positionen;
    public ArrayList<Dienstleistung> dienstleistungen;
    public Druckvorlage druckvorlage;
    public Date lieferDatum;
    public Date rechnungsDatum;
    public Bankdaten bankdaten;

    public Double berechneGesamtpreisEinerPosition(Position positionen){
        return null;
    }

    public void erzeugeRechnung(){

    }
}
