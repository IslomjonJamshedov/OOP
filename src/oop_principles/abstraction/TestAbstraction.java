package oop_principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

        //Phone.call(): abstract cannot be static
        /*
        Abstract class cannot be instantiated - cannot have
        Phone phone = new Phone();
        phone.call();
        */

        System.out.println("\n------Samsung------\n");
        Samsung s1 = new Samsung();
        s1.text();
        s1.call();

        System.out.println("\n------iPhone------\n");
        iPhone i1 = new iPhone();
        i1.text();
        i1.call();

        Samsung s2 = new Samsung(64, "Galaxy S20", "Black", 700);
        iPhone i2 = new iPhone(250, "Iphone 14", "Gold", 1200);

        System.out.println(s2);
        System.out.println(i2);

        Nokia n1 = new Nokia();
    }
}
