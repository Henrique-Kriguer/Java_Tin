public class Main {

    public static void main(String[] args) {

        ComputerCase theCase= new ComputerCase("DF2", "DarkFlash",
                "650w");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",27,
                "2540 x 1440");

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer myPc = new PersonalComputer("DF","I myself",
                theMonitor,theMotherboard,theCase );

        myPc.powerUp();
        
//        myPc.getMonitor().drawPixelAt(1500, 1200, "red");
//        myPc.getMotherboard().loadProgram("Windows 10");
//        myPc.getComputerCase().pressPowerButton();
    }
}