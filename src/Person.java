/**
 * Person
 */
public class Person {
    String name;
    String address;

    public Person(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public Person() {
        super();
    }

    void greeting() {
        System.out.println("hello " + this.name + ". ");
        System.out.println("I, come from " + this.address + ". ");
    }

}