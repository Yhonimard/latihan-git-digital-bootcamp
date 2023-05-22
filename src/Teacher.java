public class Teacher extends Person {
    String subject;

    public Teacher() {

    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    void teaching() {
        System.out.println("i can teach " + this.subject + ", so anyone how wants to learn can talk to me.");
    }

    @Override
    void greeting() {
        System.out.println("hello my name is " + this.name + ".");
        System.out.println("i came from " + this.address + ".");
        System.out.println("my  job is a " + this.subject + " teacher");
    }
}
