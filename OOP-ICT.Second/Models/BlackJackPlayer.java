import java.util.ArrayList;

public class BlackJackPlayer extends Player{

    public BlackJackPlayer(String name, double betSum){
        this.name=name;
        this.betSum=betSum;
    }
    public String name;
    public boolean status;

    public double betSum;

    public ArrayList<PlayingCard> playerCards = new ArrayList<>();
    public void joinGame(BlackJackPlayingGround playingGround){
        playingGround.addPlayer(this);

    }
    public void takeCard(PlayingGround playingGround){
        if(this.canTakeCard()) {
            this.playerCards.add(playingGround.dealer.deck.get(0));
            playingGround.dealer.deck.remove(0);
        }

    }
    public boolean canTakeCard(){
        boolean canTakeCard = true;
        int points = 0;
        for (PlayingCard card:this.playerCards){
            points += card.numeric.value;
        }
        if (points >= 17){
            canTakeCard = false;
        }
        return canTakeCard;
    }



}
