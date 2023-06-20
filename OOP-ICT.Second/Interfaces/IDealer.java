import kotlinx.html.B;

public interface IDealer {
    //better make a class for Dealer, PlayingGround, Player;

    public static Dealer createUsualDealer(String name){
        return new UsualDealer( name);
    }

    public static Dealer createBlackJackDealer(String name,PlayingCard playingCard){return new BlackJackDealer(name);}
}