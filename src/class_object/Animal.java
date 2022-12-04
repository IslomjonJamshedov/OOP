package class_object;

public class Animal {

    public Animal() {

    }
    public Animal(String name, int age){
        System.out.println("This is a 2-Args constructor");
    this.name = name;
    this.age = age;
    }

    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore){
        this(name,age);
        System.out.println("This is 5 args constructor");
        this.name = name;
        this.age = age;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    //Create a constructor that takes 2 args -> name and age
    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;



    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal("Dog",3);
        Animal a3 = new Animal("Cow",5);

        System.out.println(a2.name);
        System.out.println(a2.age);
        System.out.println(a3.name);
        System.out.println(a3.age);

        Animal a5 = new Animal("Tiger", 10, true, false, false);
        Animal a6 = new Animal("Cow", 5, false, true, false);
        Animal a7 = new Animal("Cat", 2, false, false, true);

        System.out.println("\n-----------Printing the object--------\n");
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);


        System.out.println("\n----------static instance variables----------\n");
        System.out.println();
    }
}
