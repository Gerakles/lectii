package impl;

import api.Character;

public class Person implements Character {
    private String firstName;
    private String lasttName;
    private int age;

    public Person(String text) {
        String[] data = text.split(" ");
        firstName = data[0];
        lasttName = data[1];
        age = Integer.parseInt(data[2]);
    }

    @Override
    public String getfirstName() {
        return firstName;
    }

    @Override
    public String getlastName() {
        return lasttName;
    }

    @Override
    public int getage() {
        return age;
    }
}
