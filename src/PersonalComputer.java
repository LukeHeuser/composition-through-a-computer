public class PersonalComputer extends Product {

    // the following fields is utilizing composition. A computer, Has A, ---
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase, Monitor monitor,
                            MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }


    private void drawLogo() {
        monitor.drawPixelAt(1200,100, "Orange");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

    // Commented out to further hide this information.

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
