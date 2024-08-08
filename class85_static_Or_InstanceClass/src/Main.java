public class Main {
    public static void main(String[] args) {

        Calculator.calculator(2,5); // call static method in a static class
        sayHello();                       // call static method in same class

        Dog rex = new Dog();  // create instance
        rex.bark();           // call instance method
    }
    public static void sayHello(){
        System.out.println("Hello !");
    }
}