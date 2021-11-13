package bridge;

public class Epson implements Printer {
    @Override
    public void printFile() {
        System.out.println("Printing by a EPSON Printer.");
    }
}
