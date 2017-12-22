package tranning.abstr;

public class FranchuzKursant extends Institute implements InstituteInterface {

    @Override
    public void run() {
        System.out.println("Fr run");
    }

    @Override
    void serve() {
        System.out.println("Fr serve");
    }

    @Override
    void something() {

    }

    @Override
    public void serveInterface() {

    }
}
