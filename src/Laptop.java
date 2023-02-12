public class Laptop extends Computer {
    int keyboardButtons;

    public Laptop(String name, int memory, String color, boolean isHandheld, int keyboardButtons){
        super(name, memory, color, isHandheld);
        this.name = name;
        this.memory = memory;
        this.isHandHeld = isHandheld;
        this.keyboardButtons = keyboardButtons;
        System.out.println("This is a(n) " + name);
    }

    @Override
    public void turnOn(){
        System.out.println(name + " has been turned on");
    };

    @Override
    public void flash() {
        System.out.println(name + " has flashed its screen!");
    }

    public void playMusic() {
        System.out.println(name + " is playing a random song! :o");
    }


}
