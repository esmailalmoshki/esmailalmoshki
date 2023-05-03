
public class UsualDealer extends Dealer {
    // in the second lab inheretince can replace the DealerFactory and the factory can be for the playingground
    public String name;
    public Deck deck;
    public UsualDealer(String name, PlayingCard[] dealerCards){
        this.name = name;
        this.dealerCards = null;
        this.deck=new Deck();
    }
    public void shuffle(Deck unShuffled){
        int half=unShuffled.size()/2; //здесь мы смело делим длину массива пополам
        Deck temparray=new Deck();
        int shuffleTimes= (int) (Math.random()*(1000-80)+80);
        for(int j=0 ;j<shuffleTimes;j++){
            for(int i=0;i<half;i++) {
                temparray.set(i * 2, unShuffled.get(i + half)); //и используем в качестве индекса
                temparray.set(i * 2 + 1, unShuffled.get(i));
            }
        }
        System.out.println(temparray);
        unShuffled.clear();
        unShuffled.addAll(temparray);

    }
    public PlayingGround distribute(PlayingGround playingGround){
        //player index allocate the
        int playerIndex = 0;
        for (Player player:playingGround.players){
            for (int i=0; i<4;i++){
                //Dealer gives 4 cards for each player
                player.playerCards[i] = playingGround.dealer.deck.get(0);
                //Dealer removes the distributed card from the deck
                playingGround.dealer.deck.remove(0);
            }
            playerIndex++;
        }
        return playingGround;
    }
}
