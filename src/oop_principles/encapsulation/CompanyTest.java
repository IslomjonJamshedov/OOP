package oop_principles.encapsulation;

public class CompanyTest {
    public static void main(String[] args) {

        Company company1 = new Company();
        Company company2 = new Company();



        company1.setName("Apple");
        company1.setAddress("California");
        company1.setPhone("(123) 321-2345");

        company2.setName("Google");
        company2.setAddress("California");
        company2.setPhone("(000) 555 5555");

        System.out.println("Company 1 is \n= " + company1.getName());
        System.out.println("Company 2 is " + company2.getName());

    }
}
