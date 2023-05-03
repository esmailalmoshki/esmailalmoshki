import java.util.Arrays;

public class UsualPlayingGround extends PlayingGround {
    public UsualPlayingGround(Player[] players, Dealer dealer ){
        this.dealer=dealer;
        this.players=players;


    }
    public Player[] players;
    public Dealer dealer;



    @Override
    public String toString() {
        String text = "";
        for(Player player : players){
            text+=player.name+ " has  " + Arrays.toString(player.playerCards) + " \n";
        }
        text += dealer.name + " has " + dealer.deck.toString();
        return text;
    }
}
