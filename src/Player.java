import enums.Fascia;

/**
 * This Class represent a Tennis Player
 */
public class Player {

    private String nome;
    private String cognome;
    private Fascia fascia;

    public Player(String nome, String cognome, Fascia fascia) {
        this.nome = nome;
        this.cognome = cognome;
        this.fascia = fascia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }



    public Fascia getFascia() {
        return fascia;
    }

    public void setFascia(Fascia fascia) {
        this.fascia = fascia;
    }

    @Override
    public String toString() {
        return "Player: " + nome + " " + cognome;
    }


}
