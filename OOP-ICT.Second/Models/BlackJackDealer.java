public class BlackJackDealer extends Dealer{

    public BlackJackDealer(String name) {
        super(name);

    }

    public PlayingCard dealerCard;
    public PlayingGround distribute(PlayingGround playingGround){
        //player index allocate the
        int playerIndex = 0;
        for (Player player:playingGround.players){
            for (int i=0; i<2;i++){
                //Dealer gives 4 cards for each player
                player.playerCards[i] = playingGround.dealer.deck.get(0);
                //Dealer removes the distributed card from the deck
                playingGround.dealer.deck.remove(0);
            }
            playerIndex++;
            this.dealerCard= playingGround.dealer.deck.get(0);
            //Dealer removes the his card from the deck
            playingGround.dealer.deck.remove(0);

        }
        return playingGround;
    }
}
