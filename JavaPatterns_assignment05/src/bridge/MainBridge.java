package bridge;

public class MainBridge {

    public static void main(String[] args) {
        Epson epson = new Epson();
        Mac mac = new Mac();
        mac.setPrinter(epson);

        mac.print();
        epson.printFile();
    }
}
