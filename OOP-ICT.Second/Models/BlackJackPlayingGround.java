import java.util.ArrayList;

public class BlackJackPlayingGround extends PlayingGround{
    public ArrayList<Player> players;
    public BlackJackDealer blackJackDealer;
    public BlackJackPlayingGround(ArrayList<Player> players , BlackJackDealer blackJackDealer){
        this.players= players;
        this.blackJackDealer=blackJackDealer;
    }
    public void addPlayer(Player player){
        this.players.add(player);
    }

}
