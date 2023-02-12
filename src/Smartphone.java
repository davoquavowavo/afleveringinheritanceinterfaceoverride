public class Smartphone extends Computer{
    String cover;

    public Smartphone(String name, int memory, String color, boolean isHandheld, String cover){
        super(name, memory, color, isHandheld);
        this.name = name;
        this.memory = memory;
        this.color = color;
        this.isHandHeld = isHandheld;
        this.cover = cover;
        System.out.println("This is a(n) " + name);
    }
    @Override
    public void turnOn(){
        System.out.println(name + " with the " + cover + " cover " + " has been turned on");
    }

    @Override
    public void flash(){
        System.out.println(name + " with the " + cover + " cover " + " has flashed its screen!");
    }


    public void call() {
        System.out.println( name + " is calling a random person! :o");
    }
}
