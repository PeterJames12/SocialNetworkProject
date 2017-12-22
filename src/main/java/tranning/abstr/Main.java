package tranning.abstr;

public class Main {

    public static void main(String[] args) {

        Institute institute = new FranchuzKursant();
        institute.run();
        institute.serve();

        // name                 // age
        Kursant   kursantIgor = new Kursant();

        Kursant.name = "Igor";
        kursantIgor.age = 22;

        Kursant kursantFrantsuz = new Kursant();

        Kursant.name = "Frantsuz";
        Kursant.name = "Frantsuz2 ";
        kursantFrantsuz.age = 21;

        System.out.println(Kursant.name);
        System.out.println(kursantIgor.age);

        System.out.println(Kursant.name);
        System.out.println(kursantFrantsuz.age);


        new Kursant().some2();

    }
}
