public class OldSchoolRap extends RapSong implements Rap{



    public OldSchoolRap(String name, int bpm, boolean soundsGood) {
        super(name, bpm, soundsGood);
    }

    @Override
    public void play() {
        System.out.println("Playing old school rap");
    }
}
