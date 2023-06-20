public abstract class Dealer{


    public Deck deck = new Deck();
    public String name;

    public Dealer(String name) {

    }

    public abstract PlayingGround distribute(PlayingGround playingGround);

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


}