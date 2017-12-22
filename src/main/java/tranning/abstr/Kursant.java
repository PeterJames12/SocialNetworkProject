package tranning.abstr;

public class Kursant extends Institute implements InstituteInterface {

    public static String name = "Igor";
    public int age = 22;

    public static void some() {

    }

    public void some2() {

    }


    @Override
    public void somethingInterface() {

    }


    @Override
    public void run() {
        System.out.println("Igor run");
    }

    @Override
    void serve() {
        System.out.println("Igor serve");
    }

    @Override
    void something() {

    }

    @Override
    public void serveInterface() {

    }
}
