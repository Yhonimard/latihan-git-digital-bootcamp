
public class AppMain {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();
        person1.name = "Yhoni";
        person1.address = "bandung";

        Teacher teacher1 = new Teacher();
        teacher1.name = "yhonimard";
        teacher1.address = "tanggerang";
        teacher1.subject = "IPA";

        Doctor doctor1 = new Doctor();
        doctor1.name = "Yohan";
        doctor1.address = "magelang";
        doctor1.specialist = "GIGI";

        Doctor doctor2 = new Doctor("joko", "lampung", "Ginjal");

        System.out.println();
        doctor1.greeting();
        System.out.println();
        doctor2.greeting();
        System.out.println();

        Programmer programmer1 = new Programmer();
        programmer1.name = "Mumtaz";
        programmer1.address = "Ngawi";
        programmer1.technology = "javascript";

        person1.greeting();
        System.out.println();
        teacher1.greeting();
        System.out.println();
        doctor1.greeting();
        System.out.println();
        programmer1.greeting();

    }
}
