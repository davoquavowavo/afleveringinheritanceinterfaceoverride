public class NewSchoolRap extends RapSong implements Rap{
    public NewSchoolRap(String name, int bpm, boolean soundsGood) {
        super(name, bpm, soundsGood);
    }

    @Override
    public void play() {
        System.out.println("Playing new school rap");
    }
}
