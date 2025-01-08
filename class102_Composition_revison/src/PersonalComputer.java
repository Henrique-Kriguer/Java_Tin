public class PersonalComputer extends Product{

    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer,
                            Monitor monitor, Motherboard motherboard,
                            ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

   private void drawLogo(){
        monitor.drawPixelAt(1200,35,"green");
        }

   private void loadProgram(String programName){
        motherboard.loadProgram(programName);
    }

    private void pressPowerButton(){
        computerCase.pressPowerButton();
    }

   public void powerUp(){
        pressPowerButton();
        drawLogo();
        loadProgram("Windows 10");
    }




//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
}
