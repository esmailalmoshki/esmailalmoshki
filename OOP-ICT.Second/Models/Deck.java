import java.util.ArrayList;

public class Deck extends ArrayList<PlayingCard> {
    public Deck Deck() {
        for (CardType cardType : CardType.values()) {
            for (Numerics numerics : Numerics.values()){
                this.add(new PlayingCard(numerics, cardType));
            }

        }
        return this;

    }

}