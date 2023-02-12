abstract class Computer {

    String name;
    int memory;

    String color;

    boolean isHandHeld;


    abstract void turnOn();

    abstract void flash();





    public Computer(String name, int memory, String color, boolean isHandHeld){
        this.name = name;
        this.memory = memory;
        this.color = color;
        this.isHandHeld = isHandHeld;
    };


}
