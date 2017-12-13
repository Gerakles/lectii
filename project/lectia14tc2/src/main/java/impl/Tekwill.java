package impl;

import impl.Staff;
import impl.Student;

import java.util.ArrayList;
import java.util.List;

public class Tekwill {public static void main(String[] args) {
    List<Staff> staffList = new ArrayList<>();
    staffList.add(new Profesor("Denis B 30"));
    staffList.add(new Profesor("Radu J 28"));
    staffList.add(new Profesor("Andrei F 28"));
    staffList.add(new Profesor("Vitalie D 44"));
    staffList.add(new Student("Sergiu S 30"));
    staffList.add(new Student("Serghei P 24"));
    staffList.add(new Student("Iulian Iulian 30"));
    staffList.add(new Student("Iachimciuc Bogdan 19"));

    Group group = new Group(staffList);
    Course courseOCA = new Course(group, 10);

    courseOCA.start();
    courseOCA.printLessons();
//    courseOCA.printPresence();
}
}
