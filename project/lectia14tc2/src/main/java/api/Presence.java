package api;

import api.Character;

public interface Presence {
    boolean isPresent (Character character);
    void check();
}
