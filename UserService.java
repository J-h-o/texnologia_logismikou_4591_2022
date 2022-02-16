public class UserService {

    private UserDb user = null;

    public UserService(UserDb user) {
        this.user = user;
    }

    public UserService() {
    }

    // Checks password conforms to security constraints. If so, updates the password in database
    // @param username, the username of the user changing the password
    // @param password, the new password. Must be at least 8 characters long
    // @returns true if password has changed, false otherwise (e.g. weak password or database update failed)
    boolean changePassword(String username, String password) {
        if(password.length() < 8) {
            return false;
        } else return user.changePassword(username, password);
    }
}