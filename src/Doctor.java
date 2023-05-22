public class Doctor extends Person {

    String specialist;

    public Doctor() {
        super();
    }

    public Doctor(String name, String address, String specialist) {
        super(name, address);
        this.specialist = specialist;
    }

    void surgerry() {
        System.out.println("i can surgery operation patients");
    }

    @Override
    void greeting() {
        System.out.println("hello my name is " + this.name + ".");
        System.out.println("i came from " + this.address + ".");
        System.out.println("my occupation is a " + this.specialist + " Doctor");
    }
}
