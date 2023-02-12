public abstract class RapSong implements Rap {

    String name;
    int bpm;

    boolean soundsGood;

    public RapSong(String name, int bpm, boolean soundsGood){
        this.name = name;
        this.bpm = bpm;
        this.soundsGood = soundsGood;
    }


}
