package model;

/**
 * Created by darya on 11/12/14.
 */
import javax.persistence.*;


@Entity (name = "users")
// @Table
public class User {

    @Id
  //  @GeneratedValue
    public int userId;

    @Column(unique = true)
    public String email;
    //  @JsonIgnore
    public String password;
    public int phone;
    public String fName;
    public String sName;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPhone(int phone) {
        String phonestring = Integer.toString(phone);
        if (phonestring.length() == 10) {
            this.phone = phone;
        }
    }

    public int getPhone() {
        return phone;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsName() {
        return sName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
