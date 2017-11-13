public class Person {

    private String name;
    private String surname;
    private int age;
    private double height;

    public Person() {

    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public void setName(String name) {
       this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;

    }

    public String getSurnamee() {
        return surname;
    }

    @Override
    public String toString() {
        String s = "age: "+age + " name: " +name+ "\n";
        return s;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Person p1) {
        return  this.name == p1.name;
    }
}
