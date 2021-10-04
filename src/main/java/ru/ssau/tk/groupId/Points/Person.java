package ru.ssau.tk.groupId.Points;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    public Person() {

    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getPassportId() {

        return passportId;
    }

    public void setFirstName(String FirstName) {

        this.firstName = FirstName;
    }

    public void setLastName(String LastName) {

        this.lastName = LastName;
    }

    public void setPassportId(int PassportId) {

        this.passportId = PassportId;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setFirstName("ivan ");
        p1.setLastName("chuhmanov ");
        p1.setPassportId(2002);
        p2.setFirstName("Гоголь ");
        p2.setLastName("Gogol ");
        p2.setPassportId(2000);
        System.out.print(p1.getFirstName());
        System.out.print(p1.getLastName());
        System.out.println(p1.getPassportId());
        System.out.print(p2.getFirstName());
        System.out.print(p2.getLastName());
        System.out.println(p2.getPassportId());
    }
}
