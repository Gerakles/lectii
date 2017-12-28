package Clase;

import impl.NotStartedException;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Cody cody;
    private int NumberofRan;
    private List <Ran> listofRan;

    public Course(Cody cody, int numberofRan) {
        this.cody = cody;
        NumberofRan = numberofRan;
    }

    public void start() {
        listofRan = new ArrayList <>();
        for (int i = 0; i < NumberofRan; i++) {
            Ran ran = new Ran( cody );
            Ran.start();
            listofRan.add( ran );
        }
    }

    public void rany() {
        checkStarted();
        for (Ran ran : listofRan);
    }

    private void checkStarted() {
        if (listofRan == null) {
            throw new NotStartedException();
        }
    }

    public void totals() {
    }
}
