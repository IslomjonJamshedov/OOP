package oop_principles.encapsulation;

public class AccountHolder {

    String firstName;
    String lastName;
    String address;
    String phoneNumber;

   public String getFirstName(String passcode){
       if (passcode.equals("1234")) return firstName;
       else{
           System.out.println("The passcode is wrong");


       }return null;
   }
   public void setFirstName(String firstName, String passcode){
       if (passcode.equals("1234")) this.firstName = firstName;
       else this.firstName = null;
   }


    private String SSN;
    private double balance;

    public String getSSN (){
        return this.SSN;
    }

    public void setSSN(String SSN){
        this.SSN = SSN;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "AccountHolder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", SSN='" + SSN + '\'' +
                ", balance=" + balance +
                '}';
    }
}
