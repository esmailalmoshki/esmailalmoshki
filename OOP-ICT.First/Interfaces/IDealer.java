public interface IDealer {
    //better make a class for Dealer, PlayingGround, Player;

    public Dealer createUsualDealer(){
        return new UsualDealer(String name,null);
    }
}