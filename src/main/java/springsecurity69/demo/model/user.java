package springsecurity69.demo.model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

@javax.persistence.Entity
public class user {
    @javax.persistence.Id
    private String username;
    private String password;

    public String getUsername() {
        return username;
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

    public user() {
    }

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
