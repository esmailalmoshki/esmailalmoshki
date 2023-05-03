import java.util.ArrayList;
import java.util.List;

public class Deck extends ArrayList<PlayingCard> {
    public Deck() {
        for (CardType cardType : CardType.values()) {
            for (Numerics numerics : Numerics.values()){
                this.add(new PlayingCard(numerics, cardType));
            }
        }
    }

}