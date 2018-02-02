package api;

public interface Authorization {
    boolean hasAccess(String Role, String Resource);
}
