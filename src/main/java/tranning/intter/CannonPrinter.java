package tranning.intter;

public class CannonPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println("Cannon printer printed " + text);
    }
}
