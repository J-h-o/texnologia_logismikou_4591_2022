public class UserDb {

    private String username = "";
    private String password = "";

    public UserDb(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Change password in database
    // @param username, the username of the user changing the password
    // @param password, the new password
    // @returns true if password has changed, false otherwise (e.g. user not found)
    boolean changePassword(String username, String password) {
        if(this.username.equals(username)) {
            this.password = password;
            return true;
        } else return false;
    }
}