public class Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("1500X", "Asus",
                "800");

        Monitor theMonitor = new Monitor("60\" Predator Ultra-Wide", "Predator",
                60, "2560 x 1440");

        MotherBoard theMotherboard = new MotherBoard("ZX1000", "Asus",
                4, 2, "v1.80");

        PersonalComputer thePC = new PersonalComputer("1500X", "Asus",
                theCase, theMonitor, theMotherboard);


        // Functions are being accessed in other classes but are being accessed through the PC object.
        // This is what composition is and it's difference from inheritance
//        thePC.getMonitor().drawPixelAt(10, 10, "Blue");
//        thePC.getMotherBoard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();


        thePC.powerUp();
    }

}
