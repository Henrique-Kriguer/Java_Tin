public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal("Generic Animal", "huge", "400");
        doAnimalStuff(animal,"slow" );

        Dog rex = new Dog("pastor", "huge", "50 kg", "pequena","comprido");
        doAnimalStuff(rex,"fast");
    }
    public static void doAnimalStuff( Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("---------------");
    }

}