public class carmain {
    public static void main(String[]argc){
        carclass Audi = new carclass("Hatchback","Audio A3","White",230);
        Audi.printInfo();
        carclass BMW = new carclass();
        BMW.type = "Hatchback";
        BMW.model = "BMW 118i M Sport";
        BMW.color = "Black";
        BMW.speed = 215;
        BMW.printInfo();

/*
        carclass BMW = new carclass();
        BMW.model = "BMW 118i M Sport";
        BMW.speed = 215;
        System.out.println(BMW.model);
        System.out.println(BMW.speed);
*/

    }
}
