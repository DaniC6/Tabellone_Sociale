import java.util.List;

/**
 * This class represent a Girone
 */
public class Girone {
    private Player primaFascia;
    private List<Player> secondaFascia;
    private Player terzaFascia;

    public Girone(Player primaFascia, List<Player> secondaFascia, Player terzaFascia) {
        this.primaFascia = primaFascia;
        this.secondaFascia = secondaFascia;
        this.terzaFascia = terzaFascia;
    }

    public Player getPrimaFascia() {
        return primaFascia;
    }

    public void setPrimaFascia(Player primaFascia) {
        this.primaFascia = primaFascia;
    }

    public List<Player> getSecondaFascia() {
        return secondaFascia;
    }

    public void setSecondaFascia(List<Player> secondaFascia) {
        this.secondaFascia = secondaFascia;
    }

    public Player getTerzaFascia() {
        return terzaFascia;
    }

    public void setTerzaFascia(Player terzaFascia) {
        this.terzaFascia = terzaFascia;
    }


    @Override
    public String toString() {
        return "Girone [" + " PRIMA FASCIA: " + primaFascia  + " SECONDA FASCIA: " + secondaFascia + " TERZA FASCIA: " + terzaFascia  +
                " ]";
    }
}
