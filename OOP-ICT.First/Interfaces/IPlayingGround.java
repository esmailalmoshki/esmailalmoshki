public class IPlayingGroundFactory {
    public PlayingGround  createUsualPlayingGround(Player[] players , UsualDealer usualDealer){
        return new UsualPlayingGround(players, usualDealer) ;
    }
}
