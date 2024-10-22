public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal("Generic Animal", "huge", 20.0);
        doAnimalStuff(animal,"slow" );

        Dog rex = new Dog("pastor",  25.0, "pequena","comprido");
        doAnimalStuff(rex,"fast");

        Dog yorkie = new Dog ("yorkie",20);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog ("labrador", 65.0, "floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog ("Wolf", 40.0);
        doAnimalStuff(wolf, "fast");

        Fish goldie = new Fish("small", 0.25,2, 1);
        doAnimalStuff(goldie,"fast");
    }
    public static void doAnimalStuff( Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("---------------");
    }





}