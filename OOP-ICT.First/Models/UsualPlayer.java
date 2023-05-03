public class UsualPlayer extends Player{

    public UsualPlayer(String name, double betInDollars ){
        this.name=name;
        this.betInDollars =betInDollars;

    }
    public String name;
    public double betInDollars;

    public PlayingCard[] playerCards = new PlayingCard[4];
    //in the blackjack game


}
