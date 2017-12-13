package impl;

public class Profesor extends Staff {
    public Profesor(String text) {
        super( text );
    }

    @Override
    public String getRoleName() {
        return "Profesor";
    }
}
