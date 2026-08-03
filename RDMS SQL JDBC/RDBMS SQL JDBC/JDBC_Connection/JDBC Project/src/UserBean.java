public class UserBean {

    private String id;
    private String password;
    private String name;
    private int incorrectAttempts;
    private int lockStatus;
    private String userType;

    // Getter and Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for incorrectAttempts
    public int getIncorrectAttempts() {
        return incorrectAttempts;
    }

    public void setIncorrectAttempts(int incorrectAttempts) {
        this.incorrectAttempts = incorrectAttempts;
    }

    // Getter and Setter for lockStatus
    public int getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(int lockStatus) {
        this.lockStatus = lockStatus;
    }

    // Getter and Setter for userType
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}