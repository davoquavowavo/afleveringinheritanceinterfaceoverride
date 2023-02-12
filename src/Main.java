public class Main {
    public static void main(String[] args) {
        System.out.println("System working!");

        //Inheritance 1
        Laptop macintosh = new Laptop("Mac", 16, "grey", false, 50);
        macintosh.turnOn();
        macintosh.flash();
        macintosh.playMusic();

Smartphone loll = new Smartphone("iPhone", 8, "dark grey", true, "black");

        loll.turnOn();
        loll.flash();
        loll.call();

        //Modelling
        //Modelling er i "School" classen :-)


        //Interface 1
        FastFoodObject clubSandwich = new Sandwich("Clubby", "spicy", 10, false, "rye");

        FastFoodObject margarita = new Pizza("Margy", "sweet", 16, true, true);


        clubSandwich.getName();
        margarita.getSize();

        FastFood[] fastFoods = {clubSandwich, margarita};
        for (FastFood fastFood: fastFoods) {
            System.out.println(fastFood.getName());
            System.out.println(fastFood.getSize());
        }

        //Interface 2
        Car nissan = new Car("Ludwig", "white");
        Car volvo = new Car("Bex", "blue");

        nissan.applyBrakes(14);

        volvo.changeGear(15);

        volvo.speedUp(8);

        //Override
        RapSong yoMan = new OldSchoolRap("Yo, Man", 80, false);

        RapSong whaddupMan = new NewSchoolRap("Whaddup, Man!", 99, false);

        yoMan.play();

        whaddupMan.play();

    }
}