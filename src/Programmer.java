public class Programmer extends Person {
    String technology;

    public Programmer() {

    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    void coding() {
        System.out.println("i can create application using technology " + this.technology + ". ");
    }

    void hacking() {
        System.out.println("i can hack a website");
    }

    void greeting() {
        super.greeting();
        System.out.println("my job is a " + this.technology + " Programmer");
    }

    // @Override
    // void greeting() {
    // System.out.println("hello my name is " + this.name + ".");
    // System.out.println("i came from " + this.address + ".");
    // }
}
