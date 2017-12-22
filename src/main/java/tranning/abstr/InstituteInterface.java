package tranning.abstr;

public interface InstituteInterface {

    void serveInterface();

    default void somethingInterface() {
        System.out.println(" i am default method");
        System.out.println(" i am default method");
        System.out.println(" i am default method");
        System.out.println(" i am default method");
    }
}
