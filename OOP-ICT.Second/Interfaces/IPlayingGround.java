import java.util.ArrayList;

public interface IPlayingGround {
    public static PlayingGround  createUsualPlayingGround(Player[] players , UsualDealer usualDealer){
        return new UsualPlayingGround(players, usualDealer) ;
    }
    public static PlayingGround createBlackJackPlayingGround(ArrayList<Player> players , BlackJackDealer blackJackDealer){
        return new BlackJackPlayingGround(players,blackJackDealer);
    }
}
