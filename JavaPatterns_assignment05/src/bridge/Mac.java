package bridge;

import bridge.Computer;

public class Mac implements Computer {

    Printer printer;

    @Override
    public void print() {
        System.out.println("printed on mac");
    }

    @Override
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
