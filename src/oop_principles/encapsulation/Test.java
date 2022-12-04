package oop_principles.encapsulation;

public class Test {
    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();

        //accountHolder.firstName = "John";

        accountHolder.setFirstName("John", "1234");
        System.out.println(accountHolder.getFirstName("234"));



        //accountHolder.lastName = "Doe";
        //accountHolder.address = "Chicago";
        //accountHolder.phoneNumber = "(000)-000-0000";
        // accountHolder.SSN = "000-00-0000";

        // accountHolder.SSN = "111-11-1111";

        //accountHolder.setSSN("000-00-0000");

        //accountHolder.setBalance(3433);
        //accountHolder.getBalance();

        //System.out.println(accountHolder.getSSN());
        //System.out.println(accountHolder);
    }
}
