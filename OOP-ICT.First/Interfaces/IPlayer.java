public interface IPlayer {
    public Player createUsualPlayer(String name, double betInDollars ){
        return new UsualPlayer(name,betInDollars);
    }
}