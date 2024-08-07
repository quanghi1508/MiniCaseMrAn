package model;

public class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {

        return username;
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  String convertData()   {
        return "" + username + "," + password + "," + role;
    }



    @Override
    public String toString() {
        return
                "username: " + username + '\n' +
                "password: " + password + '\n' +
                "role: " + role + '\n';
    }
}
