package ru.ssau.tk.groupId.Points;

public class Person2 {
    private String firstname;
    private String lastname;
    private int passportId;

    public Person2(String FirstName, String LastName, int PassportId) {   // конструктор с тремя параметрами.
        firstname = FirstName;
        lastname = LastName;
        passportId = PassportId;
    }

    public Person2() { // конструктор без параметров.
    }

    public Person2(String FirstName, String LastName) {
        firstname = FirstName;
        lastname = LastName;
    }

    public Person2(int PassportId) {
        passportId = PassportId;
    }

    public void print() {
        System.out.print(firstname);
        System.out.print(lastname);
        System.out.println(passportId);
    }

    public static void main(String[] args) {
        Person2 person1 = new Person2();
        Person2 person2 = new Person2(2002);
        Person2 person3 = new Person2("Ivan ", "Chuhmanov ");
        Person2 person4 = new Person2("ivan ", "Chuhmanov ", 2002);
        person3.print();
        person1.print();
        person3.print();
        person4.print();
    }
}
