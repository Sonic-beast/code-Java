public interface Playable {
    public void play();
    default void stop(){
        System.out.println("Stop the Audio.");
    }
    public static void main(String args[]){
        Playable videoplayer = new videoPlayer();
        Playable audioplayer = new audioPlayer();

        videoplayer.play();
        audioplayer.play();

        videoplayer.stop();
        audioplayer.stop();



    }
}
class videoPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("Play Video");
    }
    public void stop(){
        System.out.println("Stoping the Video...");
    }

}
class audioPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("Play Audio");
    }
}