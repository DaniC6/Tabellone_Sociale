package enums;

public enum Fascia {
    PRIMA_FASCIA("Giocatore d prima fascia"),
    SECONDA_FASCIA("Giocatore di seconda fascia"),
    TERZA_FASCIA("Giocatore di terza fascia");

    private final String description;

    Fascia(String description) {

        this.description = description;
}

public String getDescription(){
    return description;
    }
}
