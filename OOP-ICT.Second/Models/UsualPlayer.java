public class UsualPlayer extends Player{

    public UsualPlayer(String name, double betSum ){
        this.name=name;
        this.betSum =betSum;

    }
    public String name;
    public double betSum;

    public PlayingCard[] playerCards = new PlayingCard[4];
    //in the blackjack game


}
