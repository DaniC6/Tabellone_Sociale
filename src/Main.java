import enums.Fascia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Daniele Caramanica app per creare gironi di 5 giocatori per un torneo sociale con giocatori divisi per fascia(1 prima fascia, 3 seconda fascia,1 terza fascia)
 */
public class Main {

    public static void main(String[] args) {

        /**
         * This list collect all players
         */
        List<Player> allPlayers = new ArrayList<> ();

        allPlayers.add (new Player("Daniele","Caramanica", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Luigi","Pugliese", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Antonio","DelCogliano", Fascia.PRIMA_FASCIA));
        allPlayers.add (new Player("Donato","Leggieri", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Francesco","Di Canio", Fascia.PRIMA_FASCIA));
        allPlayers.add (new Player("Feliciano","Marolda", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Giuseppe","Bellasalma", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Claudio","Masturzo", Fascia.PRIMA_FASCIA));
        allPlayers.add (new Player("Raffaele","Ferrenti", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Roccaldo","Pellegrino", Fascia.PRIMA_FASCIA));
        allPlayers.add (new Player("Giuseppe","Pellegrino", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Luigi","Pellegrino", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Biagio","Bellasalma", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Dino","Geologo", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Sirio","D Urso", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Raffaele ","Tamburriello", Fascia.PRIMA_FASCIA));
        allPlayers.add (new Player("Mimmo","Mimmo", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Ciccio","Ciccio", Fascia.TERZA_FASCIA));
        allPlayers.add (new Player("Pippo","Pippo", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Silvia","Lapolla", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Fabio","Biondo", Fascia.TERZA_FASCIA));
        allPlayers.add (new Player("Martina","Pugliese", Fascia.SECONDA_FASCIA));
        allPlayers.add (new Player("Fabrizio ","Di Ciommo", Fascia.TERZA_FASCIA));
        allPlayers.add (new Player("Alessio","Alessi", Fascia.TERZA_FASCIA));
        allPlayers.add (new Player("Nuccio","Nucci", Fascia.TERZA_FASCIA));


        List<Player> playerPrimaFascia = new ArrayList<>();
        List<Player> playerSecondaFascia = new ArrayList<>();
        List<Player> playerTerzaFascia = new ArrayList<>();

        /**
         * This method add the players in theirs list organized by fascia
         */

        for(Player player: allPlayers){
            if(player.getFascia() == Fascia.PRIMA_FASCIA){
                playerPrimaFascia.add(player);
            }else if(player.getFascia() == Fascia.SECONDA_FASCIA){
                playerSecondaFascia.add(player);
            }else if(player.getFascia() == Fascia.TERZA_FASCIA){
                playerTerzaFascia.add(player);
            }
        }

        /**
         * Shuffle the players in theirs gironi
         */
        Collections.shuffle (playerPrimaFascia);
        Collections.shuffle (playerSecondaFascia);
        Collections.shuffle (playerTerzaFascia);

        List<Girone> gironi = new ArrayList<>();

        int numeroGironi = 5;
        int numGirone = 1;

        for(int i =0; i < numeroGironi; i ++){
            if(playerPrimaFascia.size() > 0 && playerSecondaFascia.size() >= 3 && playerTerzaFascia.size() > 0){

                Player plPrimaFascia = playerPrimaFascia.remove (0);

                List<Player> plSecondaFascia = new ArrayList<>();

                for(int j = 0; j < 3;j++){
                    plSecondaFascia.add(playerSecondaFascia.remove (0));
                }

                Player plTerzaFascia = playerTerzaFascia.remove(0);

                Girone girone = new Girone(plPrimaFascia,plSecondaFascia,plTerzaFascia);

                System.out.println(numGirone++ + " " + girone);
            }
        }




    }
}
