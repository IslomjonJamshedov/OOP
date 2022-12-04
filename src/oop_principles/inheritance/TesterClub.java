package oop_principles.inheritance;

import oop_principles.encapsulation.Employee;

import java.util.Arrays;

public class TesterClub {
    public static void main(String[] args) {
        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);
        BackendTester bt1 = new BackendTester("John", 45, "1982", "111",false);

        FrontendTester ft2 = new FrontendTester("Jane", 29, "1995", "999", false);
        BackendTester bt2 = new BackendTester("Jerry", 36, "1980", "345",false);



        Tester[] testers = {ft1, ft2,bt1,bt2}; // Polymorphic Array

        /*
        Manual testers = 3
        Automation testers = 1
        Average age = 33
         */
        int countManualTesters = 0, countAutomationTester = 0, sumAge = 0;

        for (Tester tester : testers){
            if (!tester.isAutomationTester)countManualTesters++;
            else countAutomationTester++;

            sumAge += tester.age;
        }

        System.out.println("Manual testers = " + countManualTesters);
        System.out.println("Automation testers = " + countAutomationTester);
        System.out.println("Average age = " + sumAge / 4);


        //Counting with Stream Method
        System.out.println("Automation testers = " +Arrays.stream(testers).filter(x -> x.isAutomationTester).count());
        System.out.println("Manual testers = " + Arrays.stream(testers).filter(x -> !x.isAutomationTester).count());


    }
}
