public interface IPlayer {
    public static Player createUsualPlayer(String name, double betInDollars ){
        return new UsualPlayer(name,betInDollars);
    }

    public static Player createBlackJackPlayer(String name, double betInDollars) {
        return new BlackJackPlayer(name,betInDollars);
    }
}