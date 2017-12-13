package impl;

import api.Character;
import api.Presence;

import java.util.ArrayList;
import java.util.List;

public class PresenceImpl implements Presence {
    private Group group;
    private List <Staff> presentsStaff;

    public PresenceImpl(Group group) {
        this.group = group;
        presentsStaff = new ArrayList <>();
    }

    @Override
    public boolean isPresent(Character character) {
        return presentsStaff.contains( character );
    }

    @Override
    public void check() {
        group.students().forEach( s -> {
            if (Math.random() > 0.3) presentsStaff.add( s );
        } );

    }
    public void check1() {
        group.profesor().forEach( s -> {
            if (Math.random() > 0.5) presentsStaff.add( s );
        } );

    }
}
