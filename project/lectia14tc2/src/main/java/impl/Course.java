package impl;

import impl.Group;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Group group;
    private int NumberofLessons;
    private List <Lesson> listofLessons;

    public Course(Group group, int NumberofLesson) {
        this.NumberofLessons = NumberofLesson;
        this.group = group;
    }

    public void start() {
        listofLessons = new ArrayList <>();
        for (int i = 0; i < NumberofLessons; i++) {
            Lesson lesson = new Lesson( group );
            lesson.start();
            listofLessons.add( lesson );
        }


    }

    public void printLessons() {
        for (Lesson lesson : listofLessons) {
            lesson.print();
        }
    }
}
