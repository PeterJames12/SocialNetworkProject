package tranning.intter;

public class MacPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println("Mac printer printed " + text);
    }
}
